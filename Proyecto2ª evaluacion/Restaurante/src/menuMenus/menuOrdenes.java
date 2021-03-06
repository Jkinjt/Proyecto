package menuMenus;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import Order.Order;
import Order.RepositoryOrders;
import Product.Product;
import Product.Repository;
import client.Client;
import client.RepositoryClients;
import mesage.MensajesOrder;
import repositoryUtils.herramientas;

public class menuOrdenes {
	// menu principal
	static RepositoryOrders r = RepositoryOrders.getSingletonInstance();
	static RepositoryClients c = RepositoryClients.getSingletonInstance();
	static Repository p = Repository.getSingletonInstance();
	static herramientas h=new herramientas();
	static MensajesOrder m=new MensajesOrder();
	static ControladorMenuOrdenes co=new ControladorMenuOrdenes();
	public static void menuprincipal() {
		
		
		ArrayList<Product> productos = new ArrayList<Product>();
		Client nClient;
		int opcion = -1;// opcion de seleccion de menu
		
		
		/*
		 * ------------------------------------------------------
		 */
		
		do {
			MensajesOrder.menuPrincicipal();
			// insertar el valor
			
			opcion = herramientas.intcontrol();
			switch (opcion) {
			case 1:
				// modificar orden
				MensajesOrder.buscarpor();
				int opciona = -1;
				opciona = h.intcontrol();
				switch (opciona) {
				case 1:// buscar por nombre
					MensajesOrder.insertarc();
					//en progreso
					co.menumodificaciones(r.buscarordencodigo(h.intcontrol()));
					break;
				case 2: // buscar por dni
					MensajesOrder.insertarn();
					co.menumodificaciones(r.buscarordencodigo(h.intcontrol()));
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
				
				co.menuAddOrRemove();
				
				break;
			// ----------------------------------------------------------

			case 3:
				co.menusmostrar();
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


}
