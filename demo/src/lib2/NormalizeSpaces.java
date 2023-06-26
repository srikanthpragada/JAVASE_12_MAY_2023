package lib2;

import java.util.regex.Pattern;

public class NormalizeSpaces {

	public static void main(String[] args) {
		 var text = "This  is to understand how     regular    expressions are working!";
		 
		 var p = Pattern.compile(" +");
		 var m = p.matcher(text);
		 
		 System.out.println(m.replaceAll(" "));

	}

}
