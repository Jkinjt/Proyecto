package menuMenus;

import client.Client;
import repositoryUtils.herramientas;

public class MenuEdicionCliente  implements IMenuEdicionCliente{
static Client c=new Client(null, null, 0, null);
	@Override
	public String updateName(String Name) {
		// TODO Auto-generated method stub
		
		return Name;
	}

	@Override
	public int updateInt(int dni) {
		// TODO Auto-generated method stub
		return 0;
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
		String[] direcciones=null;
		boolean listo=false;
		do {
			
		} while (listo=false);
		return direcciones;
	}

}
