package Oops2;

import java.io.FileReader;
import java.util.Scanner;

public class CountString {

	public static void main(String[] args) {

		System.out.println("Enter the String");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int upperCase = 0;
		int lowerCase = 0;
		int others = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
				upperCase++;
			}
			if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
				lowerCase++;
			} else {
				others++;
			}

		}
		System.out.println(
				"UpperCase Count=" + upperCase + " Lower CaseCount=" + lowerCase + " Others Count=" + others++);

	}
}
