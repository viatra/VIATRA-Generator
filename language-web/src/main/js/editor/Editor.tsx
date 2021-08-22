import { observer } from 'mobx-react-lite';
import React from 'react';
import { Controlled as CodeMirror } from 'react-codemirror2';

import { useRootStore } from '../RootStore';

export default observer(() => {
  const { editorStore } = useRootStore();

  return (
    <CodeMirror
      value={editorStore.value}
      options={editorStore.codeMirrorOptions}
      editorDidMount={(editor) => editorStore.editorDidMount(editor)}
      editorWillUnmount={() => editorStore.editorWillUnmount()}
      onBeforeChange={(_editor, _data, value) => editorStore.updateValue(value)}
      onChange={() => editorStore.reportChanged()}
    />
  );
});
