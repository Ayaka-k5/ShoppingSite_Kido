package jp.co.aforce.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import jp.co.aforce.beans.Product;

public class ProductDAO extends DAO {
	public List<Product> search()
			throws Exception {
		List<Product> list = new ArrayList<>();

		Connection con = getConnection();

		PreparedStatement st;
		st = con.prepareStatement(
				"SELECT * FROM product");
		ResultSet rs = st.executeQuery();

		while (rs.next()) {
			Product product = new Product();
			product.setProduct_id(rs.getInt("product_id"));
			product.setProduct_name(rs.getString("product_name"));
			product.setProduct_price(rs.getInt("product_price"));
			product.setProduct_description(rs.getString("product_description"));
			list.add(product);
		}
		st.close();
		con.close();

		return list;
	}

	public List<Product> search(String keyword)
			throws Exception {
		List<Product> list = new ArrayList<>();

		Connection con = getConnection();

		PreparedStatement st;
		st = con.prepareStatement(
				"SELECT * FROM product WHERE Product_Name LIKE ?");
		st.setString(1, "%" + keyword + "%");
		ResultSet rs = st.executeQuery();

		while (rs.next()) {
			Product product = new Product();
			product.setProduct_id(rs.getInt("product_id"));
			product.setProduct_name(rs.getString("product_name"));
			product.setProduct_price(rs.getInt("product_price"));
			product.setProduct_description(rs.getString("product_description"));
			list.add(product);
		}
		st.close();
		con.close();

		return list;
	}
}