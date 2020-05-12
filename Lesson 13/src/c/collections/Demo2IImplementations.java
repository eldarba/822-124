package c.collections;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import b.targil.vehicles.SportsCar;

public class Demo2IImplementations {

	public static void main(String[] args) {

		// LIST
		List list = new ArrayList();

		System.out.println(list.size());

		list.add("aaa");
		list.add("aaa");
		list.add(new Date());
		list.add(new SportsCar(555));
		list.add(125);
		list.add(125.32);
		list.add("aaa");

		System.out.println(list.size());

		System.out.println(list);

		System.out.println("===============");
		// SET
		Set set = new HashSet();

		System.out.println(set.size());

		set.add("aaa");
		set.add("aaa");
		set.add(new Date());
		set.add(new SportsCar(555));
		set.add(125);
		set.add(125.32);
		set.add("aaa");

		System.out.println(set.size());

		System.out.println(set);
	}

}
