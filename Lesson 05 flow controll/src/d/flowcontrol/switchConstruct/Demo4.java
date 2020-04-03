package d.flowcontrol.switchConstruct;

import java.util.Scanner;

public class Demo4 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter grade from 0 - 10: ");
		int grade = sc.nextInt();
		sc.close();
		
		switch (grade) {
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("Fail");
			break;
		case 6:
		case 7:
			System.out.println("OK");
			break;
		case 8:
		case 9:
		case 10:
			System.out.println("GOOD");
			break;

		default:
			System.out.println(grade + " is out of range");
			break;
		}
	}

}
