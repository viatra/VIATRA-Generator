import {
  Theme,
  createTheme,
  responsiveFontSizes,
} from '@material-ui/core/styles';
import { makeAutoObservable } from 'mobx';

import {
  EditorTheme,
  EditorThemeData,
  DEFAULT_THEME,
  EDITOR_THEMES,
} from './EditorTheme';

export class ThemeStore {
  currentTheme: EditorTheme = DEFAULT_THEME;

  constructor() {
    makeAutoObservable(this);
  }

  toggleDarkMode(): void {
    this.currentTheme = this.currentThemeData.toggleDarkMode;
  }

  private get currentThemeData(): EditorThemeData {
    return EDITOR_THEMES[this.currentTheme];
  }

  get materialUiTheme(): Theme {
    const themeData = this.currentThemeData;
    const materialUiTheme = createTheme({
      palette: {
        mode: themeData.paletteMode,
        background: {
          default: themeData.background,
          paper: themeData.paper,
        },
        primary: {
          main: themeData.primary,
        },
        secondary: {
          main: themeData.secondary,
        },
      },
    });
    return responsiveFontSizes(materialUiTheme);
  }

  get codeMirrorTheme(): string {
    return `problem-${this.currentThemeData.className}`;
  }
}
