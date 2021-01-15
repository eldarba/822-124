package demo.systemProperties;

public class Demo1 {

	public static void main(String[] args) {

		new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("do this and that");

			}
		}).start();
	}

}
