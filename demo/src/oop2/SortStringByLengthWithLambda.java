package oop2;

import java.util.Arrays;
import java.util.Comparator;

public class SortStringByLengthWithLambda {

	public static void main(String[] args) {
		String names[] = { "andy", "Scott", "Mark", "Joe", "Stephen", "Tom" };

		var c = new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return s1.length() - s2.length();
			}
		};

		System.out.println(c.getClass());

		Arrays.sort(names, c);

		for (var n : names)
			System.out.println(n);
	}

}
