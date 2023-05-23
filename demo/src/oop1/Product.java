package oop1;

public class Product {
	// Instance variables 
    private String name;
    private double price;
    
    // static or class variable 
    private static int taxrate = 12;
    
    public static int getTaxrate() {
    	return Product.taxrate;
    }
    
    // Methods 
    public Product(String name, double price) {
    	this.name = name;
    	this.price = price;
    }
    
    public void print() {
    	System.out.println(this.name);
    	System.out.println(this.price);
    }
    
    public double getNetPrice() {
    	return this.price + this.price * Product.taxrate / 100;
    }
}
