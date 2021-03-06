package menuMenus;



import java.util.Iterator;
import java.util.List;

import client.Client;
import client.RepositoryClients;
import mesage.MensajesClient;
import repositoryUtils.herramientas;

public class menuClientes {
	
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
			mp.UpdateClient();

			
			break;
		case 2:
			//add or remove

			mp.addorremoveClient();
			break;
		case 3:
			//show clients
			mp.showclients();

			
			break;
		
		case 0:
			m.salida();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		default:
			break;
		}	
		} while (opcion!=0);
	}

}
