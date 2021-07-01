import { observer } from 'mobx-react-lite';
import React from 'react';
import IconButton from '@material-ui/core/IconButton';
import RedoIcon from '@material-ui/icons/Redo';
import UndoIcon from '@material-ui/icons/Undo';

import { useRootStore } from '../RootStore';

export default observer(() => {
  const editorStore = useRootStore().editorStore;
  return (
    <>
      <IconButton
        disabled={!editorStore.canUndo}
        onClick={() => editorStore.undo()}
      >
        <UndoIcon fontSize='small'/>
      </IconButton>
      <IconButton
        disabled={!editorStore.canRedo}
        onClick={() => editorStore.redo()}
      >
        <RedoIcon fontSize='small'/>
      </IconButton>
    </>
  );
});
