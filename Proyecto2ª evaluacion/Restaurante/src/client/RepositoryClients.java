package client;

import java.util.List;

public class RepositoryClients {
	private List<Client> client;
	
	public List<Client> getClient() {
		return client;
	}
	public void setClient(List<Client> client) {
		this.client = client;
	}
	public Client searchClientByName(String name) {
		Client result=null;
		if(name!=null) {
			for (int i = 0; i < client.size(); i++) {
				if(client.get(i).getName().equals(name)) {
					result=client.get(i);
				}				
			}
		}
		
		return result;
	}
	public void aupdateClient(Client c) {
		
		
	}
	public void addClient(Client c) {
		if(c!=null) {
			client.add(c);
		}
		
	}
	public void deleteClient(Client c) {
		if(c!=null) {
			client.remove(c);
		}
	}
	public Client searchClientByDni(String dni) {
		Client result=null;
		if(dni!=null) {
			for (int i = 0; i < client.size(); i++) {
				if(client.get(i).getDni().equals(dni)) {
					result=client.get(i);
				}				
			}
		}
		return result;
	}
	
	
	
	
	
}
