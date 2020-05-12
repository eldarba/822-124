package c.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Demo3Generics {

	public static void main(String[] args) {

		// LIST of String (type safety)
		List<String> list = new ArrayList<>();

		System.out.println(list.size());

		list.add("hello");
		list.add("world");
		list.add("of");
		list.add("collections");
		list.add("collections");
		list.add("collections");

		System.out.println(list.size());

		System.out.println(list);

		System.out.println("===============");
		// SET
		Set<String> set = new HashSet<>();

		System.out.println(set.size());

		set.add("hello");
		set.add("world");
		set.add("of");
		set.add("collections");
		set.add("collections");
		set.add("collections");

		System.out.println(set.size());

		System.out.println(set);
	}

}
