import React from 'react';
import AppBar from '@material-ui/core/AppBar';
import Box from '@material-ui/core/Box';
import Button from '@material-ui/core/Button';
import IconButton from '@material-ui/core/IconButton';
import Toolbar from '@material-ui/core/Toolbar';
import Typography from '@material-ui/core/Typography';
import MenuIcon from '@material-ui/icons/Menu';
import PlayArrowIcon from '@material-ui/icons/PlayArrow';

import { makeStyles } from './makeStyles';
import { Editor } from './editor/Editor';
import { EditorButtons } from './editor/EditorButtons';

const useStyles = makeStyles()((theme) => ({
  container: {
    maxHeight: '100vh',
  },
  menuButton: {
    marginRight: theme.spacing(2),
  },
  title: {
    flexGrow: 1,
  },
  editorBox: {
    overflow: 'auto',
  },
}));

export const App = (): JSX.Element => {
  const { classes, cx } = useStyles();

  return (
    <Box
      display="flex"
      flexDirection="column"
      className={cx(classes.container)}
    >
      <AppBar
        position="static"
        color="inherit"
      >
        <Toolbar>
          <IconButton
            edge="start"
            className={cx(classes.menuButton)}
            color="inherit"
            aria-label="menu"
          >
            <MenuIcon />
          </IconButton>
          <Typography
            variant="h6"
            component="h1"
            className={cx(classes.title)}
          >
            GraphSolver
          </Typography>
        </Toolbar>
      </AppBar>
      <Box
        display="flex"
        justifyContent="space-between"
        alignItems="center"
        p={1}
      >
        <Box
          display="flex"
          alignItems="center"
        >
          <EditorButtons />
        </Box>
        <Box>
          <Button
            variant="outlined"
            color="primary"
            startIcon={<PlayArrowIcon />}
          >
            Generate
          </Button>
        </Box>
      </Box>
      <Box
        flexGrow={1}
        flexShrink={1}
        className={cx(classes.editorBox)}
      >
        <Editor />
      </Box>
    </Box>
  );
};
