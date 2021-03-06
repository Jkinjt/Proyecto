package menuMenus;

import java.util.List;

import client.Client;
import client.RepositoryClients;
import repositoryUtils.herramientas;

public class MenuPrincipalCliente implements IMenuPrincipalCliente {
	static RepositoryClients Rc = RepositoryClients.getSingletonInstance();
	static herramientas h = new herramientas();
	static MensajesClient m = new MensajesClient();
	static MenuPrincipalCliente mp = new MenuPrincipalCliente();
	static MenuEdicionCliente me = new MenuEdicionCliente();

	@Override
	public Client SearhClientBydni(int dni) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void showclients() {
		// TODO Auto-generated method stub
		
	}




	@Override
	public void UpdateClient() {
		m.pedidodni();
		 Rc.searchClientByDni(h.stringcontrol());
		
	}
	

	@Override
	public void addorremoveClient() {
		// TODO Auto-generated method stub

	}

	// menu para editar un cliente
	public static void menueditarcliente(Client c) {
		int opcion = -1;

		do {
			m.menueditar();
			opcion = h.intcontrol();
			switch (opcion) {
			case 1:
				// modificar nombre
				//
				c.setName(me.updateName(h.stringcontrol()));
				break;

			case 2:
				// modificar dni
				c.setDni(me.updateInt(h.stringcontrol()));
				break;

			case 3:
				// modificar edad
				me.updateAge(h.intcontrol());
				break;

			case 4:
				// modificar puntos
				me.updatepoints(h.intcontrol());
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

		String[] direcciones = new String[lista.size()];
		direcciones = lista.toArray(direcciones);

		Client nuevoc = new Client(dni, name, edad, direcciones);

		Rc.addClient(nuevoc);
	}

	public static void MenuShowClients() {
		int opcion = -1;
		do {
			m.menumostrar();
			opcion = h.intcontrol();
			switch (opcion) {
			case 1:
				// mostrar todos los clientes
				break;
			case 2:
				// mostrar el cliente que tenga el mismo dni
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






}
