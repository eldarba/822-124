package c.flowcontrol.ifConstruct.exercise;

public class Tar1 {

	/*
	 * Create a class that defines 2 random numbers and prints 
	 * 
	 * the bigger value
	 */
	public static void main(String[] args) {
		
		int a = (int) (Math.random()*11);
		int b = (int) (Math.random()*11);
		System.out.println(a + ", " + b);
		
		if(a>b) {
			System.out.println(a);
		}else {
			System.out.println(b);
		}

	}
}
