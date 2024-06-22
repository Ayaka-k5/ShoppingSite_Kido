package jp.co.aforce.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import jp.co.aforce.beans.Manage;

public class ManageDAO extends DAO {
	public List<Manage> search()
			throws Exception {
		List<Manage> list = new ArrayList<>();

		Connection con = getConnection();

		PreparedStatement st;
		st = con.prepareStatement(
				"SELECT * FROM Product");
		ResultSet rs = st.executeQuery();

		while (rs.next()) {
			Manage manage = new Manage();
			manage.setProduct_id(rs.getInt("product_id"));
			manage.setProduct_name(rs.getString("product_name"));
			manage.setProduct_price(rs.getInt("product_price"));
			manage.setProduct_description(rs.getString("product_description"));
			manage.setProduct_stock(rs.getInt("product_stock"));
			list.add(manage);
		}
		st.close();
		con.close();

		return list;
	}

	public int insert(String product_name, int product_price, String product_description, int product_stock) {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}
}