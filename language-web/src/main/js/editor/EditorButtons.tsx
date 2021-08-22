import { observer } from 'mobx-react-lite';
import React from 'react';
import Button from '@material-ui/core/Button';
import ButtonGroup from '@material-ui/core/ButtonGroup';
import ToggleButton from '@material-ui/core/ToggleButton';
import Divider from '@material-ui/core/Divider';
import FormatListNumberedIcon from '@material-ui/icons/FormatListNumbered';
import RedoIcon from '@material-ui/icons/Redo';
import UndoIcon from '@material-ui/icons/Undo';

import { makeStyles } from '../makeStyles';
import { useRootStore } from '../RootStore';

const useStyles = makeStyles()((theme) => ({
  iconButton: {
    padding: 7,
    border: 0,
    color: theme.palette.text.primary,
    '&, &.MuiButtonGroup-grouped': {
      minWidth: 36,
    },
    '&.MuiButtonGroup-grouped:not(:last-of-type)': {
      borderRight: 0,
    },
  },
  divider: {
    margin: theme.spacing(0.5),
  },
}));

export const EditorButtons = observer(() => {
  const { editorStore } = useRootStore();
  const { classes, cx } = useStyles();

  return (
    <>
      <ButtonGroup
        variant="text"
      >
        <Button
          disabled={!editorStore.canUndo}
          onClick={() => editorStore.undo()}
          className={cx(classes.iconButton)}
          color="inherit"
          aria-label="Undo"
        >
          <UndoIcon fontSize="small" />
        </Button>
        <Button
          disabled={!editorStore.canRedo}
          onClick={() => editorStore.redo()}
          className={cx(classes.iconButton)}
          color="inherit"
          aria-label="Redo"
        >
          <RedoIcon fontSize="small" />
        </Button>
      </ButtonGroup>
      <Divider
        flexItem
        orientation="vertical"
        className={classes.divider}
      />
      <ToggleButton
        selected={editorStore.showLineNumbers}
        onChange={() => editorStore.toggleLineNumbers()}
        size="small"
        className={cx(classes.iconButton)}
        aria-label="Show line numbers"
        value="show-line-numbers"
      >
        <FormatListNumberedIcon fontSize="small" />
      </ToggleButton>
    </>
  );
});
