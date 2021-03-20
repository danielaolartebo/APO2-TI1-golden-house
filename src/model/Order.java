package model;

import java.sql.Date;

public class Order {
	
	// ORDEN TIENE NUMERO, ESTADO, PRODUCTOS, CANTIDAD, EMPLEADO, FECHA, HORA Y OBSERVACIONES.

	private ClientAccount client;
	private EmployeeAccount employee;
	private String code;
	private Date time;
	private String observations;
	private Status order;
	
	public Order(ClientAccount client, EmployeeAccount employee, String code, Date time, String observations, Status order) {
		this.setClient(client);
		this.setEmployee(employee);
		this.setCode(code);
		this.setTime(time);
		setObservations(observations);
		this.order=Status.REQUESTED;
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
		return order;
	}
	
	public void setOrderStatus(Status order) {
		this.order=order;
	}
	
}
