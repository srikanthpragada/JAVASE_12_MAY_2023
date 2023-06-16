package lib2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ReadNames2 {

	public static void main(String[] args) throws IOException {
		var p = Path.of("d:\\classroom\\may12\\names.txt");
		
		for (var name : Files.readAllLines(p))
			System.out.println(name);
	}

}
