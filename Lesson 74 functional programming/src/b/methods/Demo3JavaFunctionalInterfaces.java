package b.methods;

import java.time.LocalDate;
import java.util.Date;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Demo3JavaFunctionalInterfaces {

	public static void main(String[] args) {

		// Function
		// implementation option 1: define an implementing class
		Function<Person, String> stringToIntFunctionA = new MyFunction();

		// implementation option 2: anonymous inner class
		Function<Person, String> stringToIntFunctionB = new Function<Person, String>() {
			@Override
			public String apply(Person t) {
				return t.toString();
			}
		};

		// implementation option 3: lambda expression - only for functional interfaces
		Function<String, Integer> stringToIntFunction = str -> Integer.parseInt(str);
		Integer x = stringToIntFunction.apply("250");
		System.out.println(x++);
		System.out.println(x++);

		// Predicate
		Predicate<String> stringLengthPredicate = s -> s.length() <= 10;
		System.out.println(stringLengthPredicate.test("aaaqqqqqqqqqqqqqqqqqqqqqq"));

		// UnaryOperator
		UnaryOperator<Person> operator = p -> new Person(p.id, "Moshe");
		Person p = new Person(111, "David");
		System.out.println(p);
		p = operator.apply(p);
		System.out.println(p);

		// BinaryOperator
		BinaryOperator<String> binaryOperator = (a, b) -> a.concat(b);
		String str = binaryOperator.apply("today is ", "Tuesday");
		System.out.println(str);

		// Supplier
		Supplier<Integer> supplier = () -> (int) (Math.random() * 101);
		System.out.println(supplier.get());
		System.out.println(supplier.get());
		System.out.println(supplier.get());

		Supplier<Date> yesterdaySupplier = () -> {
			Date date = java.sql.Date.valueOf(LocalDate.now().minusDays(1));
			return date;
		};

		System.out.println(yesterdaySupplier.get());

		// Consumer
		Consumer<Person> consumer = p1 -> System.out.println(p1);
		consumer.accept(new Person(222, "Beny"));

		System.out.println("===========");
		Consumer<Person> consumer2 = person -> {
			System.out.println(person.id);
			System.out.println(person.name);
		};
		consumer2.accept(new Person(222, "Beny"));
	}

	// a method using Java built in functional interface
	public Integer getValue(Supplier<Integer> suplier) {
		return suplier.get();
	}

	// a method using our functional interface
	public void paint(Painter painter) {
		painter.paint();
	}

}

interface Painter {
	void paint();
}

class Person {

	final int id;
	final String name;

	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}

}

class MyFunction implements Function<Person, String> {

	@Override
	public String apply(Person p) {

		return p.toString();
	}

}
