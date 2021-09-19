import { Editor } from 'codemirror';

export function createEditor(options: IXtextOptions): IXtextCodeMirrorEditor;

export function createServices(editor: Editor, options: IXtextOptions): IXtextServices;

export function removeServices(editor: Editor): void;

export interface IXtextOptions {
  baseUrl?: string;
  contentType?: string;
  dirtyElement?: string | Element;
  dirtyStatusClass?: string;
  document?: Document;
  enableContentAssistService?: boolean;
  enableCors?: boolean;
  enableFormattingAction?: boolean;
  enableFormattingService?: boolean;
  enableGeneratorService?: boolean;
  enableHighlightingService?: boolean;
  enableOccurrencesService?: boolean;
  enableSaveAction?: boolean;
  enableValidationService?: boolean;
  loadFromServer?: boolean;
  mode?: string;
  parent?: string | Element;
  parentClass?: string;
  resourceId?: string;
  selectionUpdateDelay?: number;
  sendFullText?: boolean;
  serviceUrl?: string;
  showErrorDialogs?: boolean;
  syntaxDefinition?: string;
  textUpdateDelay?: number;
  xtextLang?: string;
}

export interface IXtextCodeMirrorEditor extends Editor {
  xtextServices: IXtextServices;
}

export interface IXtextServices {
}
