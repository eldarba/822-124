package e.interrupt.app1;

public class App {

	public static void main(String[] args) {
		CountTo10K t = new CountTo10K("t");
		t.start();

		try {
			Thread.sleep(3);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

//		t.interrupt();

		try {
			t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
