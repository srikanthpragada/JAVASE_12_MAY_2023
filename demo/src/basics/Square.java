package basics;

import java.util.Scanner;

public class Square {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number :");
		int n = s.nextInt(); // read an int
		System.out.printf("Square of %d is %d", n, n * n);
	}

}
