package a.deadlock;

import java.lang.Thread.State;

public class DedlockApp {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName()  + " started");
		
		Key a = new Key("A");
		Key b = new Key("B");
		
		MyThread t1 = new MyThread(a, b, "t1");
		MyThread t2 = new MyThread(b, a, "t2");
		
		t1.start();
		t2.start();
		
		// get the state of t1
		State st = t1.getState();
		System.out.println("state of t1: " + st);
		//
		
		try {
			t1.join(10_000); // current thread (main) will wait for t1 to terminate
			t2.join(10_000); // current thread (main) will wait for t2 to terminate
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(Thread.currentThread().getName()  + " finished");
	}

}
