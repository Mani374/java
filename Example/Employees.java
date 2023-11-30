package Example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;

public class Employees {
	public static void main(String[] args) throws IOException {

		var path = Path.of("Employees.txt");
		var lines = Files.readAllLines(path);
		var employees = new HashMap<String, String>();
		for (var line : lines) {
			var part = line.split(",");
			var departmentName = part[0];
			var employeeName = part[1];
			if (employees.containsKey(departmentName)) {
				var e = employees.get(departmentName);
				employees.put(departmentName, e + "," + employeeName);

			} else {
				employees.put(departmentName, employeeName);
			}

		}
		for (var departmentName : employees.keySet()) {
			System.out.println(departmentName + " - " + employees.get(departmentName));
		}

	}

}