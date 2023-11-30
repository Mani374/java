package Oops2;

import java.io.*;
import java.util.Scanner;
import java.time.*;
import java.time.temporal.ChronoUnit;

public class DifferenceDates {

	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("Time.txt");
			Scanner sc = new Scanner(System.in);
			while (true) {
				System.out.println();
				System.out.println("enter time in [yyyy-mm-dd] ");
				System.out.println("enter start date");
				String date = sc.nextLine();
				if (date.equals("end")) {
					break;
				} else {
					LocalDate d = LocalDate.parse(date);
					System.out.println("enter end date");
					String date2 = sc.nextLine();
					LocalDate d2 = LocalDate.parse(date2);
					long days = ChronoUnit.DAYS.between(d, d2);
					System.out.println();
					System.out.print(date + " " + ",");
					System.out.print(date2 + " " + "  ");
					System.out.print("days diff :" + days);
					fw.write(date + " " + ",");
					fw.write(date2 + " " + " ");
					fw.write("days diff : " + days);
					fw.write("\n");
					fw.flush();
				}
			}
			sc.close();
			fw.close();
		} catch (IOException e) {
			System.out.println(e);
		}

	}

}
