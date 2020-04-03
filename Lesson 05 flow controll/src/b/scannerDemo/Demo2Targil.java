package b.scannerDemo;

import java.util.Scanner;

public class Demo2Targil {

	public static void main(String[] args) {
		/*
		 * get age from user as input and print if the age is legal or not (0 - 120)
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter age: ");
		int age = sc.nextInt();
		System.out.println("age: " + age);
		// is it legal?
		if(age >= 0 && age <= 120) {
			System.out.println("legal");
		}else {
			System.out.println("ilegal");
		}
		sc.close();

	}

}
