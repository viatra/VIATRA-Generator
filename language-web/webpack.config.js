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
};
const listenHost = process.env['LISTEN_HOST'] || 'localhost';
const listenPort = portNumberOrElse('LISTEN_PORT', 1313);
const apiHost = process.env['API_HOST'] || listenHost;
const apiPort = portNumberOrElse('API_PORT', 1312);
const publicHost = process.env['PUBLIC_HOST'] || listenHost;
const publicPort = portNumberOrElse('PUBLIC_PORT', listenPort);

const resolveSources = sources => path.resolve(__dirname, 'src', sources);
const resolveGenerated = sources => path.resolve(__dirname, 'build/generated/sources', sources);
const mainJsSources = resolveSources('main/js');
const babelLoaderFilters = {
  include: [mainJsSources],
  exclude: [resolveSources('main/js/xtext')],
};
const babelPresets = [
  [
    '@babel/preset-env',
    {
      targets: 'defaults',
    },
  ],
  '@babel/preset-react',
];

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
        ...babelLoaderFilters,
        loader: 'babel-loader',
        options: {
          presets: babelPresets,
          plugins: [
            [
              '@babel/plugin-proposal-class-properties',
              {
                loose: false,
              },
            ],
          ],
          assumptions: {
            'setPublicClassFields': false,
          },
        },
      },
      {
        test: /.tsx?$/i,
        ...babelLoaderFilters,
        loader: 'babel-loader',
        options: {
          presets: [
            ...babelPresets,
            [
              '@babel/preset-typescript',
              {
                isTSX: true,
                allExtensions: true,
                allowDeclareFields: true,
                onlyRemoveTypeImports: true,
                optimizeConstEnums: true,
              },
            ]
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
        test: /\.(gif|png|jpe?g|svg?)$/i,
        use: [
          {
            loader: 'image-webpack-loader',
            options: {
              disable: true,
            }
          },
        ],
        type: 'asset',
      },
      {
        test: /\.woff2?$/i,
        type: 'asset/resource',
      },
    ],
  },
  resolve: {
    modules: [
      'node_modules',
      mainJsSources,
      resolveGenerated('xtext/js'),
    ],
    extensions: ['.js', '.jsx', '.ts', '.tsx'],
    alias: {
      images: resolveSources('main/images'),
    },
  },
  devtool: devMode ? 'inline-source-map' : 'source-map',
  optimization: {
    splitChunks: {
      chunks: 'all',
    },
  },
  devServer: {
    client: {
      logging: 'info',
      overlay: true,
      progress: true,
      webSocketURL: {
        hostname: publicHost,
        port: publicPort,
        protocol: publicPort === 443 ? 'wss' : 'ws',
      },
    },
    compress: true,
    host: listenHost,
    port: listenPort,
    proxy: {
      '/xtext-service': `${apiPort === 443 ? 'https' : 'http'}://${apiHost}:${apiPort}`,
    },
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
