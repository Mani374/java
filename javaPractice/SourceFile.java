package javaPractice;

import java.io.FileWriter;
import java.io.IOException;

public class SourceFile {

	public static void main(String[] args) throws IOException {
		FileWriter fr = new FileWriter("source.txt");

		String name[] = { "my name is manikanta", "my friend  name is jaswanth", "and another friend name is divakar" ,"hi good morning"};

		for (var n : name)
			fr.write(n+"\n");
		fr.close();

	}

}
