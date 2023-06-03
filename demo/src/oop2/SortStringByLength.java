package oop2;

import java.util.Arrays;
import java.util.Comparator;

class CompareByLength implements Comparator<String> {
	@Override
	public int compare(String s1, String s2) {
		return s1.length() - s2.length();
	}
}

public class SortStringByLength {

	public static void main(String[] args) {
		String names[] = { "andy", "Scott", "Mark", "Joe", "Stephen", "Tom" };

		Arrays.sort(names);
		Arrays.sort(names, new CompareByLength());

		for (var n : names)
			System.out.println(n);
	}

}
