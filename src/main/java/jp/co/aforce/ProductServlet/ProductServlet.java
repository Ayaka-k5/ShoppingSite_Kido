package jp.co.aforce.ProductServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import jp.co.aforce.beans.Product;
import jp.co.aforce.dao.ProductDAO;

@WebServlet("/productServlet")
public class ProductServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		try {
			HttpSession session = request.getSession();

			ProductDAO dao = new ProductDAO();
			List<Product> list = dao.search();

			session.setAttribute("list", list);

			request.getRequestDispatcher("/views/productB.jsp").forward(request, response);

		} catch (Exception e) {
			e.printStackTrace(out);
		}
	}
}