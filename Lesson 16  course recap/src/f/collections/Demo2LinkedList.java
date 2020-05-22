package f.collections;

import java.util.LinkedList;
import java.util.List;

public class Demo2LinkedList {

	public static void main(String[] args) {

		List<Integer> numbers = new LinkedList<>();

		long ts1 = System.currentTimeMillis();

		for (int i = 0; i < 100_000; i++) {
			int r = (int) (Math.random() * 1001);
			numbers.add(0, r);
		}

		long ts2 = System.currentTimeMillis();

		System.out.println("DONE");
		System.out.println(ts2 - ts1 + " ms");
	}

}
