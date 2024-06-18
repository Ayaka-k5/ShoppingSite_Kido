package jp.co.aforce.beans;

import java.io.Serializable;

public class Product implements Serializable {
	private int product_id;
	private String product_image;
//	private String customer_password;

	public int getProduct_id() {
		return product_id;
	}

	public String getProduct_image() {
		return product_image;
	}

//	public String getCustomer_password() {
//		return customer_password;
//	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public void setProduct_image(String product_image) {
		this.product_image = product_image;
	}

//	public void setCustomer_password(String customer_password) {
//		this.customer_password = customer_password;
//	}

}