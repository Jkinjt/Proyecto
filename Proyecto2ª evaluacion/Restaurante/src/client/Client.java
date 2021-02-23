package client;

import java.util.Arrays;
import java.util.UUID;

public class Client extends Person {
	protected String[] address;
	protected int[] orders;
	protected int points;
	protected static int  nClient=0;
	protected int id;
	
	public Client(String dni, String name, int age, String[] address) {
		super(dni, name, age);
		this.address = address;
		id=nClient;
		nClient++;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
	public boolean equals(Object obj) {
		boolean result=false;
		if(this==obj)
			result=true;
		else if(this.getClass()==obj.getClass()) {
			Client c=(Client)obj;
			if(c.getDni().equals(this.dni)) {
				result=true;
			}
		}
		
		return result;
	}
	@Override
	public String toString() {
		return "Client [name=" + name + ", orders=" + Arrays.toString(orders) + ", points="
				+ points + ", address=" + Arrays.toString(address)+ ", dni=" + dni    + ", age=" + age + "]";
	}
	
	

}
