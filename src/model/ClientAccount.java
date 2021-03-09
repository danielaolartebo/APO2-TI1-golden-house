package model;

public class ClientAccount extends RestaurantMembers{
	
		private String address;
		private int phoneNumber;
		private String observations;
		
		public ClientAccount(String firstName, String lastName, String id, String address, int phoneNumber, String observations) {
			super(firstName, lastName, id);
			this.address = address;
			this.phoneNumber = phoneNumber;
			this.observations=observations;
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
