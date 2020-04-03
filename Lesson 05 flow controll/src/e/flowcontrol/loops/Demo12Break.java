package e.flowcontrol.loops;

public class Demo12Break {

	public static void main(String[] args) {
		// print loach hakefel on screen

		for (int i = 1; i <= 10; i++) {
			if(i==6) {
				break; // will exit the loop
			}
			for (int j = 1; j <= 10; j++) {
				System.out.print(i * j + "\t");
			}
			System.out.println();
		}
	}

}
