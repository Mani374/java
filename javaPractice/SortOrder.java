package javaPractice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Scanner;

public class SortOrder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		DateTimeFormatter originalFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

		LocalDate[] sd = new LocalDate[5];

		for (int i = 0; i < 5; i++) {
			System.out.print("Enter the " + (i + 1) + " date in formate dd-mm-yyy : ");
			sd[i] = LocalDate.parse(sc.nextLine(), originalFormatter);
		}

		Arrays.sort(sd);

		for (LocalDate i : sd)
			System.out.println("\n" + i.format(originalFormatter));

		sc.close();

	}

}
