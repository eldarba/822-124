package a.lambda;

public class Demo1 {

	public static void main(String[] args) {

		// Anonymous Inner Class
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("doing something using anonymous inner class");
			}
		});

		t1.start();

		// ========================================
		// Lambda Expression

		Thread t2 = new Thread(() -> {
			System.out.println("doing something using lambda expression");
		});

		t2.start();

	}

}
