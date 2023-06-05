package oop2;

import java.util.Arrays;
import java.util.Comparator;

class CompareStrings implements Comparator<String> {
	@Override
	public int compare(String s1, String s2) {
		return s1.toLowerCase().compareTo(s2.toLowerCase());
	}
}

public class SortStringIgnoreCase {

	public static void main(String[] args) {
		String names[] = { "andy", "Scott", "mark", "Joe", "Stephen", "Tom" };

		Arrays.sort(names, new CompareStrings());

		for (var n : names)
			System.out.println(n);
	}

}
