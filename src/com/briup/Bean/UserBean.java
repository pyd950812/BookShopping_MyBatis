package com.briup.Bean;



public class UserBean {

	private int id; // 用户的id
	private String username;  //用户的用户名
	private String password;	//密码
	private String zip;   	 //邮编
	private String address;		//地址
	private String phone;     //电话
	private String email;	//电子邮件
	public UserBean() {
		super();
	}
	public UserBean(int id, String username, String password, String zip,
			String address, String phone, String email) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.zip = zip;
		this.address = address;
		this.phone = phone;
		this.email = email;
	}
	
	public UserBean( String username, String password, String zip,
			String address, String phone, String email) {
		super();
		this.username = username;
		this.password = password;
		this.zip = zip;
		this.address = address;
		this.phone = phone;
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "UserBean [id=" + id + ", username=" + username + ", password="
				+ password + ", zip=" + zip + ", address=" + address
				+ ", phone=" + phone + ", email=" + email + "]";
	}
	
	
	
	
}
