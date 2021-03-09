package model;

import java.util.ArrayList;
import java.util.List;

public class LaCasaDorada {
	private List<ClientAccount> clients;
	private List<EmployeeAccount> employees;
	private List<RestaurantProduct> products;
	private List<RestaurantIngredient> ingredients;
	
	public LaCasaDorada() {
		clients = new ArrayList<>();
		employees = new ArrayList<>();
		products = new ArrayList<>();
		ingredients = new ArrayList<>();
	}
	
	public void addClient(String userName, String password, String firstName, String lastName, String id, String address, int phoneNumber, String observations) {
		clients.add(new ClientAccount(userName, password, firstName, lastName, id, address, phoneNumber, observations));
	}
	
	public void addEmployee(String userName, String password, String firstName, String lastName, String id) {
		employees.add(new EmployeeAccount(userName, password, firstName, lastName, id));
	}
	
	public void addProduct(String productName) {
		products.add(new RestaurantProduct(productName));
	}
	public void addIngredient(String ingredientName) {
		ingredients.add(new RestaurantIngredient (ingredientName));
	}
	
	public List<ClientAccount> getClients(){
		return clients; 
	}
	
	public List<EmployeeAccount> getEmployees(){
		return employees; 
	}
	
	public boolean validateClient(String userName, String password) {
		boolean validate=false;
		for(int i=0; i<clients.size() && !validate;i++) {
			ClientAccount client = clients.get(i);
			if(client.getUserName().equals(userName) && client.getPassword().equals(password)) {
				validate=true;
			}
		}
		return validate;
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
