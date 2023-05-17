package basics;

import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter a number :");
		int n = s.nextInt();
		
		for(int i = 2; i <= n/2 ; i ++)
		{
	        if(n % i == 0)
	        	System.out.println(i);
		}

		s.close();
	}

}
