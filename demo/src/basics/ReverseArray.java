package basics;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
		 
		 int a [] = new int[10];
		 
		 for (int i = 0; i < a.length ; i ++)
		 {
			 System.out.print("Enter number :");
			 a[i] = s.nextInt();
		 }
		 
		 for (int i = a.length-1 ; i  >= 0 ; i --)
		 {
			 System.out.printf("%5d", a[i]);
		 }
		 
		 
	}

}
