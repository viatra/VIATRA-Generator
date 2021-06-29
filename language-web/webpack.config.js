const fs = require('fs');
const path = require('path');

const WebpackBeforeBuildPlugin = require('before-build-webpack');
const HtmlWebpackPlugin = require('html-webpack-plugin');
const MiniCssExtractPlugin = require('mini-css-extract-plugin');
const { SubresourceIntegrityPlugin } = require('webpack-subresource-integrity');

const currentNodeEnv = process.env.NODE_ENV || 'development';
const devMode = currentNodeEnv !== 'production';
const outputPath = path.resolve(__dirname, 'build/webpack', currentNodeEnv);

const portNumberOrElse = (envName, fallback) => {
  const value = process.env[envName];
  return value ? parseInt(value) : fallback;
}
const listenHost = process.env['LISTEN_HOST'] || 'localhost';
const listenPort = portNumberOrElse('LISTEN_PORT', 1313);
const apiHost = process.env['API_HOST'] || listenHost;
const apiPort = portNumberOrElse('API_PORT', 1312);
const publicHost = process.env['PUBLIC_HOST'] || listenHost;
const publicPort = portNumberOrElse('PUBLIC_PORT', listenPort);

module.exports = {
  mode: devMode ? 'development' : 'production',
  entry: './src/main/js',
  output: {
    path: outputPath,
    publicPath: '/',
    filename: devMode ? '[name].js' : '[contenthash].js',
    chunkFilename: devMode ? '[id].js' : '[contenthash].js',
    crossOriginLoading: 'anonymous',
  },
  module: {
    rules: [
      {
        test: /\.jsx?$/i,
        include: [path.resolve(__dirname, 'src/main/js')],
        exclude: [path.resolve(__dirname, 'src/main/js/xtext')],
        loader: 'babel-loader',
        options: {
          presets: [
            ['@babel/preset-env', { targets: 'defaults' }],
          ],
        },
      },
      {
        test: /\.scss$/i,
        use: [
          devMode ? 'style-loader' : MiniCssExtractPlugin.loader,
          'css-loader',
          {
            loader: 'sass-loader',
            options: {
              implementation: require.resolve('sass'),
            },
          },
        ]
      },
      {
        test: /\.(gif|png|jpe?g|svg)$/i,
        use: [
          'file-loader',
          {
            loader: 'image-webpack-loader',
            options: {
              disable: true,
            }
          },
        ],
      },
    ],
  },
  resolve: {
    modules: [
      'node_modules',
      path.resolve(__dirname, 'src/main/js'),
      path.resolve(__dirname, 'build/generated/sources/xtext/js'),
    ],
    extensions: ['.js', '.jsx'],
    alias: {
      images: path.resolve(__dirname, 'src/main/images'),
    },
  },
  devtool: devMode ? 'inline-source-map' : 'source-map',
  optimization: {
    splitChunks: {
      chunks: 'all',
    },
  },
  devServer: {
    contentBase: outputPath,
    compress: true,
    host: listenHost,
    port: listenPort,
    proxy: {
      '/xtext-service': `${apiPort === 443 ? 'https' : 'http'}://${apiHost}:${apiPort}`,
    },
    public: `${publicHost}:${publicPort}`,
    sockHost: publicHost,
    sockPort: publicPort,
  },
  plugins: [
    new MiniCssExtractPlugin({
      filename: '[contenthash].css',
      chunkFilename: '[contenthash].css',
    }),
    new SubresourceIntegrityPlugin(),
    new HtmlWebpackPlugin({
      template: 'src/main/html/index.html',
      minify: devMode ? false : {
        collapseWhitespace: true,
        removeComments: true,
        removeOptionalTags: true,
        removeRedundantAttributes: true,
        removeScriptTypeAttributes: true,
        removeStyleLinkTypeAttributes: true,
        useShortDoctype: true,
      },
    }),
    new WebpackBeforeBuildPlugin((stats, callback) => {
      // https://stackoverflow.com/a/40370750
      const newlyCreatedAssets = stats.compilation.assets;
      const unlinked = [];
      fs.readdir(outputPath, (err, files) => {
        files.forEach(file => {
          if (!newlyCreatedAssets[file]) {
            fs.unlinkSync(path.resolve(outputPath, file));
            unlinked.push(file);
          }
        });
        if (unlinked.length > 0) {
          console.log('Removed old assets: ', unlinked);
        }
      });
      callback();
    }, ['done']),
  ],
};
