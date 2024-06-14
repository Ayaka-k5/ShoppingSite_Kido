package jp.co.aforce.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jp.co.aforce.beans.Information;

public class InformationDAO extends DAO {
	public int insert(String customer_mailaddress, String customer_password)
			throws Exception {

		Connection con = getConnection();

		PreparedStatement st;
		st = con.prepareStatement("INSERT INTO Customer(Customer_Mailaddress, Customer_Password) values (?, ?)");
		st.setString(1, customer_mailaddress);
		st.setString(2, customer_password);
		//		st.setString(3, customer_lastname);
		//		st.setString(4, customer_firstname);
		//		st.setString(5, customer_telephone);
		//		st.setString(6, customer_address);
		int result = st.executeUpdate();
		
		st.close();
		con.close();

		return result;

	}

	public Information search(String customer_mailaddress, String customer_password) throws Exception {
		Connection con = getConnection();

		PreparedStatement st = con
				.prepareStatement("SELECT * FROM Customer WHERE Customer_Mailaddress = ? AND Customer_Password = ?");
		st.setString(1, customer_mailaddress);
		st.setString(2, customer_password);

		ResultSet rs = st.executeQuery();
		
		Information information = null;

		if (rs.next()) {
			information = new Information();
			information.setCustomer_id(rs.getInt("customer_id"));
			information.setCustomer_mailaddress(rs.getString("customer_mailaddress"));
			information.setCustomer_password(rs.getString("customer_password"));
		}

		rs.close();
		st.close();
		con.close();

		return information;
	}

}