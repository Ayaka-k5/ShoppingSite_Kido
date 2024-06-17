package jp.co.aforce.logoutServlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/logoutServlet_Customer")
public class LogoutServlet_Customer extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		try {

			HttpSession session = request.getSession();

			if (session.getAttribute("login_Customer") != null) {
				session.removeAttribute("login_Customer");
				request.getRequestDispatcher("/views/logout-out_Customer.jsp").forward(request, response);
			} else {
				request.getRequestDispatcher("/views/logout-error_Customer.jsp").forward(request, response);
			}
		} catch (Exception e) {
			e.printStackTrace(out);
		}
	}
}