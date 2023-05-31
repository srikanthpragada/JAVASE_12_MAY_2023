package lib1;


record Customer(String name, String email) {
      public String getServer() {
    	  int pos = this.email.indexOf("@");
    	  return this.email.substring(pos + 1);
      }
}

public class TestCustomer {

	public static void main(String[] args) {
		
       var c1 = new Customer("Abc", "abc@gmail.com");
       var c2 = new Customer("Xyz", "xyz@gmail.com");
       var c3 = new Customer("Abc", "abc@gmail.com");
       
       System.out.println(c1.toString());
       System.out.println(c1.email());
       System.out.println(c1.equals(c3));
       
       System.out.println(c1.getServer());
       
       System.out.println(c1.getClass());
    		   
	}

}
