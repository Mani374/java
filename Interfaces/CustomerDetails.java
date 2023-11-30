package Interfaces;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CustomerDetails {
	public static void main(String[] args) {

		try {
			String nameRegex = "[A-Za-z]+";
			String mobileRegex = "\\d{10}";
			Pattern namePattern = Pattern.compile(nameRegex);
			Pattern mobileNumPattern = Pattern.compile(mobileRegex);
			var path = Path.of("/home/manikanta/eclipse-workspace/javaPractice/customers.txt");
			var read = Files.readString(path);
			TreeMap<String, String> sortedNames = new TreeMap<>();
			Matcher name = namePattern.matcher(read);
			Matcher number = mobileNumPattern.matcher(read);
			while (name.find() && number.find()) {
				String employeeName = name.group();
				String mobileNumber = number.group();
				sortedNames.put(employeeName, mobileNumber);
			}
			for (String i : sortedNames.keySet())
				System.out.println(i + ":" + sortedNames.get(i));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
