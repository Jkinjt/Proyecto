package Order;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import client.Client;
import Product.Product;

public class Order implements Serializable{
	private Client client;
	private ArrayList<Product> product;
	private double total;
	private LocalDateTime date;
	private String address;
	private boolean delivered;
	private boolean payed;
	private int codigo;
	private static int contadorc=1;

	

	public Order(Client client, ArrayList<Product> product,  LocalDateTime date, String address,
			boolean delivered, boolean payed) {
		super();
		this.client = client;
		this.product = product;
		this.total = 0;
		this.date = LocalDateTime.now();
		this.address = address;
		this.delivered = delivered;
		this.payed = payed;
		this.codigo = contadorc;
		contadorc++;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	

	public ArrayList<Product> getProduct() {
		return product;
	}

	public void setProduct(ArrayList<Product> product) {
		this.product = product;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public boolean isDelivered() {
		return delivered;
	}

	public void setDelivered(boolean delivered) {
		this.delivered = delivered;
	}

	public boolean isPayed() {
		return payed;
	}

	public void setPayed(boolean payed) {
		this.payed = payed;
	}
	


	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	
	

	@Override
	public boolean equals(Object obj) {
		boolean result=false;
		if(this==obj)
			result=true;
		else if(this.getClass()==obj.getClass()) {
			Order o=(Order) obj;
			if(o.getCodigo()==this.codigo) {
				result=true;
			}
		}
		
		return result;
	}

	@Override
	public String toString() {

		return "Orden \n"+
		" Cliente:\n" + client.toStringbasic() +
	"\nProductos:\n" + lista(product) +
	"\ntotal=" + total +
	"\nFecha=" + date +
	"\nDireccion="+ address + 
	"\nEstado envio=" + delivered +
	"\nEstado pago=" + payed + 
	"\nCodigo=" + codigo ;

		
	}
	
	//to string limitado
	public String toStringbasic() {


		return  "Orden \n"+
				"Cliente:\n" + client.toStringbasic() +"\n"+  
				"Productos:" + product +"\n"+
				"Direcciones:" + address +"\n"+
				"Codigo=" + codigo +"\n";
	}
	public static String lista(List<Product> productos) {
		String listado="";
		for (Product product : productos) {
			listado+=product.toStringbasic()+"\n";
		}
		
		return listado;
	}

}
