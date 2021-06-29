const path = require('path');

const HtmlWebpackPlugin = require('html-webpack-plugin');
const MiniCssExtractPlugin = require("mini-css-extract-plugin");

const devMode = process.env.NODE_ENV !== 'production';
const outputPath = path.resolve(__dirname, 'build/webpack', devMode ? 'development' : 'production');

module.exports = {
  mode: devMode ? 'development' : 'production',
  entry: './src/main/js',
  output: {
    path: outputPath,
    publicPath: '/',
    filename: devMode ? '[name].js' : '[contenthash].js',
    chunkFilename: devMode ? '[id].js' : '[contenthash].js',
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
  devtool: devMode ? 'eval' : 'source-map',
  optimization: {
    splitChunks: {
      chunks: 'all',
    },
  },
  plugins: [
    new MiniCssExtractPlugin({
      filename: '[contenthash].css',
      chunkFilename: '[contenthash].css',
    }),
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
  ],
};
