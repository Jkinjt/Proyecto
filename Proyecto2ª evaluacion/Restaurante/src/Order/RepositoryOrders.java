package Order;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import Product.Product;
import client.Client;
import repositoryUtils.herramientas;


public class RepositoryOrders {
	private List<Order> registro=new ArrayList<>();
	public static RepositoryOrders unico;
	
	private RepositoryOrders() {	}

	//crea un repositorio unico
	public static RepositoryOrders getSingletonInstance() {
		if (unico == null) {
			unico = new RepositoryOrders();
		}
		return unico;
	}
	
	//añadir orden al repositorio
	public void añadiralumno(Order p) {
		registro.add(p);
	}
	//borrar una orden del repositorio
	public void eliminarorde(String dni) {
		boolean eliminado=false;
		for (int i = 0; i < registro.size()&& eliminado==false; i++) {
			if (registro.get(i).getClient().getDni().equals(dni)) {
				registro.remove(i);
				eliminado=true;
			}
		}
	}
	//modificar una orden existentente
	public  void modificarorden(int codigo) {
		boolean encontrado=false;
		for (int i = 0; i < registro.size() && encontrado==false; i++) {
			if (i==codigo-1) {
				menumodificaciones(i);
				encontrado=true;
			}
		}
	}
	//menu de modificacion
	public void menumodificaciones(int orden) {
		
		int opcion=-1;;
		
		System.out.println("+--------------------------+");
		System.out.println("| 1-Modificar cliente      |");
		System.out.println("+--------------------------+");
		System.out.println("| 2-Modificar productos    |");
		System.out.println("+--------------------------+");
		System.out.println("| 3-Modificar direccion    |");
		System.out.println("+--------------------------+");
		System.out.println("| 4-Modificar estado pago  |");
		System.out.println("+--------------------------+");
		System.out.println("| 5-Modificar estado envio |");
		System.out.println("+--------------------------+");
		System.out.println("| 0-Salir                  |");
		System.out.println("+--------------------------+");
		opcion=herramientas.intcontrol();
		
		switch (opcion) {
		case 1:
			//modificar un cliente
			Client nuevo= new Client(herramientas.stringcontrol(), herramientas.stringcontrol(), herramientas.intcontrol(), registro.get(opcion).getClient().getAddress());
			registro.get(orden).setClient(nuevo);
			System.out.println("+--------------------+");
			System.out.println("| Cliente modificado |");
			System.out.println("+--------------------+");
			modificarorden(herramientas.intcontrol());
			break;
		case 2:
			//modificar productos
			
			modificarorden(herramientas.intcontrol());
			break;
			
		case 3:
			//modificar direccion
			registro.get(opcion).setAddress(herramientas.stringcontrol());
			System.out.println("+----------------------+");
			System.out.println("| Direccion modificada |");
			System.out.println("+----------------------+");
			modificarorden(herramientas.intcontrol());
			break;
			
		case 4:
			//modificar estado 
			if(registro.get(opcion).isPayed()==true) {
				registro.get(opcion).setPayed(false);
			}else {
				registro.get(opcion).setPayed(true);
			}
			System.out.println("+---------------------------+");
			System.out.println("| Estado de pago modificado |");
			System.out.println("+---------------------------+");
			modificarorden(herramientas.intcontrol());
			break;
			
		case 5:
			if(registro.get(opcion).isDelivered()==true) {
				registro.get(opcion).setDelivered(false);
			}else {
				registro.get(opcion).setDelivered(true);
			}
			System.out.println("+----------------------------+");
			System.out.println("| Estado de envio modificado |");
			System.out.println("+----------------------------+");
			modificarorden(herramientas.intcontrol());
			break;
		case 0:
			System.out.println("+----------+");
			System.out.println("| SALIENDO |");
			System.out.println("+----------+");
			
			break;
		default:
			menumodificaciones(orden);
			break;
		}
		
	}
	
	
	//mostrar todos los pedidos
	public void getallorder() {
		if (registro != null) {
			for (int i = 0; i < registro.size(); i++) {
				System.out.println(i+1+""+registro.get(i));
			}
		}
	}

	//mostrar todas las ordenes de un cliente
	public Order getOrdersByClient(String dni) {
		Order result = null;
		if (dni != null && registro != null) {
			for (int i = 0; i < registro.size() && result == null; i++) {
				if (registro.get(i).getClient().getDni().equals(dni)) {
					result = registro.get(i);
				}
			}
		}
		return result;
	}

	//mostrar todas las ordenes de una fecha
	public void getOrdersByDate(String date) {

		if (date != null && registro != null) {
			for (int i = 0; i < registro.size(); i++) {
				if (registro.get(i).getDate().equals(date)) {
					System.out.println(registro.get(i));
				}
			}
		}

	}

	//mostrar todas las ordenes no enviadas
	public void getOrdersNoDelivered() {
		if (registro != null) {
			for (int i = 0; i < registro.size(); i++) {
				if (registro.get(i).isDelivered() == false) {
					System.out.println(registro.get(i));
				}
			}
		}

	}

	//mostrar todos los pedidos no pagados
	public void getOrdersNoPayed() {
		if (registro != null) {
			for (int i = 0; i < registro.size(); i++) {
				if (registro.get(i).isPayed() == false) {
					System.out.println(registro.get(i));
				}
			}
		}

	}

	// mostrar todos los pedidos pagados
	public void AllInput() {
		if (registro != null) {
			for (int i = 0; i < registro.size(); i++) {
				if (registro.get(i).isPayed() == true) {
					System.out.println(registro.get(i));
				}
			}
		} 

	}

	// mostrar todos los pedidos entre dos fechas
	public void getInputByDate(LocalDateTime ini, LocalDateTime end) {
		if (registro != null) {
			for (int i = 0; i < registro.size(); i++) {
				if ((registro.get(i).getDate().isBefore(end) || registro.get(i).getDate().isAfter(ini))
						&& registro.get(i).isPayed() == true) {
					System.out.println(registro.get(i));
				}
			}
		}
	}	
}
