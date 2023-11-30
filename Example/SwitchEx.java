package Example;

import java.util.Scanner;

public class SwitchEx {
	
	public static void main(String[]args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the month");
		int month=sc.nextInt();
	
	int days=switch(month)
			{
	case 2->28;
	case 4,6,9,11->30;
	default ->31;
	
			};
			
			System.out.println(days+" days");

}
}