package hu.bme.mit.inf.dslreasoner.application.ui.execute;

import java.util.Iterator;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

import com.google.inject.Inject;
import com.google.inject.Injector;

import hu.bme.mit.inf.dslreasoner.application.execution.ScriptExecutor;

public class ExecuteScriptHandler extends AbstractHandler implements IHandler {
	
	ScriptExecutor scriptExecutor;
	
	@Inject
	public void setInjector(Injector injector) {
		scriptExecutor = new ScriptExecutor(RuntimeConsoleBasedScriptConsole.FACTORY, injector);
	}
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		assert scriptExecutor != null : "Injector must be set";
		ISelection selection = HandlerUtil.getCurrentSelection(event);
		if(selection instanceof StructuredSelection) {
			StructuredSelection structuredSelection = (StructuredSelection) selection;
			Iterator<?> iterator = structuredSelection.iterator();
			while(iterator.hasNext()) {
				Object selectedElement = iterator.next();
				if (selectedElement instanceof IFile) {
					IFile selectedFile = (IFile) selectedElement;
					URI uri = URI.createPlatformResourceURI(selectedFile.getFullPath().toString(), true);
					scriptExecutor.executeScript(uri);
                }
			}
		}
		return null;
	} 

}
