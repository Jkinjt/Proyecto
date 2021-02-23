package client;

public interface IMenuClientRepository {
	//buscar cliente por dni
	public Client SearhClientBydni(int dni);
	
	//buscar cliente por nombre
	public Client SearhClientByname(String name);
	
	//actualizar cliente
	public Client UpdateClient(Client client);
	
	// añadir cliente
	public void addClient(Client cliente);
	
	// eliminar cliente
	
	public void removeClient(Client cliente);
} 