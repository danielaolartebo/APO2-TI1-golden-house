package model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javafx.util.Callback;

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
	
	public void addClient(String firstName, String lastName, String id, String address, String phoneNumber, String observations) {
		clients.add(new ClientAccount(firstName, lastName, id, address, phoneNumber, observations));
	}
	
	public void addEmployee(String userName, String password, String firstName, String lastName, String id) {
		employees.add(new EmployeeAccount(userName, password, firstName, lastName, id));
	}
	
	public void addProduct(String productName, double[][] sizePrice) {
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
	
	public List<Order> getOrders(){
		return orders; 
	}
	
	public List<RestaurantProduct> getProducts(){
		return products; 
	}
	
	public List<RestaurantIngredient> getIngredients(){
		return ingredients; 
	}
	
	public List<RestaurantTypeOfProduct> getTypeOfProducts(){
		return types; 
	}
	
	public boolean validateOrder(String code) {
		boolean validate=false;
		for(int i=0; i<orders.size() && !validate;i++) {
			Order order = orders.get(i);
			if(order.getCode().equals(order.getCode())) {
				validate=true;
			}
		}
		return validate;
	}
	
	public boolean validateClient(String id) {
		boolean validate=false;
		for(int i=0; i<clients.size() && !validate;i++) {
			ClientAccount client = clients.get(i);
			if(client.getFirstName().equals(client.getFirstName()) && client.getLastName().equals(client.getLastName())) {
				validate=true;
			}
		}
		return validate;
	}
	
	public boolean validateIngredient(String ingredientName) {
		boolean validate=false;
		for(int i=0; i<ingredients.size() && !validate;i++) {
			RestaurantIngredient ingredient = ingredients.get(i);
			if(ingredient.getIngredientName().equals(ingredientName)) {
				validate=true;
			}
		}
		return validate;
	}
	
	public boolean validateProduct(String productName) {
		boolean validate=false;
		for(int i=0; i<products.size() && !validate;i++) {
			RestaurantProduct product = products.get(i);
			if(product.getProductName().equals(productName)) {
				validate=true;
			}
		}
		return validate;
	}
	
	public boolean validateTypeOfProduct(String typeName) {
		boolean validate=false;
		for(int i=0; i<types.size() && !validate;i++) {
			RestaurantTypeOfProduct type = types.get(i);
			if(type.getTypeOfProductName().equals(typeName)) {
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

	public void importEmployeeData(String fileName) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(fileName));
		String line = br.readLine();
		while(line!=null) {
			String[] parts = line.split(",");
			addEmployee(parts[0], parts[1], parts[2], parts[3], parts[4]);
			line = br.readLine();
		}
		br.close();
	}

	public void importCustomerData(String fileName) throws IOException{
		BufferedReader br = new BufferedReader(new FileReader(fileName));
		String line = br.readLine();
		while(line!=null) {
			String[] parts = line.split(",");
			addClient(parts[0], parts[1], parts[2], parts[3], parts[4], parts[5]);
			line = br.readLine();
		}
		br.close();
		
	}

	public void importProductData(String fileName) throws IOException{
		BufferedReader br = new BufferedReader(new FileReader(fileName));
		String line = br.readLine();
		while(line!=null) {
			String[] parts = line.split(",");
			// double[][] sizePrice = Double[][].parseDouble(parts[1]);
			// addProduct(parts[0], sizePrice);
			line = br.readLine();
		}
		br.close();
		
	}
	
}
