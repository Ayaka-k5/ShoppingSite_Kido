package jp.co.aforce.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jp.co.aforce.beans.Information;

public class InformationDAO extends DAO {
	public int insert(String customer_mailaddress, String customer_password, String customer_lastname,
			String customer_firstname, String customer_telephone, String customer_address)
			throws Exception {

		Connection con = getConnection();

		PreparedStatement st;
		st = con.prepareStatement(
				"INSERT INTO Customer(Customer_Mailaddress, Customer_Password, Customer_LastName, Customer_FirstName, Customer_Telephone, Customer_Address) values (?, ?, ?, ?, ?, ?)");
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

	public Information search(String customer_mailaddress, String customer_password, String customer_lastname,
			String customer_firstname, String customer_telephone, String customer_address)
			throws Exception {
		Connection con = getConnection();

		PreparedStatement st = con.prepareStatement(
				"SELECT * FROM Customer WHERE Customer_Mailaddress = ? AND Customer_Password = ? AND Customer_LastName = ? AND Customer_FirstName = ? AND Customer_Telephone = ? AND Customer_Address = ?");
		st.setString(1, customer_mailaddress);
		st.setString(2, customer_password);
		st.setString(3, customer_lastname);
		st.setString(4, customer_firstname);
		st.setString(5, customer_telephone);
		st.setString(6, customer_address);

		ResultSet rs = st.executeQuery();

		Information information = null;

		if (rs.next()) {
			information = new Information();
			information.setCustomer_id(rs.getInt("customer_id"));

			information.setCustomer_mailaddress(rs.getString("customer_mailaddress"));

			information.setCustomer_password(rs.getString("customer_password"));

			information.setCustomer_lastname(rs.getString("customer_lastname"));

			information.setCustomer_firstname(rs.getString("customer_firstname"));

			information.setCustomer_telephone(rs.getString("customer_telephone"));

			information.setCustomer_address(rs.getString("customer_address"));
		}

		rs.close();
		st.close();
		con.close();

		return information;
	}

}