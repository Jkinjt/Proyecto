package Product;

import java.util.UUID;

public abstract class Product implements iProduct {
	protected UUID id;
	/*
	 * Al poner los metodos estáticos todos los productos conservan en memoria el último valor metido
	 *Un producto nuevo puede tener valores del último producto introducido si no se sobreescribe
	 */
	protected String name;
	protected double price;
	protected boolean forCeliac;
	
	
	public Product(String name, double price, boolean forCeliac) {
		this.id=UUID.randomUUID();
		this.name=name;
		this.price=price;
		this.forCeliac=forCeliac;
	
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
