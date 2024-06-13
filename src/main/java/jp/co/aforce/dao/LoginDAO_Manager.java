package jp.co.aforce.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jp.co.aforce.beans.Login_Manager;

public class LoginDAO_Manager extends DAO_Manager {
	public Login_Manager search(String manager_mailaddress, String manager_password)
			throws Exception {
		Login_Manager login_Manager = null;

		Connection con = getConnection();

		PreparedStatement st;
		st = con.prepareStatement(
				"SELECT * FROM Manager WHERE Manager_Mailaddress= ? and Manager_Password= ?");
		st.setString(1, manager_mailaddress);
		st.setString(2, manager_password);
		ResultSet rs = st.executeQuery();

		while (rs.next()) {
			login_Manager = new Login_Manager();
			login_Manager.setManager_id(rs.getInt("manager_id"));
			login_Manager.setManager_mailaddress(rs.getString("manager_mailaddress"));
			login_Manager.setManager_password(rs.getString("manager_password"));
		}

		st.close();
		con.close();
		return login_Manager;
	}

}