package jp.co.aforce.InformationServlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import jp.co.aforce.beans.Information_Manager;
import jp.co.aforce.dao.InformationDAO_Manager;

@WebServlet("/informationServlet_Manager")
public class InformationServlet_Manager extends HttpServlet {
	@Override
	protected void doPost(
			HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		try {
			HttpSession session = request.getSession();

			String manager_mailaddress = request.getParameter("manager_mailaddress");
			String manager_password = request.getParameter("manager_password");
			String manager_lastname = request.getParameter("manager_lastname");
			String manager_firstname = request.getParameter("manager_firstname");
			
			InformationDAO_Manager dao = new InformationDAO_Manager();

			// 新規登録を行う
			int result = dao.insert(manager_mailaddress, manager_password,
					manager_lastname, manager_firstname);

			if (result > 0) {
				// 登録に成功した場合、成功ページに遷移
				session.setAttribute("information_manager", new Information_Manager());
				request.getRequestDispatcher("/views/information-out_Manager.jsp").forward(request, response);
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