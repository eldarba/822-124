package core.calculator.test;

import java.rmi.RemoteException;

import core.calculator.Calculator;
import core.calculator.CalculatorProxy;

public class TestTheStub {

	public static void main(String[] args) {
		CalculatorProxy proxy = new CalculatorProxy();
		// getting a stub to the remote object
		Calculator calculatorStub = proxy.getCalculator();

		try {
			// sending a request (soap/http) to the ro and get a response
			int result = calculatorStub.sum(45, 65);
			System.out.println(result);
		} catch (RemoteException e) {
			e.printStackTrace();
		}

	}

}
