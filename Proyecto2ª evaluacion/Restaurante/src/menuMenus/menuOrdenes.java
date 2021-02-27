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
				MensajesOrder.menuopciones();
				// insertar el valor
				MensajesOrder.insertar();
				opcion = herramientas.intcontrol();
				switch (opcion) {
				case 1:
					// modificar el cliente de la orden
					MensajesOrder.insertarClien();

					MensajesOrder.menucli();
					int opcion3 = 0;

					switch (opcion) {
					case 1:
						// pedir nombre
						
						
						
						MensajesOrder.clientenombre();
						nClient = c.searchClientByName(herramientas.stringcontrol());
						
						orden.setClient(nClient);
						break;
					case 2:
						// pedir por dni
						MensajesOrder.clientedni();
						nClient = c.searchClientByDni(herramientas.stringcontrol());
						orden.setClient(nClient);
						break;
					case 0:
						break;
					default:
						break;
					}
					MensajesOrder.mClient();
					break;

				case 2:
					// modificar productos

					

					int opcion2 = 0;

					do {
						MensajesOrder.menupdro();
						opcion2 = herramientas.intcontrol();
						switch (opcion) {
						case 1:
							// añadir producto
							MensajesOrder.insertarproductos();
							productos=orden.getProduct();
							productos.add(p.searchProduct(herramientas.stringcontrol()));
							orden.setProduct(productos);
							orden.setTotal(r.calculototal(orden));
							MensajesOrder.mprod();
							break;
						case 2:
							// eliminar producto
							MensajesOrder.insertarproductos();
							productos=orden.getProduct();
							productos.remove(p.searchProduct(herramientas.stringcontrol()));
							orden.setProduct(productos);
							orden.setTotal(r.calculototal(orden));
							MensajesOrder.mprod();
							break;
						case 0:
							break;
						default:
							break;
						}
					} while (opcion != 0);

					MensajesOrder.mprod();
					break;

				case 3:
					// modificar direccion
					MensajesOrder.insertardirecc();
					orden.setAddress(herramientas.stringcontrol());
					MensajesOrder.maddr();

					break;

				case 4:
					// modificar estado pago
					if (orden.isPayed() == true) {
						orden.setPayed(false);
					} else {
						orden.setPayed(true);
					}
					MensajesOrder.mdeli();

					break;

				case 5:
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
