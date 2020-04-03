package b.scannerDemo;

import java.util.Scanner;

public class Demo1 {
	
	public static void main(String[] args) {
		System.out.println("Hello");
		
		// System.in; // this is the keyboard
		
		// create a scanner to get input from keyboard
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int x = sc.nextInt(); // wait for user input
		System.out.println("you entered " + x);
		sc.close();
	}

}
