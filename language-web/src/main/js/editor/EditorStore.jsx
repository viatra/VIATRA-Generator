import CodeMirror from 'codemirror';
import { createAtom, makeAutoObservable, observable } from 'mobx';

export default class EditorStore {
  atom;
  /** @type {CodeMirror} */
  editor = null;
  /** @type {string} */
  value = '';

  constructor() {
    this.atom = createAtom('EditorStore');
    makeAutoObservable(this, {
      atom: false,
      editor: observable.ref,
    });
  }

  /**
   * Attaches a new CodeMirror instance.
   *
   * The store will node subscribe to any CodeMirror events. Instead,
   * the editor component should subscribe to them and relay them to the store.
   *
   * @param {CodeMirror} newEditor The new CodeMirror instance
   */
  updateEditor(newEditor) {
    this.editor = newEditor;
  }

  /**
   * Updates the contents of the editor.
   *
   * @param {string} newValue The new contents of the editor
   */
  updateValue(newValue) {
    this.value = newValue;
  }

  reportChanged() {
    this.atom.reportChanged();
  }

  /**
   * @returns {boolean} `true` if there is history to undo
   */
  get canUndo() {
    this.atom.reportObserved();
    if (!this.editor) {
      return false;
    }
    const { undo: undoSize } = this.editor.historySize();
    return undoSize > 0;
  }

  undo() {
    this.editor.undo();
  }

  /**
   * @returns {boolean} `true` if there is history to redo
   */
  get canRedo() {
    this.atom.reportObserved();
    if (!this.editor) {
      return false;
    }
    const { redo: redoSize } = this.editor.historySize();
    return redoSize > 0;
  }

  redo() {
    this.editor.redo();
  }
}
