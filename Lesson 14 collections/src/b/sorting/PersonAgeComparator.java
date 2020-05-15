package b.sorting;

import java.util.Comparator;

/*
 * כתבו קומפרטור נוסף עבור מיון אנשים לפי השם שלהם
 * */

public class PersonAgeComparator implements Comparator<Person> {

	@Override
	public int compare(Person person1, Person person2) {
		if (person1.getAge() < person2.getAge())
			return -1;
		if (person1.getAge() > person2.getAge())
			return 1;
		return 0;
	}

}
