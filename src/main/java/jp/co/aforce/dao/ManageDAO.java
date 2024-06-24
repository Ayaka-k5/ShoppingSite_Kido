package jp.co.aforce.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class ManageDAO extends DAO {
	public int insert(String product_name, int product_price, String product_description, int product_stock)
			throws Exception {

		Connection con = getConnection();

		PreparedStatement st;
		st = con.prepareStatement(
				"INSERT INTO Product (Product_Name, Product_Price, Product_Description, Product_Stock) values (?, ?, ?, ?)");
		st.setString(1, product_name);
		st.setInt(2, product_price);
		st.setString(3, product_description);
		st.setInt(4, product_stock);
		int result = st.executeUpdate();

		st.close();
		con.close();

		return result;

	}
}