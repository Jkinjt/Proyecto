package menuMenus;

import java.util.ArrayList;

import Order.Order;
import Order.RepositoryOrders;
import Product.Product;
import Product.Repository;
import client.Client;
import client.RepositoryClients;
import repositoryUtils.herramientas;

public class menuOrdenes {
	// menu principal
	public static void menuprincipal() {
		RepositoryClients c = RepositoryClients.getSingletonInstance();
		Repository p = Repository.getSingletonInstance();
		RepositoryOrders r = RepositoryOrders.getSingletonInstance();
		ArrayList<Product> productos = new ArrayList<Product>();
		Client nClient;
		int opcion = -1;// opcion de seleccion de menu
		do {
			MensajesOrder.menuPrincicipal();
			// insertar el valor
			MensajesOrder.insertar();
			opcion = herramientas.intcontrol();
			switch (opcion) {
			case 1:
				// modificar orden
				MensajesOrder.buscarpor();
				int opciona = -1;
				opciona = herramientas.intcontrol();
				switch (opciona) {
				case 1:// buscar por nombre
					MensajesOrder.insertarc();
					r.modificarorden(herramientas.intcontrol());
					break;
				case 2: // buscar por dni
					MensajesOrder.insertarn();
					r.modificarorden(herramientas.stringcontrol());
					break;
				case 0:
					menuprincipal();
					break;
				default:
					break;
				}
				break;
			// ----------------------------------------------------------

			case 2:
				// añadir o remover
				
				
				
				break;
			// ----------------------------------------------------------

			case 3:
				menusmostrar();
				break;
			// -------------------------------------------------------------
			case 0:
				MensajesOrder.salida();
				break;
			default:
				menuprincipal();
				break;
			}
		} while (opcion != 0);
	}

	// menu de modificacion
	public static Order menumodificaciones(Order orden) {
		RepositoryClients c = RepositoryClients.getSingletonInstance();
		Repository p = Repository.getSingletonInstance();
		RepositoryOrders r = RepositoryOrders.getSingletonInstance();
		ArrayList<Product> productos = new ArrayList<Product>();
		Client nClient;
		int opcion = -1;

		do {
			// muestra el menu de opciones
			MensajesOrder.menueditar();
			// insertar el valor
			MensajesOrder.insertar();
			opcion = herramientas.intcontrol();
			switch (opcion) {

			case 1:
				// modificar estado pago
				if (orden.isPayed() == true) {
					orden.setPayed(false);
				} else {
					orden.setPayed(true);
				}
				MensajesOrder.mdeli();

				break;

			case 2:
				// modifica estado envio
				if (orden.isDelivered() == true) {
					orden.setDelivered(false);
				} else {
					orden.setDelivered(true);
				}
				MensajesOrder.mpay();

				break;
			case 0:
				// salida
				MensajesOrder.salida();
				break;
			default:
				break;
			}

		} while (opcion != 0);

		return orden;
	}

	//menu add or remove
	public static void menuAddOrRemove() {
		RepositoryOrders r = RepositoryOrders.getSingletonInstance();
		int opcionb = -1;
		do {
			MensajesOrder.menuaddorremove();
			
			opcionb = herramientas.intcontrol();
			switch (opcionb) {
			case 1:
				MensajesOrder.mensajeAddOrRemove();
				r.añadirorden(r.buscarordencodigo(herramientas.intcontrol()));
				break;
			case 2:
				MensajesOrder.mensajeAddOrRemove();
				r.eliminarorde(herramientas.intcontrol());
				break;

			default:
				break;
			}
		} while (opcionb!=0);
		
	}
	
	// menu mostrar menus
	public static void menusmostrar() {
		RepositoryOrders r = RepositoryOrders.getSingletonInstance();
		herramientas h= new herramientas();
		int opcionc = -1;

		do {
			MensajesOrder.menuverordenes();
			opcionc = herramientas.intcontrol();
			switch (opcionc) {
			case 1:
				//mostrar todas las ordenes
			h.imprimir(r.getallorder());	
				break;
			case 2:
				//mostrar todas las pagadas
				h.imprimir(r.AllInput());
				break;
			case 3:
				//mostrar todas las no pagadas
				h.imprimir(r.getOrdersNoPayed());
				break;
			case 4:
				//mostrar las enviadas
				h.imprimir(r.getOrdersDelivered());
				break;
			case 5:
				//mostrar las no enviadas
				h.imprimir(r.getOrdersNoDelivered());
				break;
			case 6:
				//mostrar entre dos fechas
				h.imprimir(r.getInputByDate(null, null));
				break;
			case 7:		
				//mostrar en una fecha
				h.imprimir(r.getOrdersByDate(null));
				break;
			case 8:
				//mostrar por cliente
				h.imprimir(r.getOrdersByClient(herramientas.stringcontrol()));
				break;
			case 0:
				MensajesOrder.salida();
				break;
			default:
				break;
			}
		} while (opcionc != 0);
	}
}
