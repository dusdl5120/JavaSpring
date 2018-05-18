package kr.green.javaspring.dao;

public class UserVO {
	
	private String id;
	private String passwd;
	private String email;
	
	public UserVO (String id, String passwd, String email) {
		
		this.id = id;
		this.passwd = passwd;
		this.email = email;
		
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
