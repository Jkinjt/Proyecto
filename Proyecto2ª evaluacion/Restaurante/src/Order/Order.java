package Order;

import java.time.LocalDateTime;
import java.util.Arrays;

import Product.Product;
import client.Client;

public class Order {
	private Client client;
	private Product Product[];
	private double total;
	private LocalDateTime date;
	private String address;
	private boolean delivered;
	private boolean payed;

	public Order(Client client, Product[] product, double total, String address, boolean delivered,
			boolean payed) {
		super();
		this.client = client;
		Product = product;
		this.total = total;
		this.date = LocalDateTime.now();
		this.address = address;
		this.delivered = delivered;
		this.payed = payed;
	}

	public Order() {
		this.client = null;
		Product = null;
		this.total = 0;
		this.date = LocalDateTime.now();
		this.address = null;
		this.delivered = false;
		this.payed = false;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Product[] getProduct() {
		return Product;
	}



	public void setProduct(Product[] product) {
		Product = product;
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

	@Override
	public String toString() {
		return "| Cliente=" + client + " | Productos=" + Arrays.toString(Product) + " | Total=" + total + " | Fecha="
				+ date + " | Direccion=" + address + " | Enviado=" + delivered + " | Pagado=" + payed + "] ";
	}

}
