package javaPractice;

import java.util.Scanner;

public class Strings {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();

		String ch[] = s.split(",");

		for (int i = 0; i < ch.length; i++) {
			{

				System.out.println(ch[i]);
			}
		}
	}
}
