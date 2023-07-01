package lib2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class SortNamesUsingStreams {

	public static void main(String[] args) throws IOException {
		 
		var p = Path.of("d:\\classroom\\may12\\names.txt");
		
		Files.lines(p)
			 .filter( line -> !line.isBlank())
			 .distinct()
			 .sorted()
			 .forEach(System.out::println);
		

	}

}
