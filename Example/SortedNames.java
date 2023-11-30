package Example;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortedNames {
	public static void main(String[] args) throws IOException {
		List<String> names = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		String name;

		while (true) {
			System.out.print("Enter the String:");
			name = sc.nextLine();
			if (name.equals("end")) {
				break;
			} else {
				names.add(name);

			}
			Collections.sort(names);
			FileWriter fr = new FileWriter("/home/manikanta/eclipse-workspace/javaPractice/sortedNames.txt");

			for (var n : names) {
				fr.write(n + "\n");
			}
			fr.close();
			sc.close();
		}

	}

}
