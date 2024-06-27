package jp.co.aforce.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class InformationDAO_Manager extends DAO {
	public int mailSearch(String manager_mailaddress) throws Exception {
		Connection con = getConnection();
		
		PreparedStatement st;
		st = con.prepareStatement("SELECT * FROM manager where Manager_Mailaddress = ?");
		st.setString(1, manager_mailaddress);
		ResultSet rs = st.executeQuery();
		int line = 0;
		while (rs.next()) {
			line++;
		}
		
		return line;
	}
	
	public int insert(String manager_mailaddress,
			String manager_password, String manager_lastname,
			String manager_firstname)
			throws Exception {

		Connection con = getConnection();

		PreparedStatement st;
		st = con.prepareStatement(
				"INSERT INTO manager (Manager_Mailaddress, Manager_Password, Manager_LastName, Manager_FirstName) values (?, ?, ?, ?)");
		st.setString(1, manager_mailaddress);
		st.setString(2, manager_password);
		st.setString(3, manager_lastname);
		st.setString(4, manager_firstname);
		int result = st.executeUpdate();

		st.close();
		con.close();

		return result;

	}
}