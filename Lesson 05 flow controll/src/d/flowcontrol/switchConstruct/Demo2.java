package d.flowcontrol.switchConstruct;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		
		
		System.out.println("enter mode: ON, OFF, STAND_BY");
		Scanner sc = new Scanner(System.in);
		String mode = sc.nextLine();
		sc.close();
		System.out.println(mode);
		
		switch (mode) {
		case "ON":
			System.out.println("machine is running");
			break;
		case "OFF":
			System.out.println("machine is off");
			break;
		case "STAND_BY":
			System.out.println("machine is in stand by");
			break;
		default:
			System.out.println(mode + " is not a supported machine mode");
			break;
		}


	}

}
