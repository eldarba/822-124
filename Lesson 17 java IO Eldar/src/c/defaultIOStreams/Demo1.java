package c.defaultIOStreams;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

public class Demo1 {

	public static void main(String[] args) {
		// there are 3 default streams in Java
		// these are byte streams - for historical reasons

		PrintStream out = System.out; // standard output (console)
		PrintStream err = System.err; // standard err (console)
		InputStream in = System.in; // standard in (keyboard)

		out.write(65);
		out.flush();

		try {
			System.out.println();
			System.out.println("enter a character");
			int x = in.read();
			out.println(x);
			out.println((char) x);
			out.write(x);
			out.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
