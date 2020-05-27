package c.streamBridges;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Demo1 {

	public static void main(String[] args) {

		try (

				BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

				BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

		) {

			out.write("hello user, enter your name: ");
			out.flush();
			String userName = in.readLine();
			out.newLine();
			out.write("Hello " + userName);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
