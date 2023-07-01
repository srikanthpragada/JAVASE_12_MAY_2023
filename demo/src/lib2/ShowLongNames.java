package lib2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ShowLongNames {

	public static void main(String[] args) throws IOException {
		var p = Path.of("d:\\classroom\\may12\\names.txt");
	
		double avg = 
			 Files.lines(p)
		     .filter( v -> !v.isBlank())       // ignore blank lines
		     .mapToInt( line -> line.length())
		     .average().getAsDouble();
		  
	   // System.out.println(avg);
	   
	   
	   Files.lines(p)
	        .filter( line -> line.length() > avg)
	        .forEach(System.out::println);

	}
}
