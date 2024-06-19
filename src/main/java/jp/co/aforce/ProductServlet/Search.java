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

@WebServlet("/search")
public class Search extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		try {
			HttpSession session = request.getSession();
			
			String keyword=request.getParameter("keyword");

			ProductDAO dao = new ProductDAO();
			List<Product> list2 = dao.search(keyword);
			
			session.setAttribute("list2", list2);

			request.getRequestDispatcher("/views/product-search.jsp").forward(request, response);

		} catch (Exception e) {
			e.printStackTrace(out);
		}
	}
}