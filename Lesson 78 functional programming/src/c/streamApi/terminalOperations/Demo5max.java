package c.streamApi.terminalOperations;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;

public class Demo5max {

	public static void main(String[] args) {

		{
			Set<Integer> set = new HashSet<>();
			set.add(250);
			set.add(700);
			set.add(25);

			Stream<Integer> stream = set.stream();

			Optional<Integer> optMax = stream.max((a, b) -> a.compareTo(b));

			Optional<Integer> optMin = set.stream().min((a, b) -> a.compareTo(b));

			if (optMax.isPresent()) {
				System.out.println(optMax.get());
			}

			if (optMin.isPresent()) {
				System.out.println(optMin.get());
			}

			// Terminal Operation: reduce
			// sum
			Optional<Integer> optSum = set.stream().reduce((currVal, sum) -> sum + currVal);
			if (optSum.isPresent()) {
				System.out.println("sum: " + optSum.get());
			}

			// convert a stream to array
			Object[] arr = set.stream().toArray();

		}

	}

}
