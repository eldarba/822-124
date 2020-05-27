package b.characterStreams;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo2CopyTextFileLines {

	public static void main(String[] args) {

		try (

				BufferedReader in = new BufferedReader(new FileReader("files/myText1.txt"));

				BufferedWriter out = new BufferedWriter(new FileWriter("files/myText3.txt"));

		) {

			String line = in.readLine();

			while (line != null) {
				out.write(line);
				out.newLine();
				line = in.readLine();
			}

			System.out.println("copy text lines finished");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
