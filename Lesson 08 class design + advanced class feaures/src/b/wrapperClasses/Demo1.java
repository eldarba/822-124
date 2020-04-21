package b.wrapperClasses;

import java.util.Arrays;
import java.util.Date;

import a.Box;

public class Demo1 {

	public static void main(String[] args) {

		Box[] boxes = new Box[5];
		int[] numbers = new int[5];
		String[] names = new String[5];

		Object[] objects = new Object[10];
		objects[0] = new Box(2, 2, 2);
		objects[1] = "aaa";
		objects[2] = new Date();
		objects[3] = new Integer(5);
		objects[4] = Integer.valueOf(5);
		objects[5] = 5;
		System.out.println(Arrays.toString(objects));

		System.out.println(objects[5].getClass());

		{
			Integer x = new Integer(5);
			Integer y = new Integer(5);

			System.out.println(x == y);
			System.out.println(x.equals(y));
		}

		{
			Integer x = Integer.valueOf(5);
			Integer y = Integer.valueOf(5);

			System.out.println(x == y);
			System.out.println(x.equals(y));
		}

	}

}
