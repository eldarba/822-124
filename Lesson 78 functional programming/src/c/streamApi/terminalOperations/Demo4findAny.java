package c.streamApi.terminalOperations;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;

public class Demo4findAny {

	public static void main(String[] args) {

		{
			Set<String> set = new HashSet<String>();
			set.add("one");
			set.add("two");
			set.add("three");

			Stream<String> stream = set.stream();

//			Optional<String> opt = stream.findAny();
			Optional<String> opt = stream.findFirst();

			if (opt.isPresent()) {
				System.out.println(opt.get());
			}
		}

	}

}
