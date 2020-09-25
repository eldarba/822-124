package org.tempuri.test;

import java.rmi.RemoteException;

import org.tempuri.CalculatorSoap;
import org.tempuri.CalculatorSoapProxy;

public class TestStub {

	public static void main(String[] args) {

		CalculatorSoap stub = new CalculatorSoapProxy().getCalculatorSoap();

		int a = (int) (Math.random() * 101);
		int b = (int) (Math.random() * 101);
		try {
			int res = stub.add(a, b);
			System.out.println(a + " + " + b + " = " + res);
			res = stub.subtract(a, b);
			System.out.println(a + " - " + b + " = " + res);
			res = stub.multiply(a, b);
			System.out.println(a + " * " + b + " = " + res);
			res = stub.divide(a, b);
			System.out.println(a + " / " + b + " = " + res);
		} catch (RemoteException e) {
			e.printStackTrace();
		}

	}

}
