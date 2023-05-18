package basics;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter a number :");
		int n = s.nextInt();
		int total = 1;
		
		for(int i = 2; i <= n/2 ; i ++)
		{
	        if(n % i == 0)
	        	 total += i;
		}
		
		if(total == n)
			System.out.println("Perfect Number!");
		else
			System.out.println("Not Perfect Number!");

		s.close();
		
	}

}
