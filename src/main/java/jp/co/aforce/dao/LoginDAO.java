package jp.co.aforce.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jp.co.aforce.beans.Login;

public class LoginDAO extends DAO {
	public Login search(String customer_mailaddress, String customer_password)
			throws Exception {
		Login login = null;

		Connection con = getConnection();

		PreparedStatement st;
		st = con.prepareStatement(
				"SELECT * FROM Customer WHERE Customer_Mailaddress= ? and Customer_Password= ?");
		st.setString(1, customer_mailaddress);
		st.setString(2, customer_password);
		ResultSet rs = st.executeQuery();

		while (rs.next()) {
			login = new Login();
			login.setCustomer_id(rs.getInt("customer_id"));
			login.setCustomer_mailaddress(rs.getString("customer_mailaddress"));
			login.setCustomer_password(rs.getString("customer_password"));
		}

		st.close();
		con.close();
		return login;
	}

}