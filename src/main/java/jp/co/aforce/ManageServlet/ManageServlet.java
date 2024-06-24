package jp.co.aforce.ManageServlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import jp.co.aforce.beans.Manage;
import jp.co.aforce.dao.ManageDAO;

@WebServlet("/manageServlet")
public class ManageServlet extends HttpServlet {
	@Override
	protected void doPost(
			HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		try {
			
			HttpSession session = request.getSession();
			
			String product_name = request.getParameter("product_name");
			String product_price_param = request.getParameter("product_price");
			int product_price = 0;
			String product_description = request.getParameter("product_description");
			String product_stock_param = request.getParameter("product_stock");
			int product_stock = 0;
			try {
				product_price = Integer.parseInt(product_price_param);
			} catch (NumberFormatException e) {
				return;
			}

			try {
				product_stock = Integer.parseInt(product_stock_param);
			} catch (NumberFormatException e) {
				return;
			}
			ManageDAO dao = new ManageDAO();

			// 新規登録を行う
			int result = dao.insert(product_name, product_price,
					product_description, product_stock);
			if (result > 0) {
				// 登録に成功した場合、成功ページに遷移
				session.setAttribute("manage", new Manage());
				request.getRequestDispatcher("/views/manage-out.jsp").forward(request, response);
			} else {
				// 登録に失敗した場合、エラーページに遷移
				request.getRequestDispatcher("/views/manage-error.jsp").forward(request, response);
			}
		} catch (Exception e) {
			e.printStackTrace(out);
			// 例外が発生した場合もエラーページに遷移
			request.getRequestDispatcher("/views/manage-error.jsp").forward(request, response);
		}
	}
}