package client;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;


import Order.Order;

public class Client extends Person {
	private static int  nClient=0;
	protected List<String> address=new ArrayList<String>();
	protected List<Order> orders= new ArrayList<Order>();
	protected int points;
	
	protected int id;
	
	public Client(String dni, String name, int age, List<String> address) {
		super(dni, name, age);
		this.address = address;
		this.orders= new ArrayList<Order>();
		id=++nClient;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<String> getAddress() {
		return address;
	}
	
	public void setAddress(List<String> address) {
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
	
	public boolean addAddress(String address) {
		boolean result=false;
		if (address!=null) {
			Iterator<String> iteratorAdress=this.address.iterator();
			boolean exist=false;
			while(iteratorAdress.hasNext()&&!exist) {
				String temporal=iteratorAdress.next();
				if(temporal.equals(address)) {
					exist=true;
				}
			}
			if(!exist) {
				this.address.add(address);
				result=true;
			}
		}
		return result;
	}
	public boolean removerAddress(String address) {
		boolean result=false;
		if (address!=null) {
			Iterator<String> iteratorAdress=this.address.iterator();
			boolean exist=false;
			while(iteratorAdress.hasNext()&&!result) {
				String temporal=iteratorAdress.next();
				if(temporal.equals(address)) {
					
					iteratorAdress.remove();
					result=true;
					
				}
					
				}
			
		}
		return result;
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
		return "\n\nCliente:\n"+
				"+---------------------------+"+"\n"+
			    "| name=" + name + "|"+"\n"+
			    "+---------------------------+"+"\n"+ 
				"| orders=" + orders.toString()+ "|" + "\n"+
				"+---------------------------+"+"\n"+
				"| Puntos="+ points+ "|"+"\n"+
				"+---------------------------+"+"\n"+
			    "| Direcciones=" + address.toString()+  "|" +"\n"+
			    "+---------------------------+"+"\n"+
				"| DNI=" + dni    + "|" +"\n"+
				"+---------------------------+"+"\n"+
				"| Edad=" + age + "|" +"\n"+
				"+---------------------------+";
	}
	
	public String toStringbasic() {
		return  "\n+-------------------------------------+"+"\n"+
				"| Name="  + name+"\n"+
				"+---------------------------------------+" + "\n"+
				"| Direccion=" + address.toString()+  "\n"+
				"+---------------------------------------+";
	}

}
