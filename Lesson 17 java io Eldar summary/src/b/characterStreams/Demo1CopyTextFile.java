package b.characterStreams;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo1CopyTextFile {

	public static void main(String[] args) {

		try (

				BufferedReader in = new BufferedReader(new FileReader("files/myText1.txt"));

				BufferedWriter out = new BufferedWriter(new FileWriter("files/myText2.txt"));

		) {

			int c = in.read();

			while (c != -1) {
				out.write(c);
				c = in.read();
			}

			System.out.println("copy text finished");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
