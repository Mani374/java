package Oops2;

import java.io.*;

public class BufferReader {

	public static void main(String[] args) throws IOException {
		// FileReader fr = new FileReader("maninames.txt");
		Reader r = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);
		//LineNumberReader lr=new LineNumberReader(r);
		String s;
	
		s = br.readLine();
		while (s != null) {
			System.out.println(s);
			s = br.readLine();
		}
		br.close();
		r.close();

	}

}
