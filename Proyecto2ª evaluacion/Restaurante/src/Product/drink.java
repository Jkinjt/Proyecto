package Product;
import Product.Repository;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.UUID;

/**
 * 
 * @author JGL
 *
 */

	//Clase drink heredada de product
public class drink extends Product implements Serializable	 {
	
	
	
	//atributos de la clase drink
	private boolean Alcoholic;
	 
	 //Constructor de drink
	public drink( String name, double price, boolean alcoholic) {
		super(name, price, alcoholic);
		this.Alcoholic=alcoholic;
		
	}
	
	//Metodo que verifica si la bebida es alcoholica
	public boolean getAlcoholic() {
		return Alcoholic;
	}
	

//Metodo para comprobar si un producto y otro hacer oferta
	//Metodo para comprobar si un producto y otro hacer oferta
		public Product matchOffer(ArrayList products) {
			Product result=null;
			for(int i=0;i<products.size();i++) {
				for(int j=0;j<bundlePack.size();j++) {
					if(products.get(i).equals(bundlePack.get(j))) {
						result=(Product) products.get(i);
						i=products.size();
						j=bundlePack.size();
						yesOffer=true;
					}	
				}
			}
			return result;
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
		return "Alcoholic=" + getAlcoholic()+"/n"+ 
				super.toString();
	}
}
