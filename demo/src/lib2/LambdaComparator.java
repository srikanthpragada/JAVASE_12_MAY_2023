package lib2;

import java.util.Arrays;
import java.util.Comparator;

class CompareByLength implements Comparator<String> {
	@Override
	public int compare(String s1, String s2) {
	     return  s1.length() - s2.length();
	}
}

public class LambdaComparator {
	
	public static int compareStrings(String s1, String s2) {
		 return s1.toLowerCase().compareTo(s2.toLowerCase());
	}
	
	public static void main(String[] args) {
		 String [] names = {"Joe", "andy", "Mark", "james", "Scott", "Richards"};
		 
//		 Arrays.sort(names, new CompareByLength());
		 
		 // Arrays.sort(names, (s1, s2) -> s1.length() - s2.length() );
		 
		 Arrays.sort(names, LambdaComparator::compareStrings);
		 
		 for(var n : names)
			 System.out.println(n);

	}

}
