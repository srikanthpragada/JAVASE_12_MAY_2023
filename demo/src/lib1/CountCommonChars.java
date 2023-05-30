package lib1;

public class CountCommonChars {

	public static void main(String[] args) {
		var s1 = "kotalin";
		var s2 = "JavaScript";

		int count = 0;
		for (int i = 0; i < s2.length(); i++) {
			if (s1.indexOf(s2.charAt(i)) >= 0)
				count++;
		}
		System.out.println(count);
	}

}
