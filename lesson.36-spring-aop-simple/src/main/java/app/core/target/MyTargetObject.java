package app.core.target;

import org.springframework.stereotype.Component;

/*
 * Our business class
 * */
@Component
public class MyTargetObject {

	public int sum(int a, int b) {
		System.out.println("TARGET: MyTargetObject.sum(int a, int b)");
		return a + b;
	}

	public void sayHi() {
		System.out.println("TARGET: MyTargetObject.sayHi(): Hi There");
	}

}
