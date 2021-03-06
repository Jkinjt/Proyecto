package menuMenus;

import client.Client;

public interface IMenuPrincipalCliente {
	//buscar cliente por dni
	public Client SearhClientBydni(int dni);
	
	//buscar cliente por nombre
	public  void showclients();
	
	//actualizar cliente
	public  void UpdateClient();
	
	// añadir cliente o remober
	public void addorremoveClient();
	
	
} 
