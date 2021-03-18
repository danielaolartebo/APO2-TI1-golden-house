package model;

public class EmployeeAccount extends RestaurantMembers{
	
	private String userName;
	private String password;
	private EmployeeStatus employeeStatus;
	
	public EmployeeAccount(String userName, String password, String firstName, String lastName, String id) {
		super(firstName, lastName, id);
		this.userName=userName;
		this.password=password;
		this.employeeStatus=EmployeeStatus.ACTIVE;

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
	public EmployeeStatus getEmployeeStatus() {
		return employeeStatus;
	}
	
	public void setEmployeeStatus(EmployeeStatus employeeStatus) {
		this.employeeStatus=employeeStatus;
	}
	
}
