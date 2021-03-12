package Order;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import Product.Product;
import client.Client;
import menuMenus.menuOrdenes;
import repositoryUtils.herramientas;

public class RepositoryOrders implements Serializable {
	private final static DateTimeFormatter formater=DateTimeFormatter.ofPattern("dd mm uuuu");
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
	
	

	public void setRegistro(List<Order> registro) {
		this.registro = registro;
	}

	// añadir orden al repositorio
	public boolean addorden(Order p) {
		boolean result=false;
		if(p!=null&&!registro.contains(p)) {
			registro.add(p);
			result=true;
			
		}
		return result;
	}

	// borrar una orden del repositorio por codigo
	public boolean eliminarorde(Order codigo) {
		boolean eliminado = false;
		for (int i = 0; i < registro.size() && eliminado == false; i++) {
			if (registro.get(i).getCodigo()==codigo.getCodigo()) {
				registro.remove(i);
				eliminado = true;
			}
		}
		return eliminado;
	}

	// mostrar todos los pedidos
	public List<Order> getallorder() {
		return this.registro;
	}

	// mostrar todas las ordenes de un cliente
	public List<Order> getOrdersByClient(String dni) {
		List<Order> result =new ArrayList<Order>();
		if (dni != null && registro != null) {
			for (int i = 0; i < registro.size() ; i++) {
				if (registro.get(i).getClient().getDni().equals(dni)) {
					result.add( registro.get(i));
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
				String temporal=registro.get(i).getDate().format(formater);
				if (temporal.equals(date)) {
					result.add(registro.get(i));
					
				}
			}
		}
		return result;
	}



	// mostrar todas las ordenes no enviadas
	public List<Order> getOrdersNoDelivered() {
		List<Order> result =new ArrayList<Order>();
		if (registro != null) {
			for (int i = 0; i < registro.size(); i++) {
				if (registro.get(i).isDelivered() == false) {
					result.add(registro.get(i));
				}
			}
		}
		return result;
	}
	//mostrar todas las ordenes enviadas
	public List<Order> getOrdersDelivered() {
		List<Order> result = new ArrayList<Order>();;
		if (registro != null) {
			for (int i = 0; i < registro.size(); i++) {
				if (registro.get(i).isDelivered() == true) {
					result.add(registro.get(i));
				}
			}
		}
		return result;
	}

	// mostrar todos los pedidos no pagados
	public List<Order> getOrdersNoPayed() {
		List<Order> result = new ArrayList<Order>();
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
		List<Order> result = new ArrayList<Order>();
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
	public List<Order> getInputByDate(String ini, String end) {
		List<Order> result =new ArrayList<Order>();
		if (ini!=null&&end!=null && registro != null) {
			for (int i = 0; i < registro.size(); i++) {
				String temporal=registro.get(i).getDate().format(formater);
				if ((-1<temporal.compareTo(ini) &&1>temporal.compareTo(end))
						&& registro.get(i).isPayed() == true) {
					result.add(registro.get(i));
					
				}
			}
		}
		return result;
	}
	
	public List<Order> getNotPayedByDate(String ini, String end) {
		List<Order> result =new ArrayList<Order>();
		if (ini!=null&&end!=null && registro != null) {
			for (int i = 0; i < registro.size(); i++) {
				String temporal=registro.get(i).getDate().format(formater);
				if ((-1<temporal.compareTo(ini) &&1>temporal.compareTo(end))
						&& registro.get(i).isPayed() != true) {
					result.add(registro.get(i));
					
				}
			}
		}
		return result;
	}
	
	//actualiza el pago total de la orden
	//¿esto no seria mejor hacerlo en el  carrito para que  ya pase el precio total?
	
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
	public Double totalhoy(int dia) {
		double total=0;
		for (int i = 0; i < registro.size(); i++) {
			if(registro.get(i).getDate().getDayOfMonth()==dia) {
				total+=registro.get(i).getTotal();
			}
		}
		return total;
	}
	public Double totalmes(int mes) {
		double total=0;
		for (int i = 0; i < registro.size(); i++) {
			if (registro.get(i).getDate().getMonthValue()==mes) {
				total+=registro.get(i).getTotal();
			}
		}
		return total;
	}
	public Order buscarordencodigo(int codigo) {
		Order order=null;
		boolean encontrado=false;
		for (int i = 0; i < registro.size()&& encontrado==false ; i++) {
			if (registro.get(i).getCodigo()==codigo) {
				order=registro.get(i);
				encontrado=true;
			}
		}
		return order;
	}
}
