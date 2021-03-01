package menuMenus;

import client.RepositoryClients;
import repositoryUtils.herramientas;

public class menuClientes {
	static RepositoryClients c= RepositoryClients.getSingletonInstance();
	static herramientas h=new herramientas();
	static MensajesClient m=new MensajesClient();
	static MenuPrincipalCliente mp=new MenuPrincipalCliente();
	static MenuEdicionCliente me=new MenuEdicionCliente();
	public static void menuclientesprincipal() {
		 
	}
	//menu para editar un cliente
	public static void menueditarcliente() {
		int opcion=-1;
		do {
			m.menueditar();
			opcion=h.intcontrol();
			switch (opcion) {
			case 1:
				//modificar nombre
				me.updateName(h.stringcontrol());
				break;
				
			case 2:
				//modificar dni
				me.updateInt(h.intcontrol());
				break;
				
			case 3:
				//modificar edad
				me.updateAge(h.intcontrol());
				break;
				
			case 4:
				//modificar puntos
				me.updatepoints(h.intcontrol());
				break;
				
			case 5:
				//modificar direcciones
				me.updateaddres();
				break;
				
			case 0:
				
				break;
				
			default:
				break;
			}
		} while (opcion!=0);
		
	}
	
	public static void addOrRemove() {
		int opcion=-1;
		do {
			m.menuAddOrRemove();
			opcion=h.intcontrol();
			switch (opcion) {
			case 1:
				//añadir cliente
				break;
			case 2:
				//eliminar cliente
				break;
			case 0:
				m.salida();
				break;
			default:
				break;
			}
			
		} while (opcion!=0);
	}
	
	public static void showclients() {
		int opcion=-1;
		do {
			m.menumostrar();
			opcion=h.intcontrol();
			switch (opcion) {
			case 1:
				//mostrar todos los clientes
				break;
			case 2:
				//mostrar el cliente que tenga el mismo dni
				break;
			case 0:
				m.salida();
				break;
			default:
				break;
			}
		} while (opcion!=0);
	}
}
