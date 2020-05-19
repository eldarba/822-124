package e.staticImport;

import static f.Leyad.Y;
import static f.Leyad.sayHello;
import static f.Leyad.x;
import static java.lang.Math.E;
import static java.lang.Math.PI;
import static java.lang.Math.random;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Demo1 {

	public static void main(String[] args) {

		Date date = new Date();
		List<Integer> list = new ArrayList<>();

		System.out.println(PI);
		System.out.println(E);
		System.out.println(random());

		System.out.println(x);
		System.out.println(Y);
		System.out.println(sayHello());

	}

}
