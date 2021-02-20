package Product;

import java.util.UUID;

/**
 * 
 * @author JGL
 *
 */

 //Clase producto que se implementa de la interface iProduct
public abstract class Product implements iProduct {
	
	//atributos de la clase producto
	protected UUID id;
	protected String name;
	protected double price;
	protected boolean forCeliac;
	
	//constructor de la clase producto
	public Product(String name, double price, boolean forCeliac) {
		this.id=UUID.randomUUID();
		this.name=name;
		this.price=price;
		this.forCeliac=forCeliac;
	
	}
	
	//metodo para obtener el id del producto
	public UUID getId() {
		return id;
	}
	
	//metodo para obtener el nombre del producto
	public String getName() {
		return this.name;
	}
	
	//metodo para obtener el precio del producto
	public double getPrice() {
		
		return this.price;
	}
	
	//metodo para obtener el producto que sea para celiacos
	public boolean getsIsForCeliac() {
	
		return this.forCeliac;
	}

	
	
	//toString para imprimir la clase producto.
	public String toString() {
		return "Product=" +getName()+ "/n"
				+"Price= "+ getPrice()+"/n"+
				"For celiac= "+ forCeliac+"/n"+
				"id="+id;
				
	}

	
	
	
	
	
	
	

	
}
