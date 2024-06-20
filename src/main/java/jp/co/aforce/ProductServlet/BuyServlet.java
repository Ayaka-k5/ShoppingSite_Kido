package jp.co.aforce.ProductServlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import jp.co.aforce.beans.Item;
import jp.co.aforce.beans.Product;

@WebServlet("/buyServlet")
public class BuyServlet extends HttpServlet {
	@Override
	@SuppressWarnings("unchecked")
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();

		int product_id = Integer.parseInt(request.getParameter("product_id"));

		List<Item> cart = (List<Item>) session.getAttribute("cart");
		if (cart == null) {
			cart = new ArrayList<Item>();
			session.setAttribute("cart", cart);
		}

		for (Item item : cart) {
			if (item.getProduct().getProduct_id() == product_id) {
				item.setProduct_number(item.getProduct_number() + 1);
				response.sendRedirect("/ShoppingSite/views/buy.jsp");
				return;
			}
		}

		List<Product> list = (List<Product>) session.getAttribute("list");
		for (Product product : list) {
			if (product.getProduct_id() == product_id) {
				Item item = new Item();
				item.setProduct(product);
				item.setProduct_number(1);
				cart.add(item);
			}
		}
		response.sendRedirect("/ShoppingSite/views/buy.jsp");

	}
}