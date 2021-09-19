import { PaletteMode } from '@material-ui/core';

import cssVariables from '../../css/themeVariables.module.scss';

export enum EditorTheme {
  Light,
  Dark,
}

export class EditorThemeData {
  className: string;

  paletteMode: PaletteMode;

  toggleDarkMode: EditorTheme;

  foreground!: string;

  background!: string;

  paper!: string;

  primary!: string;

  secondary!: string;

  constructor(className: string, paletteMode: PaletteMode, toggleDarkMode: EditorTheme) {
    this.className = className;
    this.paletteMode = paletteMode;
    this.toggleDarkMode = toggleDarkMode;
    Reflect.ownKeys(this).forEach((key) => {
      if (!Reflect.get(this, key)) {
        const cssKey = `${this.className}--${key.toString()}`;
        if (cssKey in cssVariables) {
          Reflect.set(this, key, cssVariables[cssKey]);
        }
      }
    });
  }
}

export const DEFAULT_THEME = EditorTheme.Dark;

export const EDITOR_THEMES: { [key in EditorTheme]: EditorThemeData } = {
  [EditorTheme.Light]: new EditorThemeData('light', 'light', EditorTheme.Dark),
  [EditorTheme.Dark]: new EditorThemeData('dark', 'dark', EditorTheme.Light),
};
