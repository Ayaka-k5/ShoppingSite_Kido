package jp.co.aforce.InformationServlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import jp.co.aforce.beans.Information;
import jp.co.aforce.dao.InformationDAO;

@WebServlet("/informationServlet")
public class InformationServlet extends HttpServlet {
	@Override
	protected void doPost(
			HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		try {
			HttpSession session = request.getSession();

			String customer_mailaddress = request.getParameter("customer_mailaddress");
			String customer_password = request.getParameter("customer_password");
			String customer_lastname = request.getParameter("customer_lastname");
			String customer_firstname = request.getParameter("customer_firstname");
			String customer_telephone = request.getParameter("customer_telephone");
			String customer_address = request.getParameter("customer_address");

			InformationDAO dao = new InformationDAO();
			
			// 新規登録を行う
            int result = dao.insert(customer_mailaddress, customer_password,
            	customer_lastname, customer_firstname, customer_telephone, 
            	customer_address);

            if (result > 0) {
                // 登録に成功した場合、成功ページに遷移
                session.setAttribute("information", new Information());
                request.getRequestDispatcher("/views/information-out.jsp").forward(request, response);
            } else {
                // 登録に失敗した場合、エラーページに遷移
                request.getRequestDispatcher("/views/information-error.jsp").forward(request, response);
            }
        } catch (Exception e) {
            e.printStackTrace(out);
            // 例外が発生した場合もエラーページに遷移
            request.getRequestDispatcher("/views/information-error.jsp").forward(request, response);
        }
    }
}