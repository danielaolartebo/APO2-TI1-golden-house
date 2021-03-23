package model;

import java.sql.Date;
import java.time.LocalDate;

public class Order {
	
	// ORDEN TIENE NUMERO, ESTADO, PRODUCTOS, CANTIDAD, EMPLEADO, FECHA, HORA Y OBSERVACIONES.

	private ClientAccount client;
	private EmployeeAccount employee;
	private RestaurantProduct product;
	private String code;
	private LocalDate time;
	private double quantity;
	private String observations;
	private Status order;
	
	public Order(ClientAccount client, RestaurantProduct product, EmployeeAccount employee, String code, LocalDate time, double quantity, String observations) {
		this.setClient(client);
		this.setProduct(product);
		this.setEmployee(employee);
		this.setCode(code);
		this.setTime(time);
		this.setQuantity(quantity);
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

	public LocalDate getTime() {
		return time;
	}

	public void setTime(LocalDate time) {
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

	public RestaurantProduct getProduct() {
		return product;
	}

	public void setProduct(RestaurantProduct product) {
		this.product = product;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	
}
