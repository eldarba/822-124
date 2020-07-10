package calc.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import calc.core.Calculator;

public class CalculatorServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private Calculator calc = new Calculator();

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		calc.clear();
		// http://localhost:8080/calc.web/theCalc?a=5&b=3&op=mul
		double a = Double.parseDouble(req.getParameter("a"));
		double b = Double.parseDouble(req.getParameter("b"));
		String operation = req.getParameter("op");

		switch (operation) {
		case "add":
			operation = " + ";
			calc.add(a);
			calc.add(b);
			break;
		case "sub":
			operation = " - ";
			calc.add(a);
			calc.sub(b);
			break;
		case "mul":
			operation = " * ";
			calc.add(a);
			calc.mul(b);
			break;
		case "div":
			operation = " / ";
			calc.add(a);
			calc.div(b);
			break;

		default:
			break;
		}

		double res = calc.getCurrResult();

		PrintWriter out = resp.getWriter();
		out.println(a + operation + b + " = " + res);
	}

}
