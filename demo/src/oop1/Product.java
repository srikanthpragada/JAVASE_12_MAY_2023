package oop1;

public class Product {
	// Instance variables 
    private String name;
    private double price;
    
    // Methods 
    public Product(String n, double p) {
    	name = n;
    	price = p;
    }
    
    public void print() {
    	System.out.println(name);
    	System.out.println(price);
    }
    
    public double getNetPrice() {
    	return price + price * 0.12;
    }
}
