package Oops2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class SearchString {

	public static void main(String[] args) throws IOException {
		try (FileReader fr = new FileReader("source.txt"); 
				FileWriter fw = new FileWriter("Target.txt")) {
			BufferedReader fb = new BufferedReader(fr);
			String line;
			String f = "name";
			line = fb.readLine();
			while (line != null) {
				String a[] = line.split(" ");
				for (int i = 0; i < a.length; i++) {
					if (a[i].equals(f))
						fw.write(line + "\n");
				}
				line = fb.readLine();
			}
		}
	}

}
