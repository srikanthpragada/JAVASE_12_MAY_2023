package lib1;

public class SumOfNumbers {

	public static void main(String[] args) {
		var s = "10,20,40,50,60";
		int total = 0;

		var marks = s.split(",");

		for (var m : marks) {
			total += Integer.parseInt(m);
		}
		
		System.out.println(total);
	}
}
