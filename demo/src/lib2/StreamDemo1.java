package lib2;

import java.util.Arrays;
import java.util.function.Consumer;

class PrintValue implements Consumer<String> {
	public void accept(String t) {
		System.out.println(t);
	}
}

public class StreamDemo1 {

	public static void main(String[] args) {
		 String [] names = 
			 {"Joe", "Andy", "Mark", "Scott", "James", "Joe", "Scott", "Richards"};
		 
		 Arrays.stream(names)
		       .distinct()
		       .sorted()
		       .limit(3)
		     //  .forEach(new PrintValue());
		     //  .forEach(v -> System.out.println(v));
		       .forEach(System.out::println);
		       

	}

}
