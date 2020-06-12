package c.waitNotify.producerConsumer;

import java.util.LinkedList;
import java.util.List;

public class Stack {

	private List<Integer> list = new LinkedList<Integer>();

	/**
	 * max capacity of the stack
	 */
	public static final int MAX = 5;

	/**
	 * The push method gets a number and add it to the stack. If the stack is full
	 * this method waits until notified. after adding this method notifies the
	 * waiting threads so consumers can consume.
	 * 
	 * @param val the value to be added
	 */
	public synchronized void push(int val) {
		while (list.size() == MAX) {
			try {
				System.out.println(Thread.currentThread().getName() + " is waiting");
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		list.add(0, val);
		System.out.println(Thread.currentThread().getName() + " pushed " + val);
		notifyAll(); // notify for the waiting consumers
	}

	public synchronized int pop() {
		while (list.isEmpty()) {
			try {
				System.out.println(Thread.currentThread().getName() + " is waiting");
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.notifyAll(); // notify for the waiting producers
		int val = list.remove(0);
		System.out.println(Thread.currentThread().getName() + " popped " + val);
		return val;
	}

}
