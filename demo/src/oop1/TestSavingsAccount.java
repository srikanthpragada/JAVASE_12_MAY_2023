package oop1;

public class TestSavingsAccount {

	public static void main(String[] args) {
		SavingsAccount a1 = new SavingsAccount(1, "Scott");
		SavingsAccount.setMinbal(5000);
		a1.deposit(10000);
		a1.withdraw(5000);
		a1.print();

		var a2 = new SavingsAccount(2, "Bob", 100000);
		 
	}

}
