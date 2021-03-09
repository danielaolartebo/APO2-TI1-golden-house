package model;

public class EmployeeAccount{
	
	private String userName;
	private String password;
	private String firstName;
	private String lastName;
	private String id;
	
	public EmployeeAccount(String userName, String password, String firstName, String lastName, String id) {
		this.userName=userName;
		this.password=password;
		this.firstName = firstName;	
		this.lastName = lastName;
		this.id = id; 
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
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName=firstName;
	}
	
	public String getLastName() {
		return lastName;
	}	
	
	public void setLastName(String lastName) {
		this.lastName=lastName;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id=id;
	}
	
}
