package e.flowcontrol.loops;

public class Demo4Tar {

	public static void main(String[] args) {
		/*
		 * Create a class that defines a random number and prints all numbers from 1 to
		 * that number
		 */
		
		int r = (int) (Math.random()*11);
		System.out.println(r);
		System.out.println("================");
		
		for(int i = 1; i <= r; i++) {
			System.out.println(i);
		}

	}

}
