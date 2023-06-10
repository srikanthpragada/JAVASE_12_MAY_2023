package oop2;

public class AssertDemo {
	
	public static boolean isEven(int num) {
		return  num % 2 == 0;
	}
	
	public static int square(int n) {
		return n + n;
	}

	public static void main(String[] args) {
		 assert isEven(10) == true : "Method isEven() failed for even number";
		 assert isEven(11) == false : "Method isEven() failed for odd number";
		 assert square(10) == 100 : "square() failed";
	}

}
