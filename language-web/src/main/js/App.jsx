import React from 'react';
import { makeStyles } from '@material-ui/core/styles';
import AppBar from '@material-ui/core/AppBar';
import Box from '@material-ui/core/Box';
import Fab from '@material-ui/core/Fab';
import IconButton from '@material-ui/core/IconButton';
import Toolbar from '@material-ui/core/Toolbar';
import Typography from '@material-ui/core/Typography';
import MenuIcon from '@material-ui/icons/Menu';
import PlayArrowIcon from '@material-ui/icons/PlayArrow';

import Editor from './editor/Editor';
import EditorButtons from './editor/EditorButtons';

const useStyles = makeStyles(theme => ({
  menuButton: {
    marginRight: theme.spacing(2),
  },
  title: {
    flexGrow: 1,
  },
  fab: {
    position: 'fixed',
    right: theme.spacing(3),
    bottom: theme.spacing(3),
    zIndex: 1000,
  },
  extendedIcon: {
    marginRight: theme.spacing(1),
  }
}));

export default () => {
  const classes = useStyles();

  return (
    <>
      <AppBar
        position='static'
      >
        <Toolbar>
          <IconButton
            edge='start'
            className={classes.menuButton}
            color='inherit'
            aria-label='menu'
          >
            <MenuIcon />
          </IconButton>
          <Typography
            variant='h6'
            component='h1'
            className={classes.title}
          >
            GraphSolver
          </Typography>
        </Toolbar>
      </AppBar>
      <Box>
        <EditorButtons/>
      </Box>
      <Editor/>
      <Fab
        variant='extended'
        color='secondary'
        className={classes.fab}
      >
        <PlayArrowIcon className={classes.extendedIcon}/>
        Generate
      </Fab>
    </>
  );
};
