package jp.co.aforce.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class InformationDAO_Manager extends DAO {
	public int insert(String manager_mailaddress,
			String manager_password, String manager_lastname,
			String manager_firstname)
			throws Exception {

		Connection con = getConnection();

		PreparedStatement st;
		st = con.prepareStatement(
				"INSERT INTO Manager (Manager_Mailaddress, Manager_Password, Manager_LastName, Manager_FirstName) values (?, ?, ?, ?)");
		st.setString(1, manager_mailaddress);
		st.setString(2, manager_password);
		st.setString(3, manager_lastname);
		st.setString(4, manager_firstname);
		int result = st.executeUpdate();

		st.close();
		con.close();

		return result;

	}

//	public Information_Manager search(String manager_mailaddress,
//			String manager_password, String manager_lastname,
//			String manager_firstname)
//			throws Exception {
//		Connection con = getConnection();
//
//		PreparedStatement st = con.prepareStatement(
//				"SELECT * FROM Manager WHERE Manager_Mailaddress = ? AND Manager_Password = ? AND Manager_LastName = ? AND Manager_FirstName = ?");
//		st.setString(1, manager_mailaddress);
//		st.setString(2, manager_password);
//		st.setString(3, manager_lastname);
//		st.setString(4, manager_firstname);
//
//		ResultSet rs = st.executeQuery();
//
//		Information_Manager information_manager = null;
//
//		if (rs.next()) {
//			information_manager = new Information_Manager();
//			information_manager.setManager_id(rs.getInt("manager_id"));
//
//			information_manager.setManager_mailaddress(rs.getString("manager_mailaddress"));
//
//			information_manager.setManager_password(rs.getString("manager_password"));
//
//			information_manager.setManager_lastname(rs.getString("manager_lastname"));
//
//			information_manager.setManager_firstname(rs.getString("manager_firstname"));
//		}
//
//		rs.close();
//		st.close();
//		con.close();
//
//		return information_manager;
//	}

}