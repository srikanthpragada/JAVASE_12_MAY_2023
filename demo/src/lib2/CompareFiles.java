package lib2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CompareFiles {

	public static void main(String[] args) throws IOException {

		var p1 = Path.of("d:\\classroom\\may12\\names.txt");
		var p2 = Path.of("d:\\classroom\\may12\\names.txt");
		System.out.println(p1.getClass());

		System.out.println(Files.mismatch(p1, p2));

	}

}
