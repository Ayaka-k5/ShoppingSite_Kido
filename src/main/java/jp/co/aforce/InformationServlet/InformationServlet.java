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
//			String customer_lastname = request.getParameter("customer_lastname");
//			String customer_firstname = request.getParameter("customer_firstname");
//			String customer_phonenumber = request.getParameter("customer_telephone");
//			String customer_address = request.getParameter("customer_address");

			//入力された情報が空でないことを確認
			if (customer_mailaddress != null && !customer_mailaddress.isEmpty() &&
					customer_password != null && !customer_password.isEmpty()) {

				InformationDAO dao = new InformationDAO();

				// まず既存の情報を検索
				Information information = dao.search(customer_mailaddress, customer_password);

				if (information == null) {
					// 情報が存在しない場合、新規登録を行う
					int result = dao.insert(customer_mailaddress, customer_password);

					if (result > 0) {
						// 既存情報がなければ登録ページに遷移
						session.setAttribute("information", new Information());
						request.getRequestDispatcher("/views/information_out.jsp").forward(request, response);
					} else {
						// 既存情報がすでにあればすでに登録されていると表示するページに遷移
						request.getRequestDispatcher("/views/information_error.jsp").forward(request, response);
					}
				} else {
					// 情報が既に存在する場合はエラーページに遷移
					request.getRequestDispatcher("/views/information-error.jsp").forward(request, response);
				}
			} else {
				// 必要な情報が入力されていない場合、エラーページに遷移
				request.getRequestDispatcher("/views/information-error.jsp").forward(request, response);
			}
		} catch (Exception e) {
			e.printStackTrace(out);
		}
	}
}