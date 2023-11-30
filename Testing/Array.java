package Testing;

import java.util.Scanner;

public class Array {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size number");
		int n = sc.nextInt();
		int sum;
		int a[] = new int[n];
		for (int i = 0; i < n; i++) 
		{
			a[i] = sc.nextInt();
		}
	}
}