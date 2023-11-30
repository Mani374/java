package javaPractice;

import java.util.Scanner;

public class SumOfNums {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inputString = sc.nextLine();
		int sum = sumNumbersInString(inputString);
		System.out.println("Sum of numbers in the string: " + sum);
	}

	public static int sumNumbersInString(String inputString) {
		int sum = 0;
		StringBuilder currentNumber = new StringBuilder();

		for (char c : inputString.toCharArray()) {
			if (Character.isDigit(c)) {
				currentNumber.append(c);
			} else if (currentNumber.length() > 0) {
				sum += Integer.parseInt(currentNumber.toString());
				currentNumber.setLength(0);
			}
		}

		if (currentNumber.length() > 0) {
			sum += Integer.parseInt(currentNumber.toString());
		}

		return sum;

	}

}
