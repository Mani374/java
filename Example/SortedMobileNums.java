package Example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.TreeSet;

public class SortedMobileNums {
	public static void main(String[] args) throws IOException {
		var path = Path.of("/home/manikanta/eclipse-workspace/javaPractice/Mobiles.txt");
		var read = Files.readAllLines(path);
		var sortedMobNums = new TreeSet<String>(read);

		for (var n : sortedMobNums) {
			try {

				if (n.length() == 10)
					System.out.println(n);
			} catch (Exception e) {

			}
		}

	}
}
