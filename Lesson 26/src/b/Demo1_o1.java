package b;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Demo1_o1 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(5);
		list.add(900);
		list.add(9);
		list.add(22);
		list.add(76);

		System.out.println(list.get(0));

		int[] arr = { 2, 5, 7, 2, 3, 5, 4, 1, 9 };
		System.out.println(arr[5]);

		LinkedList<Integer> linkedList = new LinkedList<>();
		System.out.println(linkedList.get(1000));
	}

}
