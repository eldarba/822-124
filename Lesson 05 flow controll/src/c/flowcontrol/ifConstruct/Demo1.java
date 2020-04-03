package c.flowcontrol.ifConstruct;

public class Demo1 {

	public static void main(String[] args) {

		int a = (int) (Math.random() * 11);
		System.out.println(a);

		if (a <= 5)
			System.out.println("small");
		System.out.println("-END-");
	}

}
