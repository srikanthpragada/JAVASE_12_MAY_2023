package oop2;

public class AssertDemo {
	
	public static boolean isEven(int num) {
		return  num / 2 == 0;
	}

	public static void main(String[] args) {
		 assert isEven(10) == true : "Method isEven() failed for even number";
		 assert isEven(11) == false : "Method isEven() succeeded for odd number";
		 assert isEven(1) ==  true : "Method isEven() failed for odd number";
	}

}
