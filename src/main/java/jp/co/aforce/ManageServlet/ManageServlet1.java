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
import jp.co.aforce.beans.Manage;
import jp.co.aforce.dao.ManageDAO;

@WebServlet("/manageServlet1")
public class ManageServlet1 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		try {
			HttpSession session = request.getSession();

			ManageDAO dao = new ManageDAO();
			List<Manage> list = dao.search();

			session.setAttribute("list", list);

			request.getRequestDispatcher("/views/manageB.jsp").forward(request, response);

		} catch (Exception e) {
			e.printStackTrace(out);
		}
	}
}