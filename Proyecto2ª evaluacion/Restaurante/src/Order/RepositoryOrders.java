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
	private List<Order> registro = new ArrayList<>();
	public static RepositoryOrders unico;

	private RepositoryOrders() {
	}

	// crea un repositorio unico
	public static RepositoryOrders getSingletonInstance() {
		if (unico == null) {
			unico = new RepositoryOrders();
		}
		return unico;
	}

	// añadir orden al repositorio
	public void añadirorden(Order p) {
		registro.add(p);
		//al añadir la order al repositorio se actualiza el total que hay que pagar
		p.setTotal(calculototal(p));
	}

	// borrar una orden del repositorio
	public void eliminarorde(String dni) {
		boolean eliminado = false;
		for (int i = 0; i < registro.size() && eliminado == false; i++) {
			if (registro.get(i).getClient().getDni().equals(dni)) {
				registro.remove(i);
				eliminado = true;
			}
		}
	}

	// mostrar todos los pedidos
	public List<Order> getallorder() {
		return this.registro;
	}

	// mostrar todas las ordenes de un cliente
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

	// mostrar todas las ordenes de una fecha
	public List<Order> getOrdersByDate(String date) {
		List<Order> result = null;
		if (date != null && registro != null) {
			for (int i = 0; i < registro.size(); i++) {
				if (registro.get(i).getDate().equals(date)) {
					result.add(registro.get(i));
				}
			}
		}
		return result;
	}

	// modificar una orden existentente
	public void modificarorden(Order o) {
		boolean encontrado = false;
		for (int i = 0; i < registro.size() && encontrado == false; i++) {
			if (registro.get(i) == o) {
				Interfazrepositorio.menumodificaciones(registro.get(i));
				encontrado = true;
			}
		}
	}

	// modificar una orden existentente por codigo
	public void modificarorden(int o) {
		boolean encontrado = false;
		for (int i = 0; i < registro.size() && encontrado == false; i++) {
			if (registro.get(i).getCodigo() == o) {
				Interfazrepositorio.menumodificaciones(registro.get(i));
				encontrado = true;
			}
		}
	}

	// mostrar todas las ordenes no enviadas
	public List<Order> getOrdersNoDelivered() {
		List<Order> result = null;
		if (registro != null) {
			for (int i = 0; i < registro.size(); i++) {
				if (registro.get(i).isDelivered() == false) {
					result.add(registro.get(i));
				}
			}
		}
		return result;
	}

	// mostrar todos los pedidos no pagados
	public List<Order> getOrdersNoPayed() {
		List<Order> result = null;
		if (registro != null) {
			for (int i = 0; i < registro.size(); i++) {
				if (registro.get(i).isPayed() == false) {
					result.add(registro.get(i));
				}
			}
		}
		return result;

	}

	// mostrar todos los pedidos pagados
	public List<Order> AllInput() {
		List<Order> result = null;
		if (registro != null) {
			for (int i = 0; i < registro.size(); i++) {
				if (registro.get(i).isPayed() == true) {
					result.add(registro.get(i));
				}
			}
		}
		return result;
	}

	// mostrar todos los pedidos entre dos fechas
	public List<Order> getInputByDate(LocalDateTime ini, LocalDateTime end) {
		List<Order> result = null;
		if (registro != null) {
			for (int i = 0; i < registro.size(); i++) {
				if ((registro.get(i).getDate().isBefore(end) || registro.get(i).getDate().isAfter(ini))
						&& registro.get(i).isPayed() == true) {
					result.add(registro.get(i));
				}
			}
		}
		return result;
	}
	
	//actualiza el pago total de la orden
	
	public double calculototal(Order orden) {
		double total=0;
		boolean encontrado=false;
		if( registro!=null) {
			for (int i = 0; i < registro.size() && encontrado==false; i++) {
				if (registro.get(i)==orden) {
					for (int j = 0; j < registro.get(i).getProduct().size(); j++) {
						total+=registro.get(i).getProduct().get(i).getPrice();
					}					
					encontrado=true;
				}
			}
		}
		return total;
	}
}
