package model;

import java.util.ArrayList;
import java.util.List;

public class LaCasaDorada {
	private List<ClientAccount> clients;
	private List<EmployeeAccount> employees;
	private List<RestaurantProduct> products;
	private List<RestaurantIngredient> ingredients;
<<<<<<< HEAD
	private List<RestaurantTypeOfProduct> types;
=======
	private List<TypeOfProduct> types;
>>>>>>> 027677bf722bfc52757371441915772842a95f14
	
	public LaCasaDorada() {
		
		clients = new ArrayList<>();
		employees = new ArrayList<>();
		products = new ArrayList<>();
		ingredients = new ArrayList<>();
		types = new ArrayList<>();
	}
	
	public void addClient(String firstName, String lastName, String id, String address, int phoneNumber, String observations) {
		clients.add(new ClientAccount(firstName, lastName, id, address, phoneNumber, observations));
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
	
<<<<<<< HEAD
	public void addTypeOfProduct(String productName) {
		types.add(new RestaurantTypeOfProduct (productName));
=======
	public void addTypeOfProduct(String typeName) {
		types.add(new TypeOfProduct(typeName));
>>>>>>> 027677bf722bfc52757371441915772842a95f14
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
