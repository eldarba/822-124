package a;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tar1A {

	public static void main(String[] args) {
		try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in));) {
			System.out.println("enter a line of text");
			String line = in.readLine();
			System.out.println(line);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
