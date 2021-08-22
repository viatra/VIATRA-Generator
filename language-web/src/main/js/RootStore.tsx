
import React, { createContext, useContext } from 'react';

import EditorStore from './editor/EditorStore';

export default class RootStore {
  editorStore;

  constructor() {
    this.editorStore = new EditorStore();
  }
}

const StoreContext = createContext<RootStore | undefined>(undefined);

export const RootStoreProvider: React.FC<{ rootStore: RootStore }> = ({ children, rootStore }) => (
  <StoreContext.Provider value={rootStore}>
    {children}
  </StoreContext.Provider>
);

export const useRootStore = () => {
  const rootStore = useContext(StoreContext);
  if (!rootStore) {
    throw new Error('useRootStore must be used within RootStoreProvider');
  }
  return rootStore;
};
