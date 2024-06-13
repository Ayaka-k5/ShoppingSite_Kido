package jp.co.aforce.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jp.co.aforce.beans.Login2;

public class LoginDAO2 extends DAO2 {
	public Login2 search(String manager_mailaddress, String manager_password)
			throws Exception {
		Login2 login2 = null;

		Connection con = getConnection();

		PreparedStatement st;
		st = con.prepareStatement(
				"SELECT * FROM Manager WHERE Manager_Mailaddress= ? and Manager_Password= ?");
		st.setString(1, manager_mailaddress);
		st.setString(2, manager_password);
		ResultSet rs = st.executeQuery();

		while (rs.next()) {
			login2 = new Login2();
			login2.setManager_id(rs.getInt("manager_id"));
			login2.setManager_mailaddress(rs.getString("manager_mailaddress"));
			login2.setManager_password(rs.getString("manager_password"));
		}

		st.close();
		con.close();
		return login2;
	}

}