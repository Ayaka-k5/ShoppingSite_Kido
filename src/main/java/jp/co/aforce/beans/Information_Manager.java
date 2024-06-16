package jp.co.aforce.beans;

import java.io.Serializable;

public class Information_Manager implements Serializable {
	private int manager_id;
	private String manager_mailaddress;
	private String manager_password;
	private String manager_lastname;
	private String manager_firstname;

	public int getManager_id() {
		return manager_id;
	}

	public String getManager_mailaddress() {
		return manager_mailaddress;
	}

	public String getManager_password() {
		return manager_password;
	}

	public String getManager_lastname() {
		return manager_lastname;
	}

	public String getManager_firstname() {
		return manager_firstname;
	}

	public void setManager_id(int manager_id) {
		this.manager_id = manager_id;
	}

	public void setManager_mailaddress(String manager_mailaddress) {
		this.manager_mailaddress = manager_mailaddress;
	}

	public void setManager_password(String manager_password) {
		this.manager_password = manager_password;
	}

	public void setManager_lastname(String manager_lastname) {
		this.manager_lastname = manager_lastname;
	}

	public void setManager_firstname(String manager_firstname) {
		this.manager_firstname = manager_firstname;
	}
}