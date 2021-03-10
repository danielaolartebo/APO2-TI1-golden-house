package model;

public class RestaurantMembers {
	
	private String firstName;
	private String lastName;
	private String id;
	
	public RestaurantMembers(String firstName, String lastName, String id) {
		this.firstName=firstName;
		this.lastName = lastName;
		this.id = id; //OPTIONAL

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

}
