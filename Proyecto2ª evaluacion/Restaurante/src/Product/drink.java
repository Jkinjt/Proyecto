package Product;
import Product.Repository;

import java.util.ArrayList;
import java.util.UUID;

/**
 * 
 * @author JGL
 *
 */

	//Clase drink heredada de product
public class drink extends Product {
	
	//atributos de la clase drink
	boolean Alcoholic=true;
	boolean bundlePacks=true;
	ArrayList<Product> bundlePack= new ArrayList<>();
	
	

	 
	 //Constructor de drink
	public drink(UUID id, String name, double price, boolean alcoholic) {
		super(name, price, alcoholic);
		this.Alcoholic=alcoholic;
		this.id=UUID.randomUUID();
	}
	
	//Metodo que verifica si la bebida es alcoholica
	public boolean isAlcoholic() {
		return Alcoholic;
	}
	
	
	//Método que enlazan productos para generar pack que hacen ofertas.
	public boolean getBundlePack() {
		
		return bundlePacks;
	}

	//Método para añadir un objeto a la lista de arrays para ir variando las ofertas del getBundlePack
	public boolean anadirObejeto(Product p) {
		boolean valid=false;
		if(p!=null) {
			bundlePack.add(p);
			valid=true;
		}
		
		return valid;
	}

	//toString para imprimir la clase bebida
	public String toString() {
		return "Alcoholic=" + isAlcoholic()+"/n"+ 
				super.toString();
	}
}
