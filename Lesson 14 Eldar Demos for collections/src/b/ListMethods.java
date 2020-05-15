package b;

import java.util.ArrayList;
import java.util.List;

public class ListMethods {

	public static void main(String[] args) {

		List<String> lst = new ArrayList<>();

		// add (overload)
		System.out.println(lst);
		lst.add(0, "AAA");
		System.out.println(lst);
		lst.add(0, "BBB");
		System.out.println(lst);
		lst.add(0, "CCC");
		System.out.println(lst);
		System.out.println("==============");
		// set
		String replacedElement = lst.set(0, "ZZZ");
		System.out.println(replacedElement);
		System.out.println(lst);
		System.out.println("==============");

		// get
		String str = lst.get(0);

		// indexOf
		int index = lst.indexOf("AAA");
		System.out.println("element found at index: " + index);
		index = lst.indexOf("HHH");
		System.out.println("element found at index: " + index);

		System.out.println("==============");
		// remove (overload return type is E)
		String removedElement = lst.remove(0);
		System.out.println("removed element : " + removedElement);

	}

}
