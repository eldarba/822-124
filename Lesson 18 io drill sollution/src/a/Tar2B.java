package a;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Tar2B {

	public static void main(String[] args) {

		File file = new File("files/text/letter.txt");
		File file2 = new File("files/text/letter_copy.txt");

		try (

				BufferedReader in = new BufferedReader(new FileReader(file));

				BufferedWriter out = new BufferedWriter(new FileWriter(file2));

		) {

			String line = in.readLine();

			while (line != null) {
				System.out.println(line);
				out.write(line);
				out.newLine();
				line = in.readLine();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
