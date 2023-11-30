package Oops2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class enumtest
{
	public static void main(String[]args)
	{

		DateTimeFormatter format =
				
				DateTimeFormatter.ofPattern("dd-MMM-uuuu H:m:s");
			
				System.out.println
				
				(LocalDateTime.now().format(format));
				
				}
		
		
		
		}

