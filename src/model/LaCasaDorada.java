package model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class LaCasaDorada {
	
	private static final String SEPARATE=",";
	
	private List<ClientAccount> clients;
	private List<EmployeeAccount> employees;
	private List<RestaurantProduct> products;
	private List<RestaurantIngredient> ingredients;
	private List<RestaurantTypeOfProduct> types;
	private List<Order> orders;
	private List<Size> sizes;
	private List<SystemUser> users;

	
	public LaCasaDorada() {
		
		clients = new ArrayList<>();
		employees = new ArrayList<>();
		products = new ArrayList<>();
		ingredients = new ArrayList<>();
		types = new ArrayList<>();
		orders = new ArrayList<>();
		sizes = new ArrayList<>();
		users = new ArrayList<>();
	}
	
	public void addUsers(String userName, String password, String firstName, String lastName, String id) {
		users.add(new SystemUser(userName, password, firstName, lastName, id));
	}
	
	public void addClient(String firstName, String lastName, String id, String address, String phoneNumber, String observations) {
		clients.add(new ClientAccount(firstName, lastName, id, address, phoneNumber, observations));
	}
	
	public void addEmployee(String userName, String password, String firstName, String lastName, String id) {
		employees.add(new EmployeeAccount(userName, password, firstName, lastName, id));
	}
	
	public void addProduct(String name, String typeOfProduct, String ingredientsOfProduct, String sizeOfProduct, String priceOfProduct) {
		products.add(new RestaurantProduct(name, typeOfProduct, sizeOfProduct, priceOfProduct, ingredientsOfProduct));
	}
	
	public void addIngredient(String ingredientName) {
		ingredients.add(new RestaurantIngredient (ingredientName));
	}

	public void addTypeOfProduct(String typeName) {
		types.add(new RestaurantTypeOfProduct(typeName));
	}
	
	public void addSize(String sizeName) {
		sizes.add(new Size(sizeName));
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

	public boolean validateEmployee(String firstName, String lastName) {
		boolean validate=false;
		for(int i=0; i<employees.size() && !validate;i++) {
			EmployeeAccount employee = employees.get(i);
			if(employee.getFirstName().equals(firstName) && employee.getLastName().equals(lastName)) {
				validate=true;
			}
		}
		return validate;
	}
	
	public boolean validateUser(String userName, String password) {
		boolean validate=false;
		for(int i=0; i<users.size() && !validate;i++) {
			SystemUser user = users.get(i);
			if(user.getUserName().equals(userName) && user.getPassword().equals(password)) {
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
			double priceOfProduct = Double.parseDouble(parts[3]);
			addProduct(parts[0], parts[1], parts[2], parts[3], parts[4]);
			line = br.readLine();
		}
		br.close();
		
	} 
	
	public void exportEmployeeData(String fileName) throws FileNotFoundException{
        PrintWriter pw = new PrintWriter(fileName);
        for(EmployeeAccount empl : employees){
          pw.println(empl.getFirstName() +SEPARATE+empl.getLastName() +SEPARATE+empl.getId()+SEPARATE+empl.getEmployeeStatus());
        }
        pw.close();
    }
	
	public void exportProductData(String fileName) throws FileNotFoundException{
        PrintWriter pw = new PrintWriter(fileName);
        for(RestaurantProduct prod : products){
          pw.println(prod.getProductName()+SEPARATE+prod.getTypeOfProduct()+SEPARATE+prod.getSizeOfProduct()+SEPARATE+prod.getPriceOfProduct()+SEPARATE+prod.getIngredientsOfProduct());
        }
        pw.close();
    }
	
}
