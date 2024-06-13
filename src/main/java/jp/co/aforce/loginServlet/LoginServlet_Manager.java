package jp.co.aforce.loginServlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import jp.co.aforce.beans.Login_Manager;
import jp.co.aforce.dao.LoginDAO_Manager;

@WebServlet("/loginServlet_Manager")
public class LoginServlet_Manager extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		try {
			HttpSession session = request.getSession();

			String manager_mailaddress = request.getParameter("manager_mailaddress");
			String manager_password = request.getParameter("manager_password");

			LoginDAO_Manager dao = new LoginDAO_Manager();
			Login_Manager login_Manager = dao.search(manager_mailaddress, manager_password);

			if (login_Manager != null) {
				session.setAttribute("login_Manager", login_Manager);
				request.getRequestDispatcher("/views/login-out_Manager.jsp").forward(request, response);
			} else {
				request.getRequestDispatcher("/views/login-error.jsp").forward(request, response);
			}
		} catch (Exception e) {
			e.printStackTrace(out);
		}
	}
}