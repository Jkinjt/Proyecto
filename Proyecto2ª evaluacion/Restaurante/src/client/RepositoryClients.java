package client;

import java.util.Arrays;

public class RepositoryClients {
	private Client[] client;

	public RepositoryClients(Client[] client) {
		super();
		this.client = client;
	}

	public Client[] getAllClient() {
		return client;
	}

	public void setClient(Client[] client) {
		this.client = client;
	}

	@Override
	public String toString() {
		return "RepositoryClients [client=" + Arrays.toString(client) + "]";
	}
	
	
	
	
	
}
