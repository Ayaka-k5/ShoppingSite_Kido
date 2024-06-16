package jp.co.aforce.beans;

import java.io.Serializable;

public class Information implements Serializable {
	private int customer_id;
	private String customer_mailaddress;
	private String customer_password;
	private String customer_lastname;
	private String customer_firstname;
	private String customer_telephone;
	private String customer_address;

	public int getCustomer_id() {
		return customer_id;
	}
	
	public String getCustomer_mailaddress() {
		return customer_mailaddress;
	}

	public String getCustomer_password() {
		return customer_password;
	}

	public String getCustomer_lastname() {
		return customer_lastname;
	}

	public String getCustomer_firstname() {
		return customer_firstname;
	}

	public String getCustomer_telephone() {
		return customer_telephone;
	}

	public String getCustomer_address() {
		return customer_address;
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

	public void setCustomer_lastname(String customer_lastname) {
		this.customer_lastname = customer_lastname;
	}

	public void setCustomer_firstname(String customer_firstname) {
		this.customer_firstname = customer_firstname;
	}

	public void setCustomer_telephone(String customer_telephone) {
		this.customer_telephone = customer_telephone;
	}

	public void setCustomer_address(String customer_address) {
		this.customer_address = customer_address;
	}
}