package c.forEachLoop;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo1 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(8);
		list.add(3);
		System.out.println(list);

		// for loop
		System.out.println("=============");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("=============");

		// while loop
		Iterator<Integer> it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("=============");

		// for-each loop - NO INDEX
		for (Integer curr : list) {
			System.out.println(curr);
		}
		System.out.println("=============");

	}
}
