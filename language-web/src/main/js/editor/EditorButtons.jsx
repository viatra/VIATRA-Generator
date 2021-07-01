import { observer } from 'mobx-react-lite';
import React from 'react';
import { makeStyles } from '@material-ui/core/styles';
import Button from '@material-ui/core/Button';
import ButtonGroup from '@material-ui/core/ButtonGroup';
import Divider from '@material-ui/core/Divider';
import FormatListNumberedIcon from '@material-ui/icons/FormatListNumbered';
import RedoIcon from '@material-ui/icons/Redo';
import UndoIcon from '@material-ui/icons/Undo';
import ToggleButton from '@material-ui/lab/ToggleButton';
import { useRootStore } from '../RootStore';

const useStyles = makeStyles(theme => ({
  iconButton: {
    padding: 8,
    minWidth: 36,
    '&.MuiButtonGroup-groupedTextHorizontal': {
      borderRight: 0,
    },
  },
  flatToggleButton: {
    padding: 8,
    border: 0,
    color: theme.palette.text.primary,
  },
  divider: {
    margin: theme.spacing(0.5),
  }
}));

export default observer(() => {
  const editorStore = useRootStore().editorStore;
  const classes = useStyles();
  return (
    <>
      <ButtonGroup
        variant='text'
      >
        <Button
          disabled={!editorStore.canUndo}
          onClick={() => editorStore.undo()}
          className={classes.iconButton}
        >
          <UndoIcon fontSize='small'/>
        </Button>
        <Button
          disabled={!editorStore.canRedo}
          onClick={() => editorStore.redo()}
          className={classes.iconButton}
        >
          <RedoIcon fontSize='small'/>
        </Button>
      </ButtonGroup>
      <Divider
        flexItem
        orientation='vertical'
        className={classes.divider}
      />
      <ToggleButton
        value='Show line numbers'
        selected={editorStore.showLineNumbers}
        onChange={() => editorStore.toggleLineNumbers()}
        size='small'
        className={classes.flatToggleButton}
      >
        <FormatListNumberedIcon fontSize='small'/>
      </ToggleButton>
    </>
  );
});
