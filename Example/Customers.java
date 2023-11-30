package Example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Customers {

	public static void main(String[] args) throws IOException {
		
		var path=Path.of("/home/manikanta/eclipse-workspace/javaPractice/customers.txt");

	     var read=Files.readString(path);
	     System.out.println(read);
		 

}
}