package javaPractice;

import java.util.Scanner;

public class InvertCase {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();
		char c = 0;
		for (int i = 0; i < str.length(); i++) {
			c = str.charAt(i);
			if (c >= 'A' && c <= 'Z') {
				c = Character.toLowerCase(c);

			} else if (c >= 'a' && c <= 'z') {
				c = Character.toUpperCase(c);
			}

			System.out.print(c);
		}
		sc.close();

	}

}
