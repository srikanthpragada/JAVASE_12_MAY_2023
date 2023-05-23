package oop1;

import java.util.Scanner;

public class ListRect {

	public static void main(String[] args) {
		Rect [] ar = new Rect[5];
		
		Scanner s = new Scanner(System.in);
		
		for(int i = 0; i < 5; i ++) {
			System.out.print("Enter length and width :");
			int l = s.nextInt();
			int w  = s.nextInt();
			ar[i] = new Rect(l, w);
		}
		
		for(int i = 0; i < 5; i ++) {
			System.out.printf("Length = %d, Width = %d, Area = %d\n", 
					 ar[i].getLength(), ar[i].getWidth(), ar[i].getArea());
		}

	}

}
