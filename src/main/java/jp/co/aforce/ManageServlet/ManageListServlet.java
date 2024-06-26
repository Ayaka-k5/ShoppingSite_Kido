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
import jp.co.aforce.dao.ManageListDAO;

@WebServlet("/manageListServlet")
public class ManageListServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		try {
			HttpSession session = request.getSession();

			if (session.getAttribute("login_Manager") == null) {
				request.getRequestDispatcher("/views/login_Manager.jsp").forward(request, response);
			}

			ManageListDAO dao = new ManageListDAO();
			List<ManageList> manageList = dao.search();

			session.setAttribute("manageList", manageList);

			request.getRequestDispatcher("/views/manageList.jsp").forward(request, response);

		} catch (Exception e) {
			e.printStackTrace(out);
		}
	}
}