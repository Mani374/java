package Interfaces;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Prices {

	public static void main(String[] args) throws IOException {
		var path = Path.of("/home/manikanta/eclipse-workspace/javaPractice/prices.txt");

		Files.lines(path)

				.distinct().sorted((a, b) -> b.compareTo(a)).limit(3).forEach(System.out::println);

	}

}
