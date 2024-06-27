package jp.co.aforce.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class ManageDeleteDAO extends DAO {
	public int delete(int product_id)
			throws Exception {
		Connection con = getConnection();

		PreparedStatement st;
		st = con.prepareStatement(
				"DELETE FROM product WHERE Product_ID = ?");
		st.setInt(1, product_id);
		int result = st.executeUpdate();

		st.close();
		con.close();

		return result;
	}
}