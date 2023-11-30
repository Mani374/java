package javaPractice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class NoOfDays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the Date in format of [DD-MM-yyyy]:");
		String date1 = sc.nextLine();
		String date2 = sc.nextLine();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

		LocalDate ld1 = LocalDate.parse(date1, formatter);
		LocalDate ld2 = LocalDate.parse(date2, formatter);
		long days = ChronoUnit.DAYS.between(ld2, ld1);
		System.out.print("Number of days between those two dates are:" + days);

		sc.close();
	}

}
