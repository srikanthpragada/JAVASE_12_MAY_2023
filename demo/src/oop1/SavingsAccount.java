package oop1;

public class SavingsAccount {
	// instance variables
	private int acno;
	private String ahname;
	private int balance;
	private static int minbal = 10000;
	
	public static int getMinbal() {
		return SavingsAccount.minbal;
	}
	
	public static void setMinbal(int minbal) {
		SavingsAccount.minbal = minbal;
	}
	
	// constructor
	public SavingsAccount(int acno, String ahname) {
		this.acno = acno;
		this.ahname = ahname;
	}

	public SavingsAccount(int acno, String ahname, int balance) {
		this(acno, ahname); // call another constructor
		this.balance = balance;
	}

	public void print() {
		System.out.println(this.acno);
		System.out.println(this.ahname);
		System.out.println(this.balance);
	}

	public int getBalance() {
		return this.balance;
	}

	public void deposit(int amount) {
		this.balance += amount;
	}

	public void withdraw(int amount) {
		if (this.balance - SavingsAccount.minbal >= amount)
			 this.balance -= amount;
		else
			 System.out.println("Insufficient Balance");
		
	}
}
