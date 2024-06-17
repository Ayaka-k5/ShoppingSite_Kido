package jp.co.aforce.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class InformationDAO_Customer extends DAO {
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

//	public Information_Customer search(String customer_mailaddress/*, String customer_password, String customer_lastname,
//			String customer_firstname, String customer_telephone, String customer_address*/)
//			throws Exception {
//		Connection con = getConnection();
//
//		PreparedStatement st = con.prepareStatement(
//				"SELECT * FROM Customer WHERE Customer_Mailaddress = ?");
//		st.setString(1, customer_mailaddress);
		/*st.setString(2, customer_password);
		st.setString(3, customer_lastname);
		st.setString(4, customer_firstname);
		st.setString(5, customer_telephone);
		st.setString(6, customer_address);*/

//		ResultSet rs = st.executeQuery();
//
//		Information_Customer information_customer = null;
//
//		if (rs.next()) {
//			information_customer = new Information_Customer();
//			//information_customer.setCustomer_id(rs.getInt("customer_id"));
//
//			information_customer.setCustomer_mailaddress(rs.getString("customer_mailaddress"));

			/*information_customer.setCustomer_password(rs.getString("customer_password"));

			information_customer.setCustomer_lastname(rs.getString("customer_lastname"));

			information_customer.setCustomer_firstname(rs.getString("customer_firstname"));

			information_customer.setCustomer_telephone(rs.getString("customer_telephone"));

			information_customer.setCustomer_address(rs.getString("customer_address"));
//		}*/

//		rs.close();
//		st.close();
//		con.close();
//
//		return information_customer;
//	}

}