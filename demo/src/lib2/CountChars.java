package lib2;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class CountChars {

	public static void main(String[] args) throws IOException {
		var fr = new FileReader("d:\\classroom\\may12\\names.txt");
		int upper = 0, lower = 0, digits = 0, ch;

		while (true) {
			ch = fr.read();
			if (ch == -1)
				break;

			if (Character.isUpperCase(ch))
				upper++;
			else if (Character.isLowerCase(ch))
				lower++;
			else if (Character.isDigit(ch))
				digits++;
		}

		fr.close();
		System.out.printf("Upper = %d, Lower = %d, Digits = %d", upper, lower, digits, args);
	}

}
