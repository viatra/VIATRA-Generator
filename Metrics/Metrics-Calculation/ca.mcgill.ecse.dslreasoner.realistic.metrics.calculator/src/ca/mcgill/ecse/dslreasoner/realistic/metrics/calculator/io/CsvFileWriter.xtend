package ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.io;

import java.io.File
import java.io.FileNotFoundException
import java.io.FileOutputStream
import java.io.PrintWriter
import java.util.ArrayList
import java.util.List

class CsvFileWriter {
	
	def static void write(ArrayList<ArrayList<String>> datas, String uri) {
		if(datas.size() <= 0) {
			return;
		}
		val PrintWriter writer = new PrintWriter(new File(uri));
		output(writer, datas, uri);
	}
	
	def static void append(ArrayList<ArrayList<String>> datas, String uri) {
		if(datas.size() <= 0) {
			return;
		}
		val PrintWriter writer = new PrintWriter(new FileOutputStream(new File(uri), true));
		output(writer, datas, uri);
	}
	
	
	def private static void output(PrintWriter writer, ArrayList<ArrayList<String>> datas, String uri) {
		//println("Output csv for " + uri);
		try  {
			
			val output = new StringBuilder;
			for(List<String> datarow : datas){
				for(var i = 0; i < datarow.size() - 1; i++){
					output.append(datarow.get(i) + ',');
				}
				
				if(datarow.size >= 1){
					output.append(datarow.get(datarow.size() - 1));
					output.append('\n');
				}
			}
			
			writer.write(output.toString());
			writer.close();
			//println("Output csv finished");
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
