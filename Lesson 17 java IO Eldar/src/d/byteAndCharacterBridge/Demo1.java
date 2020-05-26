package d.byteAndCharacterBridge;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Demo1 {

	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		try {
			System.out.println("enter a character");
			int x = in.read();
			System.out.println(x);
			System.out.println((char) x);

			System.out.println("=============");
			OutputStreamWriter out = new OutputStreamWriter(System.out);
			System.out.write(x);
			System.out.flush();
			System.out.println();
			out.write(x);
			out.flush();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
