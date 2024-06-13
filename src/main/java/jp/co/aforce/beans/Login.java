package jp.co.aforce.beans;

import java.io.Serializable;

public class Login implements Serializable {
	private int customer_id;
	private String customer_mailaddress;
	private String customer_password;

	public int getCustomer_id() {
		return customer_id;
	}

	public String getCustomer_mailaddress() {
		return customer_mailaddress;
	}

	public String getCustomer_password() {
		return customer_password;
	}

	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}

	public void setCustomer_mailaddress(String customer_mailaddress) {
		this.customer_mailaddress = customer_mailaddress;
	}

	public void setCustomer_password(String customer_password) {
		this.customer_password = customer_password;
	}

}