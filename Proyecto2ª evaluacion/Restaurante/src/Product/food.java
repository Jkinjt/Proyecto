package Product;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.UUID;

/**
 * 
 * @author JGL
 *
 */


//clase food que hereda de la clase Product
public class food extends Product implements Serializable{
	
	
	//atributos de la clase comida
	private boolean forVegans=true;
	
	//Constructor de food
	public food( String name,double price,boolean forVegans) {
		super(name, price,forVegans);
		this.forVegans=forVegans;
		this.id=UUID.randomUUID();
	}

	//M�todo que comprueba si es Vegano, si es asi, te devuelve que es para veganos
	public boolean isForVegans() {
		
		return forVegans;
	}

	//M�todo para a�adir un objeto a la lista de arrays para ir variando las ofertas del getBundlePack 
	public ArrayList<Product> getBundlePack() {
		
		
		return bundlePack;
		
	}
	
	
	
	
	public void setForVegans(boolean forVegans) {
		this.forVegans = forVegans;
	}

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

	//toString para imprimir la clase comida
	public String toString() {
		return super.toString()+"\n"+
				    "+---------------------------+"+"\n"+
					"| Is For Vegans=" + isForVegans() +"\n"+
					"+---------------------------+"+"\n";
	}
	
	
}
