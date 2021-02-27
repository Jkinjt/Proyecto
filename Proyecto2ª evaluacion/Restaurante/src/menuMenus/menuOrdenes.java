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
	//menu principal
	public static void menuprincipal() {
		RepositoryClients c = RepositoryClients.getSingletonInstance();
		Repository p=Repository.getSingletonInstance();
		RepositoryOrders r= RepositoryOrders.getSingletonInstance();
		ArrayList<Product> productos= new ArrayList<Product>();
		Client nClient;
		int opcion = -1;//opcion de seleccion de menu
		do {
			MensajesOrder.menuPrincicipal();
			// insertar el valor
			MensajesOrder.insertar();
			opcion = herramientas.intcontrol();
			switch (opcion) {
			case 1:
				//modificar orden
				MensajesOrder.buscarpor();
				int opciona=-1;
				opciona=herramientas.intcontrol();
				switch (opciona) {
				case 1://buscar por nombre
					MensajesOrder.insertarc();
					r.modificarorden(herramientas.intcontrol());
					break;
				case 2: //buscar por dni
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
				//----------------------------------------------------------
			case 2:
				MensajesOrder.menuaddorremove();
				int opcionb=-1;
				opcionb=herramientas.intcontrol();
				break;
			case 3: 
				break;
				//-------------------------------------------------------------
			case 0: break;
			default:
				menuprincipal();
				break;
			}
		} while (opcion!=0);
	}
	
	
	
	// menu de modificacion
		public static Order menumodificaciones(Order orden) {
			RepositoryClients c = RepositoryClients.getSingletonInstance();
			Repository p=Repository.getSingletonInstance();
			RepositoryOrders r= RepositoryOrders.getSingletonInstance();
			ArrayList<Product> productos= new ArrayList<Product>();
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
}
