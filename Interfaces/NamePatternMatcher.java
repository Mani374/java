//package Interfaces;
//
//import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.util.*;
//
//public class Examples {
//	public static void main(String[] args) throws IOException {
//
//		var name = Path.of("/home/manikanta/eclipse-workspace/javaPractice/Employees.txt");
//		var readLines = Files.readAllLines(name);
//		var employeeNames = new HashSet<String>(readLines);
//		for (var n : employeeNames) {
//			System.out.println(n);
//		}
//
//	}
//
//}
package Interfaces;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;

public class NamePatternMatcher {
	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("Usage: java NamePatternMatcher <filename>");
			return;
		}

		String filename = args[0];

		try {
			BufferedReader reader = new BufferedReader(new FileReader("names.txt"));
			String line;

			// Define a pattern with a single space
			Pattern pattern = Pattern.compile(" ");

			while ((line = reader.readLine()) != null) {
				// Split the line using the pattern
				String[] parts = pattern.split(line);

				// Display the parts of the name
				for (String part : parts) {
					System.out.println(part);
				}
			}

			reader.close();
		} catch (IOException e) {
			System.err.println("Error reading the file: " + e.getMessage());
		}
	}
}
