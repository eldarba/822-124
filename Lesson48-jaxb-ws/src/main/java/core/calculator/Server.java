package core.calculator;

import javax.xml.ws.Endpoint;

public class Server {

	public static void main(String[] args) {

		// this is the remote object
		Calculator calculator = new Calculator();
		// define remote object address
		String address = "http://localhost:8080/calc";
		// print the address
		System.out.println("wsdl address:");
		System.out.println(address + "?wsdl");
		// create the endpoint and publish the service
		Endpoint.publish(address, calculator);

	}

}
