package b.primitives.base;

public class Demo0 {
	
	public static void main(String[] args) {
		
		// integers
		byte n1 = 127;
		byte n2 = -128;
		
		short n3 = 32767;
		short n4 = -32768;
		
		// the default type of integer literals is int
		int x = 1500;
		
		long y = 2500;
		
		long timeStamp = System.currentTimeMillis();
		System.out.println(timeStamp);
		
		// decimals
		float a = 10.6F;
		// the default type of decimal literals is double
		double b = 5.156;
		System.out.println(5);
		System.out.println(b);
		
		System.out.println(0.33333333333333333333333333333D);
		System.out.println(0.33333333333333333333333333333F);
		
		double pi = 3.14;
		
		// logical
		boolean b1 = true;
		boolean b2 = false;
		boolean b3 = 100 > 200;
		boolean b4 = 100 < 200;
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		
//		character - 16 bit unicode
		// A, 1, .
		char c1 = 'A';
		char c2 = 65;
		char c3 = 'à';
		char c4 = 1488;
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
	}

}
