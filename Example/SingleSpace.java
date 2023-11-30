package Example;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.regex.Pattern;

public class SingleSpace {

	public static void main(String[] args) throws IOException {
		var n = Path.of("/home/manikanta/eclipse-workspace/javaPractice/space.txt");

		var p = Pattern.compile(" +");
		var read = Files.readString(n);

		var match = p.matcher(read);
		System.out.println(match.replaceAll(" "));

	}

}
