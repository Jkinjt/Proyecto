package client;

import java.util.Arrays;

public class Client extends Person {
	protected String[] address;
	protected int[] orders;
	protected int points;
	public Client(String dni, String name, int age, String[] address) {
		super(dni, name, age);
		this.address = address;
	}
	public String[] getAddress() {
		return address;
	}
	public void setAddress(String[] address) {
		this.address = address;
	}
	public int[] getOrders() {
		return orders;
	}
	public void setOrders(int[] orders) {
		this.orders = orders;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	
	@Override
	public String toString() {
		return "Client [address=" + Arrays.toString(address) + ", orders=" + Arrays.toString(orders) + ", points="
				+ points + "]";
	}
	
	

}
