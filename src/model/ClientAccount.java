package model;

public class ClientAccount extends RestaurantMembers{
	
		private String address;
		private String phoneNumber;
		private String observations;
		
		public ClientAccount(String firstName, String lastName, String id, String address, String phoneNumber, String observations) {
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
		
		public String getPhoneNumber() {
			return phoneNumber;
		}
		
		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber=phoneNumber;
		}
		
		public String getObservations() {
			return observations;
		}
		
		public void setObservations(String observations) {
			this.observations=observations;
		}

}
