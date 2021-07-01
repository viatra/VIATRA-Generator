import { observer } from 'mobx-react-lite';
import 'mode-problem';
import React, { useCallback } from 'react';
import { Controlled as CodeMirror } from 'react-codemirror2';
import { createServices, removeServices } from 'xtext/xtext-codemirror';

import { useRootStore } from '../RootStore';

export default observer(() => {
  const editorStore = useRootStore().editorStore;

  const codeMirrorOptions = {
    mode: 'xtext/problem',
    indentUnit: 2,
    theme: 'material-darker',
    lineNumbers: editorStore.showLineNumbers,
  };

  const xtextOptions = {
    xtextLang: 'problem',
    enableFormattingAction: true,
  }

  const editorDidMount = useCallback((editor) => {
    createServices(editor, xtextOptions);
    editorStore.updateEditor(editor);
  }, [editorStore]);

  const editorWillUnmount = useCallback((editor) => {
    editorStore.editor = null;
    removeServices(editor);
  }, [editorStore]);

  const onBeforeChange = useCallback((_editor, _data, value) => {
    editorStore.updateValue(value);
  }, [editorStore]);

  const onChange = useCallback((_editor, _data, _value) => {
    editorStore.reportChanged();
  }, [editorStore]);

  return (
    <CodeMirror
      value={editorStore.value}
      options={codeMirrorOptions}
      editorDidMount={editorDidMount}
      editorWillUnmount={editorWillUnmount}
      onBeforeChange={onBeforeChange}
      onChange={onChange}
    />
  );
});
