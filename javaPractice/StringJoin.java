package javaPractice;
 
import java.util.Scanner;
import java.util.StringJoiner;

public class StringJoin {

	public static void main(String[] args) {

		StringJoiner sj = new StringJoiner("-");

		Scanner sc = new Scanner(System.in);

		String s;

		while (true) {

			System.out.print("Enter String : ");
			s = sc.nextLine();

			if (s.equals("end"))
				break;

			else
				sj.add(s);
		}

		System.out.println(sj.toString());

		sc.close();
	}

}