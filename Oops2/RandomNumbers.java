package Oops2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class RandomNumbers {

	public static void main(String[] args) {
		try {
			FileWriter f = new FileWriter("Random.txt");

			Random r = new Random();
			System.out.println("Random Numbers between 100  are");
			for (int i = 1; i <= 20; i++) {
				int n = r.nextInt(100);
				f.write(n + "\n");
			}
			f.close();
		} catch (IOException ex) {
			System.out.println("Invalid");

		}

	}

}
