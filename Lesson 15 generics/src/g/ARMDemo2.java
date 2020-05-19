package g;

import java.util.Scanner;

public class ARMDemo2 {

	public static void main(String[] args) {
		
		// ARM mechanism closes resources automatically

		// to use ARM put resources in the () between "try" and "{"
		try (Scanner sc = new Scanner(System.in);) {
			System.out.println("Enter a number");
			String userInput = sc.nextLine();
			int x = Integer.parseInt(userInput);
			System.out.println("you entered: " + x);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
