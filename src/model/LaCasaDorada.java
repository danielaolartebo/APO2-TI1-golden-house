package model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class LaCasaDorada implements Serializable{
	
	
	private static final long serialVersionUID = 1;

	private static final String SEPARATE=",";
	
	private List<ClientAccount> clients;
	private List<EmployeeAccount> employees;
	private List<RestaurantProduct> products;
	private List<RestaurantIngredient> ingredients;
	private List<RestaurantTypeOfProduct> types;
	private List<Order> orders;
	private List<Size> sizes;
	private List<ProductQuantity> productQuantity;
 	private int numberList;
	private double priceTotal;

	
	public LaCasaDorada() {
		
		clients = new ArrayList<>();
		employees = new ArrayList<>();
		products = new ArrayList<>();
		ingredients = new ArrayList<>();
		types = new ArrayList<>();
		orders = new ArrayList<>();
		sizes = new ArrayList<>();
		productQuantity = new ArrayList<>();
		numberList=0;
		setPriceTotal(0);
		
	}
	
	public void addClient(String firstName, String lastName, String id, String address, String phoneNumber, String observations) throws IOException {
		clients.add(new ClientAccount(firstName, lastName, id, address, phoneNumber, observations));
	}
	
	public void addEmployee(String userName, String password, String firstName, String lastName, String id) throws IOException {
		employees.add(new EmployeeAccount(userName, password, firstName, lastName, id));
	}
	
	public void addProduct(String name, String typeOfProduct, String[] ingredientsOfProduct, String sizeOfProduct, double priceOfProduct) throws IOException {
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
	
	public void addOrder(ClientAccount client, String[] product, EmployeeAccount employee, String code, LocalDate date, LocalTime time, double[] quantity, String observations, int number, double priceTotal) {
		orders.add(new Order(client, product, employee, code, date, time, quantity, observations, number, priceTotal));
	}
	
	public void addProductQuantity(String nameProduct, double quantity, RestaurantProduct pr) {
		productQuantity.add(new ProductQuantity(nameProduct, quantity, pr));
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
	

	public int getNumberList() {
		return numberList;
	}
	
	public void setNumberList(int numberList) {
		this.numberList=numberList;
	}
	
	public double getPriceTotal() {
		return priceTotal;
	}

	public void setPriceTotal(double priceTotal) {
		this.priceTotal = priceTotal;
	}

	
/*	public boolean verifyRemoveProductInOrder(RestaurantProduct product) {
		boolean found=false;
		for (int i=0; i<orders.size() && !found; i++) {
			String[] arrayProducts=orders.get(i).
					
		}
		return found;
	}  */
	
	public boolean verifyRemoveIngredientInOrder(String ingredient) {
		boolean found=false;
		for(int i=0; i<products.size() && !found; i++) {
				String[] arrayIngredients=products.get(i).getIngredientsOfProductArray();
				String toString = Arrays.toString(arrayIngredients);
				System.out.println(toString);
				System.out.println(ingredient);
				for(int j=0; j<arrayIngredients.length && !found; j++) {
				if (arrayIngredients[j].equals(ingredient)) { 
					found=true;			
				}
			}
		}
		return found;
	}
	
	public boolean verifyRemoveTypeInOrder(String type) {
		boolean found=false;
		for(int i=0; i<products.size() && !found; i++) {
				if (products.get(i).getTypeOfProduct().equals(type)) { 
					found=true;			
			}
		}
		return found;
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
	
	public boolean validateUser(String userName) {
		boolean found=true;
    	for(int i=0;i<employees.size() && found;i++) {
    		if(userName.equals(employees.get(i).getUserName())) {
    			found = false;
    		}
    	}
    	return found;
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
	
	
	public void importOrderData(String fileName) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(fileName));
		String line = br.readLine();
		while(line!=null) {
			String[] parts = line.split(";");
			ClientAccount client = new ClientAccount(parts[0]);
			EmployeeAccount employee = new EmployeeAccount(parts[2]);
			String[] products = parts[1].split(",");
			double [] quantity = new double[1];
			quantity[0] = Double.parseDouble(parts[6]);
			int number = Integer.parseInt(parts[8]);
			double priceTotal = Double.parseDouble(parts[9]); 
			String dates=parts[4]; String times=parts[5];
			String[] arrayDates = dates.split("/");
			LocalDate date = LocalDate.of(Integer.parseInt(arrayDates[0]),Integer.parseInt(arrayDates[1]), Integer.parseInt(arrayDates[2]));
			String[] arrayTimes = times.split(":");
			LocalTime time = LocalTime.of(Integer.parseInt(arrayTimes[0]),Integer.parseInt(arrayTimes[1].substring(0,2)));
			addOrder(client, products, employee, parts[3], date, time, quantity, parts[7], number, priceTotal);
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
			String[] ingredientOfProduct = parts[2].split("-");
			addProduct(parts[0], parts[1], ingredientOfProduct, parts[3], priceOfProduct);
			line = br.readLine();
		}
		br.close();
		
	} 
	
	
	
	public ClientAccount findClient(String firstName){
		ClientAccount tempName=null;
		for (int i=0; i < clients.size();i++) {
			if(clients.get(i).getFirstName().equals(firstName)) {
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
		for (int i=0; i < products.size() && !found;i++) {
			if(products.get(i).getName().equals(name)) {
				tempProduct = products.get(i);
				found = true;
				System.out.println("Encontré Producto");
			}
		}
		return tempProduct;
	}
	
	/* public double[] findQuantity(String[] products){
		boolean found = false;
		double[] tempQuantity=null;
		for (int i=0; i < products.length && !found;i++) {
			if(orders.get(i).getQuantityArray().equals(products)) {
				tempQuantity = products.get(i);
				found = true;
				System.out.println("Encontré cantidad");
			}
		}
		return tempQuantity;
	} */
	
	
	
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
	

	public RestaurantProduct findPrice(double priceOfProduct) {
		RestaurantProduct tempPrice= null;
		System.out.println(priceOfProduct);
		for(int i=0; i<products.size(); i++) {
			if(products.get(i).getPriceOfProduct()==priceOfProduct) {
				tempPrice = products.get(i);
				System.out.println("Encontre el precio ");
			}
		}
		return tempPrice;
	}
	
	public void exportEmployeeData(String fileName) throws IOException{
        PrintWriter pw = new PrintWriter(fileName);
        String starting = "00:00:00";
        String finish = "-23:59:59";
        String range = "Rango de fecha: ";
        String date = " del día ";
        String money = "Dinero total del empleado: ";
        String orders = "Pedidos totales del empleado: ";
        for(EmployeeAccount empl : employees){
          pw.println(empl.getFirstName() +SEPARATE+empl.getLastName()+SEPARATE+
        		  empl.getId()+SEPARATE+empl.getEmployeeStatus()+SEPARATE+
        		  range+starting+finish+date+LocalDate.now()+SEPARATE+
        		  money+empl.getPriceTotal()+SEPARATE+
        		  orders+empl.getAmountOrders());
          empl.setAmountOrders(0);
          empl.setPriceTotal(0);
        }
        
        
        pw.close();
    }
	
	public void exportProductData(String fileName) throws FileNotFoundException{
        PrintWriter pw = new PrintWriter(fileName);
        String count = "Cantidad de veces que se pidió el producto: ";
        String starting = "00:00:00";
        String finish = "-23:59:59";
        String range = "Rango de fecha: ";
        String date = " del día ";
        for(RestaurantProduct prod : products){
          pw.println(prod.getName()+SEPARATE+prod.getTypeOfProduct()+SEPARATE+
        		  prod.getSizeOfProduct()+SEPARATE+prod.getPriceOfProduct()+SEPARATE+
        		  prod.getIngredientsOfProduct()+SEPARATE+range+starting+finish+date+LocalDate.now()+SEPARATE+count+prod.getProductCount());
          prod.setProductCount(0);
        }
        pw.close();
    }
	
	public void exportOrderData(String fileName) throws FileNotFoundException {
		PrintWriter pw = new PrintWriter(fileName);
		String address = "";
		String phone = "";
		String starting = "00:00:00";
        String finish = "-23:59:59";
        String range = "Rango de fecha: ";
        String date = " del día ";
		for(Order order : orders) {
			
			for(int i=0; i<clients.size();i++) {
				if(order.getNameClient().equals(clients.get(i).getFirstName())) {
					address = clients.get(i).getAddress();
					phone = clients.get(i).getPhoneNumber();
				}
			}
			
			pw.println(order.getNameClient()+SEPARATE+address+SEPARATE+phone+SEPARATE+
					order.getNameEmployee()+SEPARATE+order.getOrderStatus()+SEPARATE+
					order.getDate()+SEPARATE+order.getTime()+SEPARATE+order.getObservations()+SEPARATE+
					order.getProduct()+SEPARATE+order.getQuantity()+SEPARATE+range+starting+finish+date+LocalDate.now());
		}
		pw.close();
	}
	
	
	public void sortByIngredientName() {
		boolean changed=true;
	for(int i=1; i < ingredients.size() && changed;i++) {
			changed = false;
			for(int j=0; j< ingredients.size()-1;j++) {
				if(ingredients.get(j).getIngredientName().compareToIgnoreCase(ingredients.get(j+1).getIngredientName())<0) {
					RestaurantIngredient temp = ingredients.get(j);
					ingredients.set(j,ingredients.get(j+1));
					ingredients.set(j+1, temp);
					changed = true;
				}
			}
		}
	}

	public void sortByLastNameClients() {
		boolean changed=true;
	for(int i=1; i < clients.size() && changed;i++) {
			changed = false;
			for(int j=0; j< clients.size()-1;j++) {
				if(clients.get(j).getLastName().compareToIgnoreCase(clients.get(j+1).getLastName())<0) {
					ClientAccount temp = clients.get(j);
					clients.set(j,clients.get(j+1));
					clients.set(j+1, temp);
					changed = true;
				}
			}
		}
	}
	public void sortByPrice() { 
		for(int i=1; i<products.size();i++) {
			int j=i-1;
			RestaurantProduct pr = products.get(i);
			while(j>=0 && pr.compareByPrice(products.get(j))<0) {
				products.set(j+1, products.get(j));
				j--;
			}
			products.set(j+1, pr);
		}

	}

	
	public void sortByTypeName() {
		Collections.sort(types);
	}
	
	public void sortByEmployeeName() {
		EmployeeComparator emp = new EmployeeComparator();
		Collections.sort(employees, emp);		
	}

	public String dateUpdate() {
		
		Date dateUpdate = new Date();
		SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/YYYY");
		return formatDate.format(dateUpdate);
		
		
	}

	
	public void orderAmountEmployee(double totalPrice, String account) {
		
		for(int i=0; i<employees.size() ; i++) {
			if(employees.get(i).getUserName().equals(account)) {
				int amountOrder = employees.get(i).getAmountOrders();
				amountOrder+=1;
				employees.get(i).setAmountOrders(amountOrder);
				double priceTotal = employees.get(i).getPriceTotal();
				priceTotal += totalPrice;
				employees.get(i).setPriceTotal(priceTotal);
				
			}
		}	
	}
	
	
	public void productCount(String product, double count) {
		for(int i=0; i<products.size();i++) {
			if(products.get(i).getName().equals(product)) {
				double productCount = products.get(i).getProductCount();
				productCount+=count;
				products.get(i).setProductCount(productCount);
			}
		}
	}
	
	public void deleteProductCount() {
		for(RestaurantProduct prod : products) {
			prod.setProductCount(0);
		}
	}
	
}
