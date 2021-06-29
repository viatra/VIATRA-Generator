import xtext from 'xtext/xtext-codemirror';
import 'mode-problem';

import '../css/index.scss';

xtext.createEditor({
  baseUrl: '/',
  xtextLang: 'problem',
  enableFormattingAction: true,
  sendFullText: false,
  indentUnit: 2,
});
