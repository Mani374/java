package Oops2;

import java.io.FileWriter;
import java.io.IOException;

public class Names {

	public static void main(String[] args) throws IOException {
		FileWriter fr = new FileWriter("Names.txt");
		String s[] = { "mani", "mani kanta", "laxman", "Divakar", "laxman jaswanth", "diva divakar" };
		for (var n : s)
			fr.write(n+"\n");
		fr.close();

	}

}
