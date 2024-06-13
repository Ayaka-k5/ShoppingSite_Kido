package jp.co.aforce.beans;

import java.io.Serializable;

public class Login2 implements Serializable {
	private int manager_id;
	private String manager_mailaddress;
	private String manager_password;

	public int getManager_id() {
		return manager_id;
	}

	public String getManager_mailaddress() {
		return manager_mailaddress;
	}

	public String getManager_password() {
		return manager_password;
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

}