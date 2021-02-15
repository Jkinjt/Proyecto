package Product;

import java.util.UUID;

public abstract class Product implements iProduct {
	protected static UUID id;
	protected static String name;
	protected static double price;
	protected static String forCeliac;
	
	
	public Product(UUID id, String name, double price, String forCeliac) {
		this.id=id;
		this.name=name;
		this.price=price;
		this.forCeliac=forCeliac;
	
	}
	
	public Product(UUID id, String name, double price) {
		
	}
	
	public void getName() {
		
	}
	
	public int getPrice() {
		
		
		return 0;
	}
	
	public void getsIsForCeliac() {
	
	}

	@Override
	public String toString() {
		return "Product=" +name+ "/n"
				+"Price= "+ getPrice()+"/n"+
				"For celiac= "+ forCeliac+"/n"+
				"id="+id;
				
	}

	
	
	
	
	
	
	

	
}
