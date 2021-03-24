package model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalTime;
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
	private List<ProductQuantity> productQuantity;
	private int numberList;

	
	public LaCasaDorada() {
		
		clients = new ArrayList<>();
		employees = new ArrayList<>();
		products = new ArrayList<>();
		ingredients = new ArrayList<>();
		types = new ArrayList<>();
		orders = new ArrayList<>();
		sizes = new ArrayList<>();
		users = new ArrayList<>();
		productQuantity = new ArrayList<>();
		numberList=0;
		
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
	
	public void addProduct(String name, String typeOfProduct, String ingredientsOfProduct, String sizeOfProduct, double priceOfProduct) {
		products.add(new RestaurantProduct(name, typeOfProduct, ingredientsOfProduct, sizeOfProduct, priceOfProduct));
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
	
	public void addOrder(ClientAccount client, RestaurantProduct product, EmployeeAccount employee, String code, LocalDate date, LocalTime time, double quantity, String observations, int number) {
		orders.add(new Order(client, product, employee, code, date, time, quantity, observations, number));
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
	
	public List<ProductQuantity> getProductQuantity(){
		return productQuantity;
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
	
	public boolean validateProduct(String name) {
		boolean validate=false;
		for(int i=0; i<products.size() && !validate;i++) {
			RestaurantProduct product = products.get(i);
			if(product.getName().equals(name)) {
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
			double priceOfProduct = Double.parseDouble(parts[4]);
			addProduct(parts[0], parts[1], parts[2], parts[3], priceOfProduct);
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
          pw.println(prod.getName()+SEPARATE+prod.getTypeOfProduct()+SEPARATE+prod.getSizeOfProduct()+SEPARATE+prod.getPriceOfProduct()+SEPARATE+prod.getIngredientsOfProduct());
        }
        pw.close();
    }
	
	public ClientAccount findClient(String firstName, String lastName, String id){
		ClientAccount tempName=null;
		for (int i=0; i < clients.size();i++) {
			if(clients.get(i).getFirstName().equals(firstName) && clients.get(i).getLastName().equals(lastName) && clients.get(i).getId().equals(id)) {
				tempName = clients.get(i);
			}
		}
		return tempName;
	}
	
	public EmployeeAccount findEmployee(String firstName){
		EmployeeAccount tempName=null;
		boolean found = false;
		System.out.println(firstName);
		for (int i=0; i < employees.size() && !found;i++) {
			if(employees.get(i).getFirstName().equals(firstName)) {
				tempName = employees.get(i);
				found = true;
				System.out.println("Encontré empleado");
			}
		}
		return tempName;
	}
	
	public RestaurantProduct findProduct(String name){
		boolean found = false;
		RestaurantProduct tempProduct=null;
		System.out.println(name);
		for (int i=0; i < products.size() && !found;i++) {
			if(products.get(i).getName().equals(name)) {
				tempProduct = products.get(i);
				found = true;
				System.out.println("Encontré Producto");
			}
		}
		return tempProduct;
	}
	
	public RestaurantIngredient findIngredient(String ingredientName) {
		boolean found = false;
		RestaurantIngredient tempIng = null;
		for(int i=0; i <ingredients.size() && !found; i++) {
			if(ingredients.get(i).getIngredientName().equals(ingredientName)) {
				tempIng = ingredients.get(i);
			}
		}
		return tempIng;
	}

	public int getNumberList() {
		return numberList;
	}
	
	public void setNumberList(int numberList) {
		this.numberList=numberList;
	}
}
