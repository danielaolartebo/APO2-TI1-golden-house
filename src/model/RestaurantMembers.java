package model;

import java.util.ArrayList;
import java.util.List;

public abstract class RestaurantMembers {
	private List<ClientAccount> clients;
	private List<EmployeeAccount> employees;
	
	private String firstName;
	private String lastName;
	private String id;
	
	public RestaurantMembers(String firstName, String lastName, String id) {
		this.firstName=firstName;
		this.lastName = lastName;
		this.id = id; //OPTIONAL
		
		clients = new ArrayList<>();
		employees = new ArrayList<>();
	}
	
	public void addClient(String firstName, String lastName, String id, String address, int phoneNumber, String observations) {
		clients.add(new ClientAccount(firstName, lastName, id, address, phoneNumber, observations));
	}
	
	public void addEmployee(String userName, String password, String firstName, String lastName, String id) {
		employees.add(new EmployeeAccount(userName, password, firstName, lastName, id));
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName=firstName;
	}
	
	public String getLastName() {
		return lastName;
	}	
	
	public void setLastName(String lastName) {
		this.lastName=lastName;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id=id;
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
