package javaPractice;

import java.util.Scanner;

public interface Operation {
	int add();

	int subtract();

	int multiply();

	int divide();

	int modulus();

}

class MyOperation implements Operation {
	Scanner sc = new Scanner(System.in);
	static {
		System.out.println("enter the values of a and b");
	}
	int a = sc.nextInt();
	int b = sc.nextInt();

	public int add() {
		return a + b;
	}

	public int subtract() {
		return a - b;
	}

	public int multiply() {
		return a * b;
	}

	public int divide() {
		return a / b;
	}

	public int modulus() {
		return a % b;
	}

}
