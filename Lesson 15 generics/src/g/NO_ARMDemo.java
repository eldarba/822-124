package g;

import java.util.Scanner;

public class NO_ARMDemo {
	
	public static void main(String[] args) {
		
		Scanner sc = null;
		try {
			sc = new Scanner(System.in);
			System.out.println("Enter a number");
			String userInput = sc.nextLine();
			int x = Integer.parseInt(userInput);
			System.out.println("you entered: " + x);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			// do it anyway block
			if(sc != null) {
				sc.close();
				System.out.println("scanner is closed");
			}
		}
	}

}
