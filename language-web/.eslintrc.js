// Loosely based on
// https://github.com/iamturns/create-exposed-app/blob/f14e435b8ce179c89cce3eea89e56202153a53da/.eslintrc.js
module.exports = {
  plugins: [
    '@typescript-eslint',
  ],
  extends: [
    'airbnb',
    'airbnb-typescript',
    'airbnb/hooks',
    'plugin:@typescript-eslint/recommended',
    'plugin:@typescript-eslint/recommended-requiring-type-checking',
  ],
  parserOptions: {
    project: './tsconfig.json',
  },
  rules: {
    // https://basarat.gitbooks.io/typescript/docs/tips/defaultIsBad.html
    'import/prefer-default-export': 'off',
    'import/no-default-export': 'error',
    // propTypes are for runtime validation, but we rely on TypeScript for build-time validation:
    // https://github.com/yannickcr/eslint-plugin-react/issues/2275#issuecomment-492003857
    'react/prop-types': 'off',
    // Make sure switches are exhaustive: https://stackoverflow.com/a/60166264
    'default-case': 'off',
    '@typescript-eslint/switch-exhaustiveness-check': 'error',
  },
  ignorePatterns: [
    '*.js',
    'build/**/*',
    'src/main/js/xtext/**/*',
  ],
};
