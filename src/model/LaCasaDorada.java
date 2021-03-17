package model;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class LaCasaDorada {
	public List<ClientAccount> clients;
	public List<EmployeeAccount> employees;
	public List<RestaurantProduct> products;
	public List<RestaurantIngredient> ingredients;
	public List<RestaurantTypeOfProduct> types;
	public List<Order> orders;

	
	public LaCasaDorada() {
		
		clients = new ArrayList<>();
		employees = new ArrayList<>();
		products = new ArrayList<>();
		ingredients = new ArrayList<>();
		types = new ArrayList<>();
		orders = new ArrayList<>();
	}
	
	public void addClient(String firstName, String lastName, String id, String address, int phoneNumber, String observations) {
		clients.add(new ClientAccount(firstName, lastName, id, address, phoneNumber, observations));
	}
	
	public void addEmployee(String userName, String password, String firstName, String lastName, String id) {
		employees.add(new EmployeeAccount(userName, password, firstName, lastName, id));
	}
	
	public void addProduct(String productName, int[][] sizePrice) {
		products.add(new RestaurantProduct(productName, sizePrice));
	}
	
	public void addIngredient(String ingredientName) {
		ingredients.add(new RestaurantIngredient (ingredientName));
	}

	public void addTypeOfProduct(String typeName) {
		types.add(new RestaurantTypeOfProduct(typeName));

	}
	
	public void addOrder(ClientAccount client, EmployeeAccount employee, String code, Date time, String observations, Status order) {
		orders.add(new Order(client, employee, code, time, observations, order));
	}
	
	public List<ClientAccount> getClients(){
		return clients; 
	}
	
	public List<EmployeeAccount> getEmployees(){
		return employees; 
	}

	public boolean validateEmployee(String userName, String password) {
		boolean validate=false;
		for(int i=0; i<employees.size() && !validate;i++) {
			EmployeeAccount employee = employees.get(i);
			if(employee.getUserName().equals(userName) && employee.getPassword().equals(password)) {
				validate=true;
			}
		}
		return validate;
	}
	
}
