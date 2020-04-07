package a;

import java.util.Arrays;

public class Demo4Args {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(args));
		System.out.println(args.length);

		if (args.length > 0) {
			System.out.println("Hello " + args[0]);
		} else {
			System.out.println("Hello Guest");
		}
	}

}
