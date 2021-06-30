import React, { useCallback, useState } from 'react';
import { Controlled as CodeMirror } from 'react-codemirror2';
import 'mode-problem';
import { createServices, removeServices } from 'xtext/xtext-codemirror';

export default function XtextCodeMirror({ initialValue }) {
  const [value, setValue] = useState(initialValue);

  const codeMirrorOptions = {
    mode: 'xtext/problem',
    indentUnit: 2,
  };

  const xtextOptions = {
    xtextLang: 'problem',
    enableFormattingAction: true,
  };

  const onBeforeChange = useCallback((_editor, _data, newValue) => {
    setValue(newValue);
  }, [setValue]);

  return (
    <CodeMirror
      value={value}
      options={codeMirrorOptions}
      editorDidMount={editor => createServices(editor, xtextOptions)}
      editorWillUnmount={removeServices}
      onBeforeChange={onBeforeChange}
    />
  );
};
