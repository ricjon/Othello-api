package com.ricmac.othello.api;

import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class Othello_apiServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/plain");
		resp.getWriter().println("Hello, othello world");
	}
}
