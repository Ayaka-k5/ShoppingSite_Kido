package jp.co.aforce.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

import jp.co.aforce.beans.ManageList;

public class ManageDeleteDAO extends DAO {
	public int search(int product_id)
			throws Exception {
		List<ManageList> list = new ArrayList<>();
		
		Connection con = getConnection();

		PreparedStatement st;
		st = con.prepareStatement(
				"DELETE FROM Product WHERE Product_ID = ?");
		st.setInt(1, product_id);
		int result = st.executeUpdate();

		st.close();
		con.close();

		return result;
	}
}