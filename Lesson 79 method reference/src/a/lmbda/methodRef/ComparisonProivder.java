package a.lmbda.methodRef;

public class ComparisonProivder {

	public int compareByName(Person p1, Person p2) {
		return p1.getName().compareTo(p2.getName());
	}

	public int compareByAge(Person p1, Person p2) {
		return p1.getBirthdate().compareTo(p2.getBirthdate());
	}

}
