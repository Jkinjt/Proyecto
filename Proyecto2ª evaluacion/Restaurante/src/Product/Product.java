package Product;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashSet;
import java.util.UUID;
import client.Person;

/**
 * 
 * @author JGL
 *
 */

// Clase producto que se implementa de la interface iProduct
public abstract class Product implements iProduct {

	// atributos de la clase producto
	protected UUID id;
	protected String name;
	protected double price;
	protected boolean forCeliac;
	protected boolean yesOffer = false;
	protected ArrayList<Product> bundlePack = new ArrayList<>();

	// constructor de la clase producto
	public Product(String name, double price, boolean forCeliac) {
		this.id = UUID.randomUUID();
		this.name = name;
		this.price = price;
		this.forCeliac = forCeliac;

	}

	public ArrayList<Product> getBundlePack() {

		return bundlePack;
	}

	
	// metodo para obtener el id del producto
	public UUID getId() {
		return id;
	}

	// metodo para obtener el nombre del producto
	public String getName() {
		return this.name;
	}

	// metodo para obtener el precio del producto
	public double getPrice() {

		return this.price;
	}

	public boolean getsIsForCeliac() {

		return this.forCeliac;
	}

	
	

	public boolean isYesOffer() {
		return yesOffer;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setForCeliac(boolean forCeliac) {
		this.forCeliac = forCeliac;
	}

	public void setYesOffer(boolean yesOffer) {
		this.yesOffer = yesOffer;
	}

	public void setBundlePack(ArrayList<Product> bundlePack) {
		this.bundlePack = bundlePack;
	}

	// toString para imprimir la clase producto.
	public String toString() {
		return "Product=" + getName() + "/n" + "Price= " + getPrice() + "/n" + "For celiac= " + forCeliac + "/n" + "id="
				+ id;

	}
	//tostring basic
	public String toStringbasic() {
		return  "+-------------------------+"+"\n"+
				"| Product=" +getName()+ "/n"+
				"| id="+id+"\n"+
				"+-------------------------+";
				
	}

	public boolean equals(Object obj) {
		boolean result = false;
		if (this == obj&&obj!=null)
			result = true;
		else if (this.getClass() == obj.getClass()) {
			Product p = (Product) obj;
			if (p.getName().equals(this.name)) {
				result = true;
			}
		}
		return result;

	}

	public Product matchOffer(ArrayList products) {
		Product result=null;
		if(!yesOffer&& products!=null) {
			for (int i = 0; i < products.size(); i++) {
				result=(Product)products.get(i);
				if(!result.isYesOffer()) {
					for (int j = 0; j < bundlePack.size(); j++) {
						if (products.get(i).equals(bundlePack.get(j))) {
							i = products.size();
							j = bundlePack.size();
							result.setYesOffer(true);
							yesOffer = true;
						}
					}
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
}
