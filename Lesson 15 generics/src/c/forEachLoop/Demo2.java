package c.forEachLoop;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Demo2 {

	public static void main(String[] args) {

		Set<Integer> set = new HashSet<>();
		set.add(5);
		set.add(8);
		set.add(3);
		System.out.println(set);

//		// for loop
//		System.out.println("=============");
//		for (int i = 0; i < set.size(); i++) {
//			System.out.println(set.get(i));
//		}
//		System.out.println("=============");

		// while loop
		Iterator<Integer> it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("=============");

		// for-each loop
		for (Integer curr : set) {
			System.out.println(curr);
		}
		System.out.println("=============");

	}
}
