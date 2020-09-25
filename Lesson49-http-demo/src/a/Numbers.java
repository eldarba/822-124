package a;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/numbers")
public class Numbers extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private List<Integer> list = new ArrayList<Integer>();

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		out.println(list);
		System.out.println(list);

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Integer newVal = Integer.parseInt(req.getParameter("newVal"));
		list.add(newVal);
		doGet(req, resp);
	}

	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		doGet(req, resp);
		System.out.println(list);

		Integer currVal = Integer.parseInt(req.getParameter("currVal"));
		Integer newVal = Integer.parseInt(req.getParameter("newVal"));

		int index = list.indexOf(currVal);
		if (index != -1) {
			list.set(index, newVal);
		}

		doGet(req, resp);
		System.out.println(list);

	}

	// add a server handling for HTTP DELETE method
	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
		System.out.println(list);
		Integer currVal = Integer.parseInt(req.getParameter("currVal"));
		boolean found = list.remove(currVal);

		doGet(req, resp);
		System.out.println(list);

		PrintWriter out = resp.getWriter();
		out.println("found=" + found);

	}

}
