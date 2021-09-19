module.exports = {
  extends: 'stylelint-config-recommended-scss',
  // Simplified for only :export to TypeScript based on
  // https://github.com/pascalduez/stylelint-config-css-modules/blob/d792a6ac7d2bce8239edccbc5a72e0616f22d696/index.js
  rules: {
    'selector-pseudo-class-no-unknown': [
      true,
      {
        ignorePseudoClasses: [
          'export',
        ],
      },
    ],
  },
};
