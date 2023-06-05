package oop2;

import java.util.Arrays;
import java.util.Comparator;

public class SortStringByLengthWithInnerClass {

	public static void main(String[] args) {
		String names[] = { "andy", "Scott", "Mark", "Joe", "Stephen", "Tom" };
		
		Arrays.sort(names, (s1,s2) -> s1.length() - s2.length());

		for (var n : names)
			System.out.println(n);
	}

}
