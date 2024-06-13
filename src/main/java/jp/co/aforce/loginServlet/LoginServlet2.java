package jp.co.aforce.loginServlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import jp.co.aforce.beans.Login2;
import jp.co.aforce.dao.LoginDAO2;

@WebServlet("/loginServlet2")
public class LoginServlet2 extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		try {
			HttpSession session = request.getSession();

			String manager_mailaddress = request.getParameter("manager_mailaddress");
			String manager_password = request.getParameter("manager_password");

			LoginDAO2 dao2 = new LoginDAO2();
			Login2 login2 = dao2.search(manager_mailaddress, manager_password);

			if (login2 != null) {
				session.setAttribute("login2", login2);
				request.getRequestDispatcher("/views/login-out2.jsp").forward(request, response);
			} else {
				request.getRequestDispatcher("/views/login-error.jsp").forward(request, response);
			}
		} catch (Exception e) {
			e.printStackTrace(out);
		}
	}
}