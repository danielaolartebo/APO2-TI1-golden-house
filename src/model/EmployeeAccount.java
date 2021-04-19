package model;

import java.io.Serializable;

public class EmployeeAccount extends RestaurantMembers implements Serializable{

	private static final long serialVersionUID = 1;
	private MembersStatus employeeStatus;
	private String userName;
	private String password;
	private double priceTotal;
	private int amountOrders;
	
	public EmployeeAccount(String userName, String password, String firstName, String lastName, String id) {
		super(firstName, lastName, id);
		this.userName=userName;
		this.password=password;
		this.employeeStatus=MembersStatus.ACTIVA;
		this.amountOrders=0;
		this.priceTotal=0;
	}
	public EmployeeAccount(String firstName) {
		super(firstName, null, null);
	}

	public MembersStatus getEmployeeStatus() {
		return employeeStatus;
	}
	
	public void setEmployeeStatus(MembersStatus employeeStatus) {
		this.employeeStatus=employeeStatus;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	public double getPriceTotal() {
		return priceTotal;
	}
	public void setPriceTotal(double priceTotal) {
		this.priceTotal = priceTotal;
	}
	public int getAmountOrders() {
		return amountOrders;
	}
	public void setAmountOrders(int amountOrders) {
		this.amountOrders = amountOrders;
	}
	
	
	
}
