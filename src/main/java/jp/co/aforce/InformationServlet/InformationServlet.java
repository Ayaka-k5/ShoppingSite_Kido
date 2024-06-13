package jp.co.aforce.InformationServlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import jp.co.aforce.beans.Information;
import jp.co.aforce.dao.InformationDAO;

@WebServlet("/informationServlet")
public class InformationServlet extends HttpServlet {
	@Override
	protected void doPost(
			HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		try {
			HttpSession session = request.getSession();

			String customer_mailaddress = request.getParameter("customer_mailaddress");
			String customer_password = request.getParameter("customer_password");
//			String customer_lastname = request.getParameter("customer_lastname");
//			String customer_firstname = request.getParameter("customer_firstname");
//			String customer_phonenumber = request.getParameter("customer_telephone");
//			String customer_address = request.getParameter("customer_address");

			InformationDAO dao = new InformationDAO();
			Information information = dao.search(customer_mailaddress, customer_password);

			if (information != null) {
				session.setAttribute("information", information);
				request.getRequestDispatcher("/views/login-out_Customer.jsp").forward(request, response);
			} else {
				request.getRequestDispatcher("/views/login-error.jsp").forward(request, response);
			}
		} catch (Exception e) {
			e.printStackTrace(out);
		}
	}

}