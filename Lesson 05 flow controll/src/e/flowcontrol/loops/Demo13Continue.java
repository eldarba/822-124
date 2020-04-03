package e.flowcontrol.loops;

public class Demo13Continue {

	public static void main(String[] args) {
		// print loach hakefel on screen

		for (int i = 1; i <= 10; i++) {
			if(i==6) {
				continue; // will skip to next iteration
			}
			for (int j = 1; j <= 10; j++) {
				System.out.print(i * j + "\t");
				break;
			}
			System.out.println();
		}
	}

}
