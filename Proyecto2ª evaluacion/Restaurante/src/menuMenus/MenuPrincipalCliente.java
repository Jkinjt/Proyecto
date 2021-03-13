package menuMenus;

import java.util.ArrayList;
import java.util.List;

import client.Client;
import client.RepositoryClients;

import mesage.MensajesClient;
import repositoryUtils.RepositorySaveAndLoad;
import repositoryUtils.herramientas;

public class MenuPrincipalCliente implements IMenuPrincipalCliente {
	static RepositorySaveAndLoad snl=RepositorySaveAndLoad.getSingletoonInstance();
	static RepositoryClients Rc = RepositoryClients.getSingletonInstance();
	static herramientas h = new herramientas();
	static MensajesClient m = new MensajesClient();
	static MenuPrincipalCliente mp = new MenuPrincipalCliente();
	static MenuEdicionCliente me = new MenuEdicionCliente();

	@Override
	public void showclients() {
		// TODO Auto-generated method stub
		MenuShowClients();
	}

	@Override
	public void UpdateClient() {
		m.pedidodni();
		
		menueditarcliente(Rc.searchClientByDni(h.stringcontrol()));
		snl.saveClient(Rc.getClient());
	}

	@Override
	public void addorremoveClient() {
		MenuAddOrRemove();
		snl.saveClient(Rc.getClient());
	}

	// submenu para editar un cliente
	public static void menueditarcliente(Client c) {
		int opcion = -1;

		do {
			m.menueditar();
			opcion = h.intcontrol();
			switch (opcion) {
			case 1:
				// modificar nombre
				me.updateName();
			
				break;

			case 2:
				// modificar dni
				me.updateDni();
				break;

			case 3:
				// modificar edad
				h.intcontrol();
				break;

			case 4:
				// modificar puntos
				me.updatepoints();
				break;

			case 5:
				// modificar direcciones
				me.updateaddres();
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
		} while (opcion != 0);

	}

	// submenu añadir or eliminar
	public static void MenuAddOrRemove() {
		int opcion = -1;
		do {
			m.menuAddOrRemove();
			opcion = h.intcontrol();
			switch (opcion) {
			case 1:
				// añadir cliente
				addcliente();
				break;
			case 2:
				// eliminar cliente
				m.insertardni();
				Rc.deleteClient(Rc.searchClientByDni(h.stringcontrol()));
				break;
			case 0:
				m.salida();
				break;
			default:
				break;
			}

		} while (opcion != 0);
	}
	// añadir un cliente nuevo

	public static void addcliente() {
		String dni = null;
		String name = null;
		int edad = 0;
		List<String> lista = null;
		boolean continuar = false;

		// inserte dni
		m.dni();
		dni = h.stringcontrol();

		// inserte nombre
		m.nombre();
		name = h.stringcontrol();

		// inserte edad
		m.edad();
		edad = h.intcontrol();

		// inserte direcciones
		do {
			m.direcciones();
			int opcion = 0;
			lista.add(h.stringcontrol());
			// mensaje de continuar si/no
			m.continuar();
			opcion = h.intcontrol();
			if (opcion == 1) {
				continuar = true;
			}
		} while (continuar == false);

		

		Client nuevoc = new Client(dni, name, edad, lista);
		h.cargando();
		Rc.addClient(nuevoc);
		m.dentro();

	}

	public static void MenuShowClients() {
		int opcion = -1;
		do {
			m.menumostrar();
			opcion = h.intcontrol();
			switch (opcion) {
			case 1:
				// mostrar todos los clientes
				Rc.showall();
				break;
			case 2:
				// mostrar el cliente que tenga el mismo dni
				m.buscarpordni();
				Rc.showbydni(h.stringcontrol());
				break;
			case 0:
				m.salida();
				
				break;
			default:
				break;
			}
		} while (opcion != 0);

	}
	
}
