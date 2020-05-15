package a;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetExercise {

	public static void main(String[] args) {

		Set<Integer> set = new LinkedHashSet<>();

		while (set.size() < 10) {
			int r = (int) (Math.random() * 11);
			System.out.print(r + ", ");
			set.add(r);
		}
		System.out.println();

		System.out.println(set);
	}

}
