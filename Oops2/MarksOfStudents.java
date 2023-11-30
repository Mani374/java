package Oops2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class MarksOfStudents {

	public static void main(String[] args) throws IOException {
		FileWriter f = new FileWriter("Marks.txt");
//		String s = "89,80,90";
//		String marks2[] = { "70, ", "94 ,", "88 " };
//		String marks3[] = { "78, ", "92 ,", "90 " };
         Scanner sc = new Scanner(System.in);
          while(true)
          {
        	  String s1 = sc.nextLine();
        	  if(s1.equals("end"))
        	  {
        		  break;
        	  }
        	  else
        	  {
        		  f.write(s1);
        	  }
        	  f.close();
        	  
          }
//		for (var n : marks1)
//			f.write(n);
//		System.out.println("\n");
//		
//		for (var n : marks2)
//			f.write(n+"\n");
//		
//		for (var n : marks3)
//			f.write(n);
		

		//f.close();
	}

}
