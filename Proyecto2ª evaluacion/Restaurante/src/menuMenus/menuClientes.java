package menuMenus;



import java.util.Iterator;
import java.util.List;

import client.Client;
import client.RepositoryClients;
import mesage.MensajesClient;
import repositoryUtils.RepositorySaveAndLoad;
import repositoryUtils.herramientas;

public class menuClientes {
	static RepositorySaveAndLoad snl=RepositorySaveAndLoad.getSingletoonInstance();
	static RepositoryClients rc = RepositoryClients.getSingletonInstance();
	static herramientas h=new herramientas();
	static MensajesClient m=new MensajesClient();
	static MenuPrincipalCliente mp=new MenuPrincipalCliente();
	static MenuEdicionCliente me=new MenuEdicionCliente();
	public static void menuclientesprincipal() {
		 
	}
	//menu principal
	public static void MenuPrincipal() {
		int opcion=-1;
		
		do {
			m.menuinicio();
			opcion=h.intcontrol();
		switch (opcion) {
		case 1:
			//editar cliente
			h.cargando();
			mp.UpdateClient();
			
			
			break;
		case 2:
			//add or remove
			h.cargando();
			mp.addorremoveClient();
			break;
		case 3:
			//show clients
			h.cargando();
			mp.showclients();

			
			break;
		
		case 0:
			h.Salida();
			m.salida();
		
			break;
		default:
			break;
		}	
		} while (opcion!=0);
	}

}
