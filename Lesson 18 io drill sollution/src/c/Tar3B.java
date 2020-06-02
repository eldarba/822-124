package c;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Tar3B {

	public static void main(String[] args) {

		System.out.println("enter a line of text");

		File file = new File("files/text/userLines.txt");

		try (

				BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

				PrintWriter out = new PrintWriter(file);

		) {

			String line = in.readLine();

			while (!line.equalsIgnoreCase("exit")) {
				out.println(line);
				System.out.println("enter a line of text");
				line = in.readLine();
			}

			System.out.println("Bye");

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
