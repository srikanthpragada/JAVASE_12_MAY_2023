package oop1;

public class SavingsAccount {
	// instance variables
    private int acno;
    private String ahname;
    private int balance;
    
    // constructor 
    public SavingsAccount(int no, String name) {
    	acno = no;
    	ahname = name;
    }

    public SavingsAccount(int no, String name, int bal) {
    	acno = no;
    	ahname = name;
    	balance = bal;
    }
    
    public void print() {
    	System.out.println(acno);
    	System.out.println(ahname);
    	System.out.println(balance);
    }
    
    public int getBalance() {
    	return balance;
    }
    
    public void deposit(int amount) {
    	balance += amount;
    }
    
    public void withdraw(int amount) {
    	balance -= amount;
    }
}
