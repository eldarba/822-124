package composite;

public class Main {

	public static void main(String[] args) {

		Person zeev = new Person("Zeev Boded");
		zeev.introduceYourself();

		System.out.println("=================");

		Forum mainForum = new Forum("Main Forum");
		mainForum.addMember(new Person("David"));
		mainForum.addMember(new Person("Adam"));
		mainForum.addMember(new Person("Dana"));

		Forum subForum1 = new Forum("Sub Forum 1");
		subForum1.addMember(new Person("Ron"));
		subForum1.addMember(new Person("Gil"));

		mainForum.addMember(new Person("ιερι"));

		mainForum.addMember(subForum1);

		mainForum.introduceYourself();

		System.out.println("=========");
		subForum1.introduceYourself();

	}

}
