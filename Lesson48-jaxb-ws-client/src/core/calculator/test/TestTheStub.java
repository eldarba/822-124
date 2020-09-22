package core.calculator.test;

import java.rmi.RemoteException;

import core.calculator.Calculator;
import core.calculator.CalculatorProxy;
import core.calculator.Person;

public class TestTheStub {

	public static void main(String[] args) {
		CalculatorProxy proxy = new CalculatorProxy();
		// getting a stub to the remote object
		Calculator calculatorStub = proxy.getCalculator();

		try {
			// sending a request (soap/http) to the ro and get a response
			int result = calculatorStub.sum(45, 65);
			System.out.println(result);
			String str = calculatorStub.greet(new Person(101, "Avi", 53));
			System.out.println(str);
			Person p = calculatorStub.getPerson(107, "Ben", 15);
			System.out.println(p);
			System.out.println(p.getId());
			System.out.println(p.getName());
			System.out.println(p.getAge());

		} catch (RemoteException e) {
			e.printStackTrace();
		}

	}

}
