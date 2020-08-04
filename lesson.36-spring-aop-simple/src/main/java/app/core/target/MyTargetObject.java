package app.core.target;

import org.springframework.stereotype.Component;

/*
 * Our business class
 * */
@Component
public class MyTargetObject {

	public int sum(int a, int b) throws RuntimeException {
		if (Math.random() < 0.5) {
			throw new RuntimeException("sum failed");
		}
		System.out.println("TARGET: MyTargetObject.sum(int a, int b)");
		return a + b;
	}

	public void sayHi() {
		System.out.println("TARGET: MyTargetObject.sayHi(): Hi There");
	}

}
