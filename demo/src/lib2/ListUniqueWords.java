package lib2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.TreeSet;

public class ListUniqueWords {

	public static void main(String[] args) throws IOException {
		 var p = Path.of("d:\\classroom\\may12\\pigs.txt");
		 var contents = Files.readString(p);
		 
		 var words = contents.split("\\W+");  // split using non-word char
		 var ts = new TreeSet<String>(Arrays.asList(words));
		 
		 for(var w : ts)
			 System.out.println(w);
	}
}
