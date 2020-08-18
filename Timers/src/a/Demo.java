package a;

import java.util.Date;
import java.util.Timer;

public class Demo {

	public static void main(String[] args) throws InterruptedException {

		MyJob task = new MyJob();

		Timer timer = new Timer("timer");
//		System.out.println("will run in 3 seconds");
//		timer.schedule(task, 3000);

		timer.scheduleAtFixedRate(task, new Date(), 5000);

		Thread.sleep(15000);
		System.out.println("cancel timer");
		timer.cancel();

	}

}
