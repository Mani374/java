package Oops2;

import java.io.FileWriter;
import java.util.Scanner;
import java.util.StringJoiner;

public class WriteNames {

	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("Name.text");

			StringJoiner sj = new StringJoiner("\n");
			Scanner sc = new Scanner(System.in);
			String s;
			while (true) {
				System.out.print("Enter the String:");
				s = sc.nextLine();
				if (s.equals("end"))
					break;
				else
					sj.add(s);
			}

			FileWriter f = new FileWriter("maninames.txt");
			f.write(sj + "\n");
			f.close();
			sc.close();
			fw.close();
		} catch (Exception e) {
			System.out.println(e);

		}

	}
}
