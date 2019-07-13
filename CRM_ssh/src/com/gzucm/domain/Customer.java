package com.gzucm.domain;

public class Customer {
	private Long customer_id;
	private String customer_code;
	private String customer_name;
	private String customer_password;
	private Character customer_state;
	public Long getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(Long customer_id) {
		this.customer_id = customer_id;
	}
	public String getCustomer_code() {
		return customer_code;
	}
	public void setCustomer_code(String customer_code) {
		this.customer_code = customer_code;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public String getCustomer_password() {
		return customer_password;
	}
	public void setCustomer_password(String customer_password) {
		this.customer_password = customer_password;
	}
	public Character getCustomer_state() {
		return customer_state;
	}
	public void setCustomer_state(Character customer_state) {
		this.customer_state = customer_state;
	}
	@Override
	public String toString() {
		return "Customer [customer_id=" + customer_id + ", customer_code=" + customer_code + ", customer_name="
				+ customer_name + ", customer_password=" + customer_password + ", customer_state=" + customer_state
				+ "]";
	}
	
}
