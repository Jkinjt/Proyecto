package client;

public interface IMenuClientRepository {
	//recibe un dni y busca en el repositorio el dni que coincida y devuelve el cliente al que pertenece ese dni
	public Client SearhClientBydni(int dni);
	
	//recibe un nombre y busca en el repositorio el nombre que coincida y devuelve el cliente al que pertenece ese nombre
	public Client SearhClientByname(String name);
	
	//recibe un cliente y devuelve el mismo cliente ya actualizado(nombre/edad/etc)
	public Client UpdateClient(Client client);
	
	// añade un cliente al repositorio
	public void addClient(Client cliente);
	
	// elimina un cliente del repositorio
	
	public void removeClient(Client cliente);
} 