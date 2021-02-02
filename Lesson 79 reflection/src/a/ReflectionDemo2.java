package a;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class ReflectionDemo2 {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		Class<Employee> clazz = Employee.class;

		System.out.println(clazz);
		System.out.println(clazz.getName());
		System.out.println(clazz.getSimpleName());

		if (clazz.isInterface()) {
			System.out.println("this is an interface");
		} else {
			System.out.println("this is NOT an interface");
		}

		System.out.println("================");
		System.out.println(clazz.getSimpleName() + " implements interfaces");
		Class<?>[] implementedInterfaces = clazz.getInterfaces();
		for (Class<?> c : implementedInterfaces) {
			System.out.println(c.getSimpleName());
		}

		System.out.println("================");
		System.out.println(clazz.getSimpleName() + " extends " + clazz.getSuperclass().getName());

		// Examine methods
		System.out.println("================");
		System.out.println(clazz.getSimpleName() + " methods:");
		Method[] methods = clazz.getDeclaredMethods();
		for (Method method : methods) {
			System.out.println(method.getName() + "-params:" + Arrays.toString(method.getParameters()) + "-returns:"
					+ method.getReturnType().getName());
		}

		// Examine ctors
		System.out.println("================");
		System.out.println(clazz.getSimpleName() + " ctors:");
		Constructor<?>[] ctors = clazz.getDeclaredConstructors();
		for (Constructor<?> constructor : ctors) {
			System.out.println(constructor);
		}

		System.out.println("*** fetch a ctor and use it ==============");
		// fetch a ctor and use it
		Constructor<Employee> ctor = clazz.getDeclaredConstructor(int.class, String.class);
		System.out.println("is this reflected object accessible to caller? " + ctor.canAccess(null));
		ctor.setAccessible(true);
		System.out.println("is this reflected object accessible to caller? " + ctor.canAccess(null));
		Employee e = ctor.newInstance(101, "Dan");
		System.out.println(e);

		// fetch a method and use it
		System.out.println("*** fetch a method and use it ==============");
		Method method = Employee.class.getDeclaredMethod("performTask", String.class, int.class);
		Object result = method.invoke(e, "End the day", 5);
		System.out.println(result);

	}

}
