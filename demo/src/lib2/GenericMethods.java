package lib2;

import java.time.LocalDate;
import java.util.List;

public class GenericMethods {

//	public static void print(String[] lst) {
//		for (var v : lst)
//			System.out.println(v);
//	}
//
//	public static void print(LocalDate[] lst) {
//		for (var v : lst)
//			System.out.println(v);
//	}

	public static <T> void print(T[] lst) {
		for (var v : lst)
			System.out.println(v);
	}

	public static void main(String[] args) {
		var names = new String[] { "Java", "Python", "C#" };
		var nums = new Integer[] { 10,20,30};
		print(names);
		print(nums);
		
		var a = "abc";
	 

	}
}
