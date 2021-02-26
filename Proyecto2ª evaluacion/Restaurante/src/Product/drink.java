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
	boolean Alcoholic;
	 
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
	public boolean matchOffer(ArrayList bp) {
		boolean valid=false;
		for(int i=0;i<bp.size();i++) {
			for(int j=0;j<bundlePack.size();j++) {
				if(bp.get(i).equals(bundlePack.get(j))) {
					valid=true;
						i=bp.size();
						j=bundlePack.size();
						yesOffer=true;
					}	
				}
			}
				return valid;
		}

	
	//M�todo para a�adir un objeto a la lista de arrays para ir variando las ofertas del getBundlePack
	public boolean anadirObejeto(Product p) {
		boolean valid=false;
		if(p!=null) {
			bundlePack.add(p);
			valid=true;
		}
		
		return valid;
	}
	
	//M�todo para eliminar un objeto a la lista de arrays para ir variando las ofertas del getBundlePack
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
