package a.characterStreams;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Demo1 {

	public static void main(String[] args) {

		String path = "files/textFile1.txt";

		// ARM - Auto Resource Management
		// this is a character input stream
		try (FileReader in = new FileReader(path)) {
			////////////////////////////////
			// start working with the file

			////////////////////////////////
		} catch (FileNotFoundException e) {
			System.out.println("error - the file: " + path + " was not found");
			e.printStackTrace();
		} catch (IOException e1) {
			System.out.println("error - closing the file straem: " + path + " failed");
			e1.printStackTrace();
		}

	}

}
