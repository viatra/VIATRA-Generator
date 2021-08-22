import { CacheProvider } from '@emotion/react';
import React from 'react';
import { render } from 'react-dom';
import CssBaseline from '@material-ui/core/CssBaseline';
import { ThemeProvider, createTheme } from '@material-ui/core/styles';
import { getCache } from 'tss-react/cache';

import { App } from './App';
import { RootStore, RootStoreProvider } from './RootStore';

import '../css/index.scss';

const initialValue = `class Family {
  contains Person[] members
}

class Person {
  Person[] children opposite parent
  Person[0..1] parent opposite children
  int age
  TaxStatus taxStatus
}

enum TaxStatus {
  child, student, adult, retired
}

% A child cannot have any dependents.
error invalidTaxStatus(Person p) <->
  taxStatus(p, child), children(p, _q).

unique family.
Family(family).
members(family, anne).
members(family, bob).
members(family, ciri).
children(anne, ciri).
?children(bob, ciri).
default children(ciri, *): false.
taxStatus(anne, adult).
age(anne, 35).
bobAge: 27.
age(bob, bobAge).
!age(ciri, bobAge).

scope Family = 1, Person += 5..10.
`;

const rootStore = new RootStore();
rootStore.editorStore.updateValue(initialValue);

const theme = createTheme({
  palette: {
    mode: 'dark',
    background: {
      default: '#212121',
      paper: '#2f2f2f',
    },
    primary: {
      main: '#82aaff',
    },
    secondary: {
      main: '#ff5370',
    },
  },
});

const app = (
  <CacheProvider value={getCache()}>
    <ThemeProvider theme={theme}>
      <CssBaseline />
      <RootStoreProvider rootStore={rootStore}>
        <App />
      </RootStoreProvider>
    </ThemeProvider>
  </CacheProvider>
);

render(app, document.getElementById('app'));
