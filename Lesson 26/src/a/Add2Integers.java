package a;

public class Add2Integers {

	public static void main(String[] args) {

		int a = 0b101;
		int b = 0b10011;

		print(a);
		print(b);
		System.out.println("================");
		print(a + b);

	}

	public static void print(int val, int pad) {
		// %8s
		String str = String.format("%" + pad + "s", Integer.toBinaryString(val)).replace(' ', '0');
		System.out.println(str);
	}

	public static void print(int val) {
		print(val, 8);
	}

}
