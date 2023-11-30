package javaPractice;

import java.util.Arrays;
import java.util.Comparator;

class Account {
	int accountNum;
	String accountHolderName;
	int currentBalance;

	public Account(int accountNum, String accountHolderName, int currentBalance) {

		this.accountNum = accountNum;
		this.accountHolderName = accountHolderName;
		this.currentBalance = currentBalance;
	}

	@Override
	public String toString() {
		return this.accountNum + " " + this.accountHolderName + " " + this.currentBalance;
	}

}

class Compare implements Comparator<Account> {

	public int compare(Account a, Account b) {
		return a.accountNum - b.accountNum;
	}

}

class Compare1 implements Comparator<Account> {

	public int compare(Account a, Account b) {
		return a.currentBalance - b.currentBalance;
	}

}

public class AccountCompare {

	public static void main(String[] args) {

		int n = 3;
		Account array[] = new Account[n];
		array[0] = new Account(1225201, "mani", 6500);
		array[1] = new Account(1240523, "laxman", 6020);
		array[2] = new Account(1205302, "Divakar", 3000);

		Arrays.sort(array, new Compare());

		System.out.println("Sorting based on the Account number");
		for (var r : array) {
			System.out.println(r);
		}
		Arrays.sort(array, new Compare1());
		System.out.println("Sorting based on the Current balance number");
		for (var r : array) {
			System.out.println(r);
		}

	}

}