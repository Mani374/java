package Oops2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class TotalMarks {

	public static void main(String args[]) throws IOException {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter source filename :");
		String srcfile = s.nextLine();
		FileReader fr = new FileReader(srcfile);
		BufferedReader br = new BufferedReader(fr);
		String line;
		int sum = 0;
		while (true) {
			line = br.readLine();
			if (line == null) {
				break;
			}
			String arr1[] = line.split(",");
			for (int i = 0; i < arr1.length; i++) {
				try {
					sum = sum + Integer.parseInt(arr1[i]);
				} catch (NumberFormatException e) {
				}
			}
			System.out.println(sum);
			sum = 0;
		}
		fr.close();
	}

}
