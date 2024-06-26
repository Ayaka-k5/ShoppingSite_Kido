package jp.co.aforce.beans;

import java.io.Serializable;

public class ManageDelete implements Serializable {
	private int product_id;
	private String product_name;
	private int product_price;
	private String product_description;
	private int product_stock;

	public int getProduct_id() {
		return product_id;
	}

	public String getProduct_name() {
		return product_name;
	}

	public int getProduct_price() {
		return product_price;
	}

	public String getProduct_description() {
		return product_description;
	}
	
	public int getProduct_stock() {
		return product_stock;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public void setProduct_price(int product_price) {
		this.product_price = product_price;
	}

	public void setProduct_description(String product_description) {
		this.product_description = product_description;
	}
	
	public void setProduct_stock(int product_stock) {
		this.product_stock = product_stock;
	}
}