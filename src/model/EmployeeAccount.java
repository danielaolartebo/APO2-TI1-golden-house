package model;

import java.io.Serializable;

public class EmployeeAccount extends RestaurantMembers implements Serializable{

	private static final long serialVersionUID = 1;
	private MembersStatus employeeStatus;
	
	public EmployeeAccount(String userName, String password, String firstName, String lastName, String id) {
		super(firstName, lastName, id);
		this.employeeStatus=MembersStatus.ACTIVE;

	}

	public MembersStatus getEmployeeStatus() {
		return employeeStatus;
	}
	
	public void setEmployeeStatus(MembersStatus employeeStatus) {
		this.employeeStatus=employeeStatus;
	}
	
	
	
}
