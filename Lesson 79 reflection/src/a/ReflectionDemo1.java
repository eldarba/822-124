package a;

public class ReflectionDemo1 {

	public static void main(String[] args) throws ClassNotFoundException {

		Employee e = new Employee();
		Class<?> clazz1 = e.getClass();
		System.out.println(clazz1);

		Class<?> clazz2 = Class.forName("a.Employee");
		System.out.println(clazz2);

		Class<Employee> clazz3 = Employee.class;
		System.out.println(clazz3);

		System.out.println("all primitives are reflected as class");
		System.out.println(int.class);
		System.out.println(boolean.class);
		System.out.println(void.class);

	}

}
