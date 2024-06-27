package jp.co.aforce.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import jp.co.aforce.beans.ManageList;

public class ManageListDAO extends DAO {
	public List<ManageList> search()
			throws Exception {
		List<ManageList> manageList = new ArrayList<>();

		Connection con = getConnection();

		PreparedStatement st;
		st = con.prepareStatement(
				"SELECT * FROM product");
		ResultSet rs = st.executeQuery();

		while (rs.next()) {
			ManageList manage = new ManageList();
			manage.setProduct_id(rs.getInt("product_id"));
			manage.setProduct_name(rs.getString("product_name"));
			manage.setProduct_price(rs.getInt("product_price"));
			manage.setProduct_description(rs.getString("product_description"));
			manage.setProduct_stock(rs.getInt("product_stock"));
			manageList.add(manage);
		}
		st.close();
		con.close();

		return manageList;
	}
}