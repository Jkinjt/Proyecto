package menuMenus;

import Order.Chart;
import Order.Order;
import Order.RepositoryOrders;
import Product.Product;
import Product.Repository;
import client.Client;
import client.RepositoryClients;
import mesage.MensajesCarrito;
import repositoryUtils.herramientas;

import java.util.ArrayList;
import java.util.List;

public class MenuCarrito {
	static herramientas h = new herramientas();
	static MensajesCarrito mc = new MensajesCarrito();
	static Chart ch = Chart.get_Instance(null);
	static Repository p = Repository.getSingletonInstance();
	static RepositoryClients rc = RepositoryClients.getSingletonInstance();
	static RepositoryOrders ro= RepositoryOrders.getSingletonInstance();
	static menuProductos mp = new menuProductos();

	

	public static void menu() {
		int opcion = -1;
		// insertar el cliente del carrito
		mc.insertar();
		Chart carrito = Chart.get_Instance(rc.searchClientByName(h.stringcontrol()));
		do {

			// añadir o eleminar productos del carrito
			addorremove();

			// insertar una direccion en el carrito
			mc.insertaddres();
			carrito.setAddres(h.stringcontrol());

			// calcular el total del carrito
			carrito.totalCalculation();

			mc.datos();
			System.out.println(carrito);
			opcion = h.intcontrol();

		} while (opcion != 0);
		Order nueva= new Order(carrito.getClient(), carrito.getProducts(), carrito.getAddres(), false, false);
		ro.addorden(nueva);
	}
	
	public static List<Product> addorremove() {
		int opcion = -1;
		do {
			mc.addorremove();
			opcion = h.intcontrol();
			switch (opcion) {
			case 1:
				mc.inserteproducto();
				ch.addProduct(p.searchProduct(h.stringcontrol()));
				break;
			case 2:
				mc.inserteproducto();
				ch.deleteProduct(p.searchProduct(h.stringcontrol()));
				break;
			case 3:
				mp.showProducts();
				break;
			case 0:
				h.Salida();
				break;
			default:
				break;
			}
		} while (opcion != 0);
		return ch.getProducts();
	}

	
}
