package Oops2;

public enum PaymentMode {
	cash, card, upi, neft;

}

class Transaction {
	int amount;
	PaymentMode PayementMode;
	int charge;

	public Transaction(int amount, PaymentMode payementMode) {
		super();
		this.amount = amount;
		PayementMode = payementMode;
	}

	public void getCharge() {

		switch (PayementMode) {
		case cash:
			charge = 0;
			System.out.println("Charge for cash=" + charge);
			break;

		case card:

			charge += 0.02 * (amount);
			System.out.println("Charge for card=" + charge);
			break;
		case upi:

			charge += 0.005 * (amount);
			System.out.println("Charge for cash=" + charge);
			break;

		case neft:
			charge += 0.01 * (amount);
			System.out.println("Charge for cash=" + charge);
			break;

		default:
			System.out.println("Enter the fields Correctly");
			break;
		}

	}

	public void getNetAmount() {
		switch (PayementMode) {
		case cash:
			amount = amount + charge;
			System.out.println("NetAmount for CASH=" + amount);
			break;

		case card:

			amount += charge;
			System.out.println("NetAmount for Card=" + amount);
			break;
		case upi:

			amount += charge;
			System.out.println("NetAmount for UPI=" + amount);
			break;

		case neft:
			amount += charge;
			System.out.println("NetAmount for Neft=" + amount);
			break;

		default:
			System.out.println("Enter the fields Correctly");
			break;
		}

	}

}