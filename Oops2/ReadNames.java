package Oops2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadNames {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("Names.txt");
		BufferedReader fb = new BufferedReader(fr);
		String line;

		line = fb.readLine();
		while (line != null) {
			String words[] = line.split(" ");

			if (words.length >= 2)
				System.out.println(line);
			line = fb.readLine();
		}

		fb.close();
		fr.close();

	}

}
