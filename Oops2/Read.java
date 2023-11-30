package Oops2;

import java.io.FileReader;
import java.io.IOException;

public class Read {

	public static void main(String[] args) throws IOException {
	FileReader fr = new FileReader("maninames.txt");

		while (true) {
			int ch = fr.read();
			if (ch == -1)
				break;

			System.out.print((char) ch);
			
		}
		fr.close();
}

}
