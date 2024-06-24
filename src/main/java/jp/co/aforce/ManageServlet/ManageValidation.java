package jp.co.aforce.ManageServlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/manageValidation")
public class ManageValidation extends HttpServlet {
	@Override
	protected void doPost(
			HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();

		if (session.getAttribute("login_Manager") == null) {
			request.getRequestDispatcher("/views/login_Manager.jsp").forward(request, response);
		}

		request.getRequestDispatcher("/views/manage.jsp").forward(request, response);

	}
}