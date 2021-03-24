package model;

public class SystemUser extends EmployeeAccount{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String userName;
	private String password;

	public SystemUser(String userName, String password, String firstName, String lastName, String id) {
		super(userName, password, firstName, lastName, id);
		this.userName=userName;
		this.password=password;
		
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName=userName;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password=password;
	}

}
