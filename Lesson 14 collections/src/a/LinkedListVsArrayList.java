package a;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListVsArrayList {

	public static void main(String[] args) {
		List<String> list;

		list = new ArrayList<>();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");

		// random access
		System.out.println(list.get(2));

		// data manipulation
		System.out.println(list);
		list.remove(0);
		System.out.println(list);

		System.out.println("===============");

		list = new LinkedList<>();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");

		// random access
		System.out.println(list.get(2));

		// data manipulation
		System.out.println(list);
		list.remove(0);
		System.out.println(list);

		// search for an element
		int index = list.indexOf("zzz");
		System.out.println("found at: " + index);
	}

}
