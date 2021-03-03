package menuMenus;

import client.Client;
import client.RepositoryClients;
import repositoryUtils.herramientas;

public class MenuEdicionCliente  implements IMenuEdicionCliente{
static Client c=null;
static RepositoryClients rc=RepositoryClients.getSingletonInstance();
	@Override
	public String updateName(String Name) {
		// TODO Auto-generated method stub
		
		return Name;
	}

	@Override
	public String updateInt(String dni) {
		// TODO Auto-generated method stub
	
		return dni;
	}

	@Override
	public int updateAge(int edad) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updatepoints(int puntos) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String[] updateaddres() {
		String[] direcciones=new String[c.getAddress().length+1];
		boolean listo=false;
		do {
			
		} while (listo=false);
		return direcciones;
	}

}
