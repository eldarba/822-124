package c;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tar3A {

	public static void main(String[] args) {

		System.out.println("enter a line of text");

		try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in));) {

			String line = in.readLine();

			while (!line.equalsIgnoreCase("exit")) {
				System.out.println(line);
				System.out.println("enter a line of text");
				line = in.readLine();
			}

			System.out.println("Bye");

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
