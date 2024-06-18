package jp.co.aforce.ProductServlet;

import java.io.IOException;
import java.io.PrintWriter;

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

			String product_image = request.getParameter("product_image");

			ProductDAO dao = new ProductDAO();
			Product product = dao.search(product_image);

			if (product != null) {
				session.setAttribute("product_image", product.getProduct_image());
				request.getRequestDispatcher("/views/b.jsp").forward(request, response);
			} else {
				request.setAttribute("errorMessage", "Product not found");
				request.getRequestDispatcher("/views/error.jsp").forward(request, response);
			}

		} catch (Exception e) {
			e.printStackTrace(out);
		} finally {
			out.close();
		}
	}
}