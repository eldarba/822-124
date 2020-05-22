package f.collections;

import java.util.Set;
import java.util.TreeSet;

import c.abstractClass.Calculator;
import c.abstractClass.MyCalculatorImpl;

public class TreeIsSorted {

	public static void main(String[] args) {

		Set<String> set = new TreeSet<>();

		set.add("dog");
		set.add("box");
		set.add("java");
		set.add("univercity");
		set.add("html");
		set.add("cat");

		System.out.println(set);

		// elements of a tree must be comparable
		Set<Calculator> s = new TreeSet<>();
		s.add(new MyCalculatorImpl());
		s.add(new MyCalculatorImpl());
	}

}
