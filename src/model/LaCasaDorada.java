package model;

import java.util.ArrayList;
import java.util.List;

public class LaCasaDorada {
	private List<ClientAccount> clients;
	
	public LaCasaDorada() {
		clients = new ArrayList<>();
	}
	
	public void addClient(String userName) {
		clients.add(new ClientAccount(userName));
	}
	
	public List<ClientAccount> getContacts(){
		return clients; 
	}
}
