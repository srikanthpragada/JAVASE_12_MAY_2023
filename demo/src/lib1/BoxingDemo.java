package lib1;

public class BoxingDemo {

	public static void main(String[] args) {
		 Object obj = "Abc";
		 
		 obj = 10;  // Integer 
		 System.out.println(obj.getClass());
		 
		 obj = 10.50;  // Double 
		 System.out.println(obj.getClass());
		 
		 Double dobj = 10.50;  // Autoboxing
		 double d = dobj;   // Autounboxing 
		 
	 

	}

}
