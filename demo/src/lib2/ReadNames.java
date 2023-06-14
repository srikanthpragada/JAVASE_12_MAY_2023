package lib2;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class ReadNames {

	public static void main(String[] args) throws IOException {
		var fr = new FileReader("d:\\classroom\\may12\\names.txt");
		var lnr = new LineNumberReader(fr);
 
		while(true) {
			var line = lnr.readLine(); 
			if(line == null)  // EOF 
				break;
			
			System.out.printf("%3d: %s\n", lnr.getLineNumber(), line);
		}

		lnr.close();
		fr.close();
	}

}
