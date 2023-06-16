package lib2;

import java.util.Scanner;
import java.util.TreeSet;

public class SortNames {

	public static void main(String[] args) {
		 
		 var names = new TreeSet<String>();
		 var s = new Scanner(System.in);
		 
		 while(true) {
			 System.out.print("Enter name [end to stop] :");
			 var name = s.nextLine();
			 if(name.equals("end"))
				  break; 
			 names.add(name);
		 }
		 
		 for(var n : names)
			 System.out.println(n);
		 
		 

	}

}
