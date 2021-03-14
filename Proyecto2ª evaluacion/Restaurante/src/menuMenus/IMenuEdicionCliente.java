package menuMenus;

import java.util.List;

import client.Client;

public interface IMenuEdicionCliente {
	//modificar nombre
	public void updateName(Client c);
	
	//modifcar dni
	public void updateDni(Client c);

	//modificar edad
	public void updateAge(Client c);
	
	//modificar puntos
	public void updatepoints(Client c );
	
	//modificar direccion
	public List<String> updateaddres(Client c);
	
}
