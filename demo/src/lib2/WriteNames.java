package lib2;

import java.io.FileWriter;
import java.io.IOException;

public class WriteNames {

	public static void main(String[] args) throws IOException {
		var names = new String[] { "Java", "JavaScript", "Python", "C#", "SQL" };

	 
		// try with resource 
		try (var fw = new FileWriter("d:\\classroom\\may12\\names.txt", true)) {
			for (var n : names) {
				fw.write(n + "\n");
			}
		} // end of try

	}

}
