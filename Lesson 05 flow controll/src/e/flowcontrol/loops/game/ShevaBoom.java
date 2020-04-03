package e.flowcontrol.loops.game;

public class ShevaBoom {

	public static void main(String[] args) {

		lbl: for (int i = 1; i <= 1000; i++) {
			// is it a multiple of 7
			if (i % 7 == 0) {
				System.out.println("boom");
				continue;
			}
			// contains 7
			int n = i;
			while (n != 0) {
				if (n % 10 == 7) {
					System.out.println("boom");
					continue lbl;
				}
				n /= 10;
			}

			System.out.println(i);
		}
	}

}
