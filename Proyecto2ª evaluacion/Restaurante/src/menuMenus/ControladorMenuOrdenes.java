package menuMenus;

import java.util.ArrayList;

import Order.Order;
import Order.RepositoryOrders;
import Product.Product;
import Product.Repository;
import client.Client;
import client.RepositoryClients;
import mesage.MensajesOrder;
import repositoryUtils.herramientas;

public class ControladorMenuOrdenes {
	static RepositoryOrders r = RepositoryOrders.getSingletonInstance();
	static RepositoryClients c = RepositoryClients.getSingletonInstance();
	static Repository p = Repository.getSingletonInstance();
	static herramientas h=new herramientas();
	static MensajesOrder m=new MensajesOrder();
	
	
	// menu de modificacion
	public static Order menumodificaciones(Order orden) {
		
		
		ArrayList<Product> productos = new ArrayList<Product>();
		Client nClient;
		int opcion = -1;

		do {
			// muestra el menu de opciones
			MensajesOrder.menueditar();
			// insertar el valor
			
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

		return orden;
	}

	//menu add or remove
	public static void menuAddOrRemove() {
		
		int opcionb = -1;
		do {
			MensajesOrder.menuaddorremove();
			
			opcionb = h.intcontrol();
			switch (opcionb) {
			case 1:
				MensajesOrder.mensajeAddOrRemove();
				r.addorden(r.buscarordencodigo(h.intcontrol()));
				break;
			case 2:
				MensajesOrder.mensajeAddOrRemove();
				r.eliminarorde(r.buscarordencodigo(herramientas.intcontrol()));
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
		} while (opcionb!=0);
		
	}
	
	// menu mostrar menus
	public static void menusmostrar() {
		int opcionc = -1;

		do {
			MensajesOrder.menuverordenes();
			opcionc = h.intcontrol();
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
		} while (opcionc != 0);
	}

	
}
