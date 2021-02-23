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
	
	ArrayList<Product> bundlePack= new ArrayList<>();
	
	//atributos de la clase drink
	boolean Alcoholic=true;
	boolean yesOffer=false;
	 
	 //Constructor de drink
	public drink( String name, double price, boolean alcoholic) {
		super(name, price, alcoholic);
		this.Alcoholic=alcoholic;
		
	}
	
	//Metodo que verifica si la bebida es alcoholica
	public boolean isAlcoholic() {
		return Alcoholic;
	}
	
	
	//Método que enlazan productos para generar pack que hacen ofertas.
	public boolean getBundlePack() {
		
		return yesOffer;
	}
	
	//Metodo para comprobar si un producto y otro hacer oferta
			public boolean matchOffer(ArrayList products) {
				double descuento;
				boolean valid=false;
				for(int i=0;i<products.size();i++) {
					for(int j=0;j<bundlePack.size();j++) {
						if(products.get(i).equals(bundlePack.get(j))) {
							valid=true;
							i=products.size();
							j=bundlePack.size();
							yesOffer=true;
						}	
					}
				}
				return valid;
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
	
	//Método para eliminar un objeto a la lista de arrays para ir variando las ofertas del getBundlePack
	public boolean eliminarObejeto(Product p) {
		boolean valid=false;
		if(p!=null) {
			bundlePack.remove(p);
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
