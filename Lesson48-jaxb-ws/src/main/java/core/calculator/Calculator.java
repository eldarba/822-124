package core.calculator;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

// defining RO - Remote Object

@WebService
@SOAPBinding(style = Style.DOCUMENT)
public class Calculator {

	public int sum(int a, int b) {
		return a + b;
	}

}
