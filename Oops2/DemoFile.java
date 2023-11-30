package Oops2;

import java.io.FileWriter;
import java.io.IOException;

public class DemoFile {
	public static void main(String[] args) throws IOException {
		String s[] = { "mani,laxman,divakar" };

		FileWriter fw = new FileWriter("mani.txt");
		for (String n : s) {
			fw.write(n+ "\n");}
fw.close();
	}

}
