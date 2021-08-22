import React, { createContext, useContext } from 'react';

import { EditorStore } from './editor/EditorStore';

export class RootStore {
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

export const useRootStore = (): RootStore => {
  const rootStore = useContext(StoreContext);
  if (!rootStore) {
    throw new Error('useRootStore must be used within RootStoreProvider');
  }
  return rootStore;
};
