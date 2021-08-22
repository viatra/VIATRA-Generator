import { Editor, EditorConfiguration } from 'codemirror';
import {
  createAtom,
  makeAutoObservable,
  observable,
} from 'mobx';
import 'mode-problem';
import {
  IXtextOptions,
  IXtextServices,
  createServices,
  removeServices,
} from 'xtext/xtext-codemirror';

const xtextLang = 'problem';

const xtextOptions: IXtextOptions = {
  xtextLang,
  enableFormattingAction: true,
};

const codeMirrorGlobalOptions: EditorConfiguration = {
  mode: `xtext/${xtextLang}`,
  indentUnit: 2,
  theme: 'material-darker',
};

export default class EditorStore {
  _atom;
  editor?: Editor;
  xtextServices?: IXtextServices;
  value = '';
  showLineNumbers = false;

  constructor() {
    this._atom = createAtom('EditorStore');
    makeAutoObservable(this, {
      _atom: false,
      editor: observable.ref,
      xtextServices: observable.ref,
    });
  }

  /**
   * Attaches a new CodeMirror instance and creates Xtext services.
   *
   * The store will not subscribe to any CodeMirror events. Instead,
   * the editor component should subscribe to them and relay them to the store.
   *
   * @param newEditor The new CodeMirror instance
   */
  editorDidMount(newEditor: Editor) {
    if (this.editor) {
      throw new Error('CoreMirror editor mounted before unmounting');
    }
    this.editor = newEditor;
    this.xtextServices = createServices(newEditor, xtextOptions);
  }

  editorWillUnmount() {
    if (this.editor) {
      removeServices(this.editor);
    }
    this.editor = undefined;
    this.xtextServices = undefined;
  }

  /**
   * Updates the contents of the editor.
   *
   * @param newValue The new contents of the editor
   */
  updateValue(newValue: string) {
    this.value = newValue;
  }

  reportChanged() {
    this._atom.reportChanged();
  }

  _observeEditorChanges() {
    this._atom.reportObserved();
  }

  get codeMirrorOptions(): EditorConfiguration {
    return {
      ...codeMirrorGlobalOptions,
      lineNumbers: this.showLineNumbers,
    };
  }

  /**
   * @returns `true` if there is history to undo
   */
  get canUndo() {
    this._observeEditorChanges();
    if (!this.editor) {
      return false;
    }
    const { undo: undoSize } = this.editor.historySize();
    return undoSize > 0;
  }

  undo() {
    this.editor?.undo();
  }

  /**
   * @returns `true` if there is history to redo
   */
  get canRedo() {
    this._observeEditorChanges();
    if (!this.editor) {
      return false;
    }
    const { redo: redoSize } = this.editor.historySize();
    return redoSize > 0;
  }

  redo() {
    this.editor?.redo();
  }

  toggleLineNumbers() {
    this.showLineNumbers = !this.showLineNumbers;
  }
}
