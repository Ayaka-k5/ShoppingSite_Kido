package jp.co.aforce.loginServlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import jp.co.aforce.beans.Login_Customer;
import jp.co.aforce.dao.LoginDAO_Customer;

@WebServlet("/loginServlet_Customer")
public class LoginServlet_Customer extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		try {
			HttpSession session = request.getSession();

			String customer_mailaddress = request.getParameter("customer_mailaddress");
			String customer_password = request.getParameter("customer_password");

			LoginDAO_Customer dao = new LoginDAO_Customer();
			Login_Customer login_Customer = dao.search(customer_mailaddress, customer_password);

			if (login_Customer != null) {
				session.setAttribute("login_Customer", login_Customer);
				request.getRequestDispatcher("/views/login-out_Customer.jsp").forward(request, response);
			} else {
				request.getRequestDispatcher("/views/login-error.jsp").forward(request, response);
			}
		} catch (Exception e) {
			e.printStackTrace(out);
		}
	}
}