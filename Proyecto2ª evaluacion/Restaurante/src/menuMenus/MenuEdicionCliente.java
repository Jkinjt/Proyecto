package menuMenus;

import java.util.List;

import client.Client;
import client.RepositoryClients;
import mesage.MensajesClient;
import repositoryUtils.herramientas;

public class MenuEdicionCliente  implements IMenuEdicionCliente{

static herramientas h=new herramientas();
static MenuPrincipalCliente me = new MenuPrincipalCliente();
static MensajesClient m = new MensajesClient();
static RepositoryClients rc=RepositoryClients.getSingletonInstance();
	@Override
	public void updateName(Client c) {
		// TODO Auto-generated method stub
		m.insertdata();
		c.setName(h.stringcontrol());
		
	}

	@Override
	public void updateDni(Client c) {
		// TODO Auto-generated method stub
		m.insertdata();
		c.setDni(h.stringcontrol());
	}

	@Override
	public void updateAge(Client c) {
		// TODO Auto-generated method stub
		m.insertdata();
		c.setAge(h.intcontrol());
	}

	@Override
	public void updatepoints(Client c) {
		// TODO Auto-generated method stub
		m.insertdata();
		c.setPoints(h.intcontrol());

	}

	@Override
	public List<String> updateaddres(Client c) {
		List<String> lista=null;
		boolean continuar=false;
		do {
			int opcion=0;
			lista.add(h.stringcontrol());
			m.continuar();
				//mensaje de continuar si/no
			opcion=h.intcontrol();
			if(opcion==1) {
				continuar=true;
			}
		}while (continuar==false);
				
		
		return lista;
	}

}
