import { makeAutoObservable } from 'mobx';
import React, { createContext, useContext } from 'react';

import EditorStore from './editor/EditorStore';

export default class RootStore {
  editorStore;

  constructor() {
    this.editorStore = new EditorStore();
    makeAutoObservable(this);
  }
}

const StoreContext = createContext(undefined);

export const RootStoreProvider = ({ children, rootStore }) => (
  <StoreContext.Provider value={rootStore}>
    {children}
  </StoreContext.Provider>
);

/** @returns {RootStore} */
export const useRootStore = () => {
  const rootStore = useContext(StoreContext);
  if (!rootStore) {
    throw new Error('useRootStore must be used within RootStoreProvider');
  }
  return rootStore;
};
