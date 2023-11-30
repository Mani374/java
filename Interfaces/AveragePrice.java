package Interfaces;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class AveragePrice {
	public static void main(String[] args) throws IOException {
		var path = Path.of("/home/manikanta/eclipse-workspace/javaPractice/prices.txt");
		var read = Files.readAllLines(path);
		int sum = 0, count = 0;
		for (var prices : read) {
			sum += Integer.parseInt(prices);
			count++;
		}
		int average = sum / count;

		Files.lines(path).map(Integer::parseInt).filter(v -> v > average).forEach(System.out::println);
	}
}
