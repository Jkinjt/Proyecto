package Order;

import java.util.ArrayList;
import java.util.List;

import Product.Product;
import Product.Repository;
import client.Client;
import client.RepositoryClients;
import repositoryUtils.herramientas;

public class Interfazrepositorio {

	// menu de modificacion
	public static Order menumodificaciones(Order orden) {
		RepositoryClients c = RepositoryClients.getSingletonInstance();

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
					//pedir nombre
					MensajesOrder.clientenombre();
					MensajesOrder.nclientenombre();
					nClient = c.searchClientByName(herramientas.stringcontrol());
					orden.setClient(nClient);
					break;
				case 2:
					//pedir por dni
					MensajesOrder.clientedni();
					MensajesOrder.nclientenombre();
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

				MensajesOrder.insertarproductos();

				int opcion2 = 0;

				do {
					MensajesOrder.menupdro();
					opcion2 = herramientas.intcontrol();
					switch (opcion) {
					case 1:
						// añadir producto
						// Repository n= Repository.
						break;
					case 2:
						// eliminar producto
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
