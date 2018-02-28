package hu.bme.mit.inf.dslreasoner.workspace

import java.io.BufferedReader
import java.io.FileReader
import java.io.PrintWriter
import org.eclipse.emf.common.util.URI
import java.io.File

class FileSystemWorkspace extends ReasonerWorkspace{
	
	new(String targetFolder, String prefix) {
		super(targetFolder/*.replaceAll("\\\\","/").replaceAll("/\\.","")*/, prefix)
	}
	
	override protected getURI(String name) {
		URI.createFileURI(targetFolder + "/" + prefix + name)
	}
	
	def protected getFolderURI() {
		URI.createFileURI(targetFolder)
	}
	
	override getWorkspaceURI() {
		getFolderURI
	}
	
	override initAndClear() {
		val folder = new File(folderURI.toFileString)
		folder.mkdirs
		for(file : folder.listFiles) {
			file.deleteFile
		}
	}
	
	def void deleteFile(File file) {
		if (file.isDirectory()) {
			file.listFiles().forEach[deleteFile]
			file.delete
		} else {
			file.delete;
		}
	}
	
	override writeText(String name, CharSequence content) {
		val uri = getURI(name)
		val writer = new PrintWriter(uri.toFileString, "UTF-8");
		writer.println(content);
		writer.close();
		return uri
	}
	
	override readText(String name) {
		var String line;
		var String result = "";
        val in = new BufferedReader(new FileReader(getURI(name).toFileString))
		while ((line = in.readLine()) != null) {
			result = result.concat(line)
		}
		in.close
        return result
	}
	
	override protected renameFile(String name) {
		val uri = getURI(name)
		val uri2 = getURI(name+deactivationPostfix)
		val file = new File(uri. toFileString)
		val file2 = new File(uri2.toFileString)
		file.renameTo(file2)
	}
	
	override subWorkspace(String targetFolder, String prefix) {
		return new FileSystemWorkspace(this.targetFolder + "/" + targetFolder, this.prefix + prefix)
	}
	
	override allFiles() {
		val folder = new File(folderURI.toFileString)
		if(folder.isDirectory) {
			return folder.list
		} else {
			throw new IllegalArgumentException('''"«folderURI.toFileString»" is not a folder!''')
		}
	}
	
	override public getFile(String name) {
		val uri = getURI(name)
		return new File(uri.toFileString)
	}
	override refreshFile(String name) { }
}