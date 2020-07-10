package calc.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {

	private int hitCounter = 0;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// get a request parameter
		// http://localhost:8080/calc.web/theCalc?user=Eldar
		String user = req.getParameter("user");
		if (user == null) {
			user = "Guest";
		}

		// output to server (displayed in the server's console)
		System.out.println("you have reaced the CalculatorServlet: " + user);

		// output to client (displayed in the client's browser)
		PrintWriter out = resp.getWriter();

		out.println("Hello " + user);
		out.println("you have reaced the CalculatorServlet: " + ++hitCounter);

	}

}
