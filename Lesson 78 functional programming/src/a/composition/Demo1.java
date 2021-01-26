package a.composition;

import java.util.function.Predicate;

public class Demo1 {

	public static void main(String[] args) {

		{// functional composition

			String str = "Lets try method composition";

			Predicate<String> startsWithL = txt -> txt.startsWith("L");
			Predicate<String> endsWithN = txt -> txt.endsWith("n");
			Predicate<String> startsWithLAndEndsWithN = txt -> startsWithL.test(txt) && endsWithN.test(txt);

			System.out.println(startsWithL.test(str));
			System.out.println(startsWithLAndEndsWithN.test(str));
		}

		System.out.println("=========================");
		{ // java functional composition support

			String str = "So lets try method composition";

			Predicate<String> startsWithL = txt -> txt.startsWith("L");
			Predicate<String> endsWithN = txt -> txt.endsWith("n");
			Predicate<String> startsWithLAndEndsWithN = txt -> startsWithL.and(endsWithN).test(txt);
			Predicate<String> startsWithLOrEndsWithN = txt -> startsWithL.or(endsWithN).test(txt);

			System.out.println(startsWithLAndEndsWithN.test(str));
			System.out.println(startsWithLOrEndsWithN.test(str));

			// NOT
			Predicate<String> notStartsWithL = Predicate.not(startsWithL);
			System.out.println(notStartsWithL.test(str));

		}

	}

}
