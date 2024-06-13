package jp.co.aforce.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import jp.co.aforce.beans.Information;

public class InformationDAO extends DAO {
	public boolean insert(String customer_mailaddress, String customer_password)
			throws Exception {

		Connection con = getConnection();

		PreparedStatement st;
		st = con.prepareStatement("INSERT INTO Customer values (null, ?, ?)");
		st.setString(1, customer_mailaddress);
		st.setString(2, customer_password);
//		st.setString(3, customer_lastname);
//		st.setString(4, customer_firstname);
//		st.setString(5, customer_telephone);
//		st.setString(6, customer_address);
		int line = st.executeUpdate();
		
		st.close();
		con.close();
		
		return line > 0;
	}

}