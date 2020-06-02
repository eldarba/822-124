package a;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Tar2BPrintWriter {

	public static void main(String[] args) {

		File file = new File("files/text/letter.txt");
		File file2 = new File("files/text/letter_copy2.txt");

		try (

				BufferedReader in = new BufferedReader(new FileReader(file));

				PrintWriter out = new PrintWriter(new FileWriter(file2));

		) {

			String line = in.readLine();

			while (line != null) {
				System.out.println(line);
				out.println(line);
				line = in.readLine();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
