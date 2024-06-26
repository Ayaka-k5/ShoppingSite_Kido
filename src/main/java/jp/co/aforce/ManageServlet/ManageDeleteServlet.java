package jp.co.aforce.ManageServlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import jp.co.aforce.dao.ManageDeleteDAO;

@WebServlet("/manageDeleteServlet")
public class ManageDeleteServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		try {
			HttpSession session = request.getSession();

			int product_id = Integer.parseInt(request.getParameter("product_id"));
			
			ManageDeleteDAO dao = new ManageDeleteDAO();
			int manageDelete = dao.delete(product_id);

			session.setAttribute("manageDelete", manageDelete);

			request.getRequestDispatcher("/views/manageDeleteOut.jsp").forward(request, response);

		} catch (Exception e) {
			e.printStackTrace(out);
		}
	}
}