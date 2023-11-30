package Oops2;

public class TestTransation {

	public static void main(String[] args) {
		Transaction t1 = new Transaction(1200, PaymentMode.cash);
		Transaction t2 = new Transaction(1200, PaymentMode.card);
		Transaction t3 = new Transaction(1200, PaymentMode.upi);
		Transaction t4 = new Transaction(1200, PaymentMode.neft);
		t1.getCharge();
		t1.getNetAmount();

		t2.getCharge();
		t2.getNetAmount();
		t3.getCharge();
		t3.getNetAmount();
		t4.getCharge();
		t4.getNetAmount();
	}
}
