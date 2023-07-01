package lib2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class AverageSalary {

	public static void main(String[] args) throws IOException {
		 
		var p = Path.of("d:\\classroom\\may12\\salaries.txt");
		
		var avg = 
		      Files.lines(p)
			 .mapToInt( line -> Integer.parseInt( (line.split(",")[1])))
			 .average();
 
		System.out.println(avg.getAsDouble());
			 
		

	}

}
