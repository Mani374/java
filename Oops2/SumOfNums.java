package Oops2;

import java.util.Scanner;

public class SumOfNums {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int c = 0;
		int sum = 0;
		for (var i = 1; c < 5; i++) {

			System.out.print("Enter the number:");
			try {
				n = Integer.parseInt(sc.nextLine());
				sum += n;
				c++;
			} catch (NumberFormatException ex) {
				System.out.println("Enter the valid number");
			}
		}
		System.out.println(sum);
		sc.close();

	}
}
