package model;

public class EmployeeAccount extends RestaurantMembers{
	
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
