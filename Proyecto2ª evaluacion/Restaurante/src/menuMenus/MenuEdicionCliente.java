package menuMenus;

import java.util.List;

import client.Client;
import client.RepositoryClients;
import repositoryUtils.herramientas;

public class MenuEdicionCliente  implements IMenuEdicionCliente{
static Client c=null;
static herramientas h=new herramientas();
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
		List<String> lista=null;
		boolean continuar=false;
		do {
			int opcion=0;
			lista.add(h.stringcontrol());
			
				//mensaje de continuar si/no
			opcion=h.intcontrol();
			if(opcion==1) {
				continuar=true;
			}
		}while (continuar==false);
				
		String[] direcciones= new String[lista.size()];
		direcciones=lista.toArray(direcciones);
		return direcciones;
	}

}
