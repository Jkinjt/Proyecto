package Product;

import java.util.UUID;

public abstract class Product implements iProduct {
	protected static UUID id;
	protected static String name;
	protected static double price;
	protected static boolean forCeliac;
	
	
	public Product(UUID id, String name, double price, boolean forCeliac) {
		this.id=id;
		this.name=name;
		this.price=price;
		this.forCeliac=forCeliac;
	
	}
	
	public Product(UUID id, String name, double price) {
		
	}
	
	public String getName() {
		return this.name;
	}
	
	public double getPrice() {
		
		
		return this.price;
	}
	
	public boolean getsIsForCeliac() {
	
			return this.forCeliac;
	}

	@Override
	public String toString() {
		return "Product=" +name+ "/n"
				+"Price= "+ getPrice()+"/n"+
				"For celiac= "+ forCeliac+"/n"+
				"id="+id;
				
	}

	
	
	
	
	
	
	

	
}
