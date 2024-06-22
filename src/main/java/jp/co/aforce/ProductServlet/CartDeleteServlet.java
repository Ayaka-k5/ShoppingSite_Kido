package jp.co.aforce.ProductServlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import jp.co.aforce.beans.Item;

@WebServlet("/cartDeleteServlet")
public class CartDeleteServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 商品IDをリクエストパラメータから取得
        String product_id = request.getParameter("product_id");

        // セッションからカートを取得
        HttpSession session = request.getSession();
        Item cart = (Item) session.getAttribute("cart");

        if (cart != null && product_id != null) {
            // カートから指定の商品を削除
            cart.removeItem(product_id);
        }

        // カートページへリダイレクト
        response.sendRedirect("/ShoppingSite/views/cart.jsp");
    }
}