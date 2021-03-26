package model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Order {
	
	// ORDEN TIENE NUMERO, ESTADO, PRODUCTOS, CANTIDAD, EMPLEADO, FECHA, HORA Y OBSERVACIONES.

	private ClientAccount client;
	private EmployeeAccount employee;
	private RestaurantProduct product;
	private String code;
	private LocalDate date;
	private LocalTime time;
	private double quantity;
	private String observations;
	private Status order;
	private int number;
	private String nameEmployee;
	private String nameProduct;
	private String nameClient;
	
	public Order(ClientAccount client, RestaurantProduct product, EmployeeAccount employee, String code, LocalDate date, LocalTime time, double quantity, String observations, int number) {
		this.client=client;
		this.product=product;
		this.employee=employee;
		this.code=code;
		this.date=date;
		this.time=time;
		this.quantity=quantity;
		this.observations=observations;
		this.order=Status.SOLICITADO;

		this.setNumber(number);
		nameEmployee = employee.getFirstName();
		nameProduct = product.getName();
		nameClient= client.getFirstName();
		this.number=number;

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

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
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

	public LocalTime getTime() {
		return time;
	}

	public void setTime(LocalTime time) {
		this.time = time;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getNameEmployee() {
		return nameEmployee;
	}

	public void setNameEmployee(String nameEmployee) {
		this.nameEmployee = nameEmployee;
	}

	public String getNameProduct() {
		return nameProduct;
	}

	public void setNameProduct(String nameProduct) {
		this.nameProduct = nameProduct;
	}

	public String getNameClient() {
		return nameClient;
	}

	public void setNameClient(String nameClient) {
		this.nameClient = nameClient;
	}

}
