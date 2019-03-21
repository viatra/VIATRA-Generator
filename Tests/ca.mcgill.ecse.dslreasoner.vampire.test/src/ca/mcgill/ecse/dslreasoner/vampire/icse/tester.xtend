package ca.mcgill.ecse.dslreasoner.vampire.icse

import java.io.BufferedReader
import java.io.FileInputStream
import java.io.InputStream
import java.io.InputStreamReader

class tester {
	def static void main(String[] args) {
		val InputStream is = new FileInputStream("C://Users//Aren Babikian//git//VIATRA-Generator//Tests//ca.mcgill.ecse.dslreasoner.vampire.test//src//ca//mcgill//ecse//dslreasoner//vampire//icse//90-110Z3.txt");
		val BufferedReader buf = new BufferedReader(new InputStreamReader(is));
		var String line = buf.readLine();
		val StringBuilder sb = new StringBuilder();
		while (line != null) {
			sb.append(line);
			line = buf.readLine();
		}
		val String str = sb.toString();
		
		val satArray = str.split("Model")
		
		val satTimes = newArrayList
		
		for(sat : satArray.subList(1, satArray.length)) {
			satTimes.add(sat.substring(2, 8))
		}
		
		for(t : satTimes) {
			println(t)
		}
		
		

	}
}
