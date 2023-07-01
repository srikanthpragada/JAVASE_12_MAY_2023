package lib2;

import java.util.Arrays;


public class StreamDemo2 {
	public static void main(String[] args) {
		 String [] names = 
			 {"Joe", "Andy", "Mark", "Scott", "James", "Joe", "Scott", "Richards"};
		 
		 Arrays.stream(names)
		       .filter(v -> v.length() > 4 )  // Predicate (boolean test(T))
		       .distinct()
		       .sorted()
		       .forEach(System.out::println);// Consumer (void accept(T))

	}

}
