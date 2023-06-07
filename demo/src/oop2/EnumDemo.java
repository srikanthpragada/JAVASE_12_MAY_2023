package oop2;

enum PaymentMode {
	CASH, CARD, UPI
}

class Payment {
	private double amount;
	private PaymentMode mode;

	public Payment(double amount, PaymentMode mode) {
		super();
		this.amount = amount;
		this.mode = mode;
	}

	public void process() {
		switch (mode) {
		case CASH: // action for Cash
		case CARD: // action for card 
		case UPI:
		}
	}
}

public class EnumDemo {

	public static void main(String[] args) {
		var p = new Payment(10000, PaymentMode.UPI);
	}

}
