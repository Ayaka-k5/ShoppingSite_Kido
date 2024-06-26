package jp.co.aforce.ManageServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import jp.co.aforce.beans.ManageList;
import jp.co.aforce.dao.ManageDeleteDAO;

@WebServlet("/manageDeleteServlet")
public class ManageDeleteServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		try {
			HttpSession session = request.getSession();

			ManageDeleteDAO dao = new ManageDeleteDAO();
			List<ManageList> manageDelete = dao.search();

			session.setAttribute("manageDelete", manageDelete);

			request.getRequestDispatcher("/views/manageStart.jsp").forward(request, response);

		} catch (Exception e) {
			e.printStackTrace(out);
		}
	}
}