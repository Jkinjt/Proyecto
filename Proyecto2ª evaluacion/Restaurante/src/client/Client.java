package client;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;


import Order.Order;

public class Client extends Person {
	private static int  nClient=0;
	protected String[] address;
	protected List<Order> orders;
	protected int points;
	
	protected int id;
	
	public Client(String dni, String name, int age, String[] address) {
		super(dni, name, age);
		this.address = address;
		id=++nClient;
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
	
	public List<Order> getOrders() {
		return orders;
	}
	
	public void setOrders(ArrayList<Order> orders) {
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
		return "Client [name=" + name + ", orders=" + orders.toString() + ", points="
				+ points + ", address=" + Arrays.toString(address)+ ", dni=" + dni    + ", age=" + age + "]";
	}
	
	public String toStringbasic() {
		return  "+---------------------------------------------------+"+"\n"+
				"| Name="  + name+"\n"+
				"| Direccion=" + Arrays.toString(address)+  "\n"+
				"+---------------------------------------------------+";
	}

}
