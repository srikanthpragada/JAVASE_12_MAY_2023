package lib2;

import java.util.stream.Stream;

public class StreamDemo3 {

	public static void main(String[] args) {
		  var s = Stream.of(10,20,30,40,50);
		  
		  s.forEach( v -> System.out.println(v * v));

	}

}
