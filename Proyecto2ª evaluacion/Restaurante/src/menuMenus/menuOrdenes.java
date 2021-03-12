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
import repositoryUtils.RepositorySaveAndLoad;
import repositoryUtils.herramientas;

public class menuOrdenes {
	// menu principal
	static RepositorySaveAndLoad snl=RepositorySaveAndLoad.getSingletoonInstance();
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
					
					h.cargando();
					co.menumodificaciones(r.buscarordencodigo(h.intcontrol()));
					break;
				case 2: // buscar por dni
					MensajesOrder.insertarn();
					h.cargando();
					co.menumodificaciones(r.buscarordencodigo(h.intcontrol()));
					break;
				case 0:
					h.Salida();
					menuprincipal();
					break;
				default:
					break;
				}
			snl.saveOrders(r.getallorder());
				break;
				
			// ----------------------------------------------------------

			case 2:
				// añadir o remover
				h.cargando();
				co.menuAddOrRemove();
				snl.saveOrders(r.getallorder());
				break;
			// ----------------------------------------------------------

			case 3:
				h.cargando();
				co.menusmostrar();
				break;
			// -------------------------------------------------------------
			case 0:
				
				MensajesOrder.salida();
				break;
			default:
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				menuprincipal();
				break;
			}
		} while (opcion != 0);
	}


}
