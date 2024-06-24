package jp.co.aforce.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class InformationDAO_Customer extends DAO {
	public int mailSearch(String customer_mailaddress) throws Exception {
		Connection con = getConnection();
		
		PreparedStatement st;
		st = con.prepareStatement("SELECT * FROM Customer where Customer_Mailaddress = ?");
		st.setString(1, customer_mailaddress);
		ResultSet rs = st.executeQuery();
		int line = 0;
		while (rs.next()) {
			line++;
		}
		
		return line;
	}
	
	public int insert(String customer_mailaddress, String customer_password, String customer_lastname,
			String customer_firstname, String customer_telephone, String customer_address)
			throws Exception {

		Connection con = getConnection();
		
		PreparedStatement st;
		st = con.prepareStatement(
				"INSERT INTO Customer (Customer_Mailaddress, Customer_Password, Customer_LastName, Customer_FirstName, Customer_Telephone, Customer_Address) values (?, ?, ?, ?, ?, ?)");
		st.setString(1, customer_mailaddress);
		st.setString(2, customer_password);
		st.setString(3, customer_lastname);
		st.setString(4, customer_firstname);
		st.setString(5, customer_telephone);
		st.setString(6, customer_address);
		int result = st.executeUpdate();

		st.close();
		con.close();

		return result;

	}
}