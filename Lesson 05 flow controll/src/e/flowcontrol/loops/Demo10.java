package e.flowcontrol.loops;

public class Demo10 {
	
	public static void main(String[] args) {
		
		int lines = (int) (Math.random()*8) + 3;
		int length = (int) (Math.random()*8) + 3;
		System.out.println(lines + " lines");
		System.out.println(length + " length");
		
		for (int i = 0; i < lines; i++) {
			
			for (int j = 1; j <= length; j++) {
				System.out.print(" * ");
			}
			System.out.println();
			
		}
		
	}

}
