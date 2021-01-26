package d.creatingStrams;

import java.util.stream.Stream;

public class Demo1 {

	public static void main(String[] args) {

		Stream<Integer> stream = Stream.of(2, 5, 7, 1);

		stream.forEach(e -> System.out.println(e));
	}

}
