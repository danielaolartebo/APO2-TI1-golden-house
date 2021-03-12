package model;

import java.sql.Date;

public class Order {

	private ClientAccount client;
	private EmployeeAccount employee;
	private String code;
	private Date time;
	private String observations;
	private Status orderStatus;
	
	public Order(ClientAccount client, EmployeeAccount employee, String code, Date time, String obsrv, Status order) {
		this.setClient(client);
		this.setEmployee(employee);
		this.setCode(code);
		this.setTime(time);
		setObservations(obsrv);
		setOrderStatus(order);
	}

	public ClientAccount getClient() {
		return client;
	}

	public void setClient(ClientAccount client) {
		this.client = client;
	}

	public EmployeeAccount getEmployee() {
		return employee;
	}

	public void setEmployee(EmployeeAccount employee) {
		this.employee = employee;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public String getObservations() {
		return observations;
	}

	public void setObservations(String observations) {
		this.observations = observations;
	}

	public Status getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(Status orderStatus) {
		this.orderStatus = orderStatus;
	}
	
}
