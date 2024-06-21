package jp.co.aforce.beans;

import java.io.Serializable;

public class Item implements Serializable {
	private Product product;
	private int product_number;

	public Product getProduct() {
		return product;
	}

	public int getProduct_number() {
		return product_number;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public void setProduct_number(int product_number) {
		this.product_number = product_number;
	}

	public void removeItem(String productId) {
		// TODO 自動生成されたメソッド・スタブ

	}
}