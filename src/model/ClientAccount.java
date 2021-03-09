package model;

public class ClientAccount{
	
		private String userName;
		private String password;
		private String firstName;
		private String lastName;
		private String id;
		private String address;
		private int phoneNumber;
		private String observations;
		
		public ClientAccount(String userName, String password, String firstName, String lastName, String id, String address, int phoneNumber, String observations) {
			this.userName=userName;
			this.password=password;
			this.firstName=firstName;
			this.lastName = lastName;
			this.id = id; //OPTIONAL
			this.address = address;
			this.phoneNumber = phoneNumber;
		}
	
		public String getUserName() {
			return userName;
		}
		
		public void setUserName(String userName) {
			this.userName=userName;
		}
		
		public String getPassword() {
			return password;
		}
		
		public void setPassword(String password) {
			this.password=password;
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
		
		public String getAddress() {
			return address;
		}
		
		public void setAddress(String address) {
			this.address=address;
		}
		
		public int getPhoneNumber() {
			return phoneNumber;
		}
		
		public void setPhoneNumber(int phoneNumber) {
			this.phoneNumber=phoneNumber;
		}
		
		public String getObservations() {
			return observations;
		}
		
		public void setObservations(String observations) {
			this.observations=observations;
		}

}
