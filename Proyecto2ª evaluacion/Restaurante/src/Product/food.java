package Product;

import java.util.UUID;

/**
 * 
 * @author JGL
 *
 */


//clase food que hereda de la clase Product
public class food extends Product {
	
	//atributos de la clase comida
	boolean forVegans=true;
	boolean bundlePacks;
	
	int [] food;
	
	//Constructor de food
	public food(UUID id, String name,double price,boolean forVegans) {
		super(name, price,forVegans);
		this.forVegans=forVegans;
		this.id=UUID.randomUUID();
	}

	//Método que comprueba si es Vegano, si es asi, te devuelve que es para veganos
	public boolean isForVegans() {
		
		return forVegans;
	}

	//Método para añadir un objeto a la lista de arrays para ir variando las ofertas del getBundlePack 
	public boolean getBundlePack() {
		
		
		return bundlePacks;
		
	}

	//toString para imprimir la clase comida
	public String toString() {
		return "Is For Vegans=" + isForVegans() +"/n"
			   + super.toString();
	}
	
}
