package jp.co.aforce.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jp.co.aforce.beans.Product;

public class ProductDAO extends DAO {
	public Product search(String product_image)
			throws Exception {
		Product product = null;

		Connection con = getConnection();

		PreparedStatement st;
		st = con.prepareStatement(
				"SELECT * FROM Product WHERE Product_Image= ?");
		st.setString(1, product_image);
		ResultSet rs = st.executeQuery();

		while (rs.next()) {
			product = new Product();
			product.setProduct_id(rs.getInt("product_id"));
			product.setProduct_image(rs.getString("product_image"));

			st.close();
			con.close();
		}
		return product;
	}
}