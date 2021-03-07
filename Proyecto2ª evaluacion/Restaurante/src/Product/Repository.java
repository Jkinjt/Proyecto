package Product;

import Product.drink;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;

/**
 * 
 * @author JGL
 *
 */

//Clase repositorio donde se guardan los productos y todo lo relacionado con ello
public class Repository implements Serializable {
	// atributos de la clase producto
	private ArrayList<Product> products = new ArrayList<Product>();
	public static Repository unico;

	// crea un repositorio unico
	private Repository() {
	}

	public static Repository getSingletonInstance() {

		if (unico == null) {
			unico = new Repository();
		}
		return unico;
	}

	// Método que nos va a permitir ingresar un nuevo producto a la lista de
	// productos (ArrayList)
	public boolean addProduct(Product p) {
		boolean valid = false;
		if (p != null) {
			//en el if usa la función que has creado de buscar producto
			//para commprobar si hay alguien asi reutilizas código
			if (products.size() < 1 || searchProduct(p.getName()) == null) {
				products.add(p);
				valid = true;
			}
		}

		return valid;

	}
	
	public void setProducts(ArrayList<Product> products) {
		this.products = products;
	}

	// Método que nos va a permitir eliminar un producto de la lista de productos
	// (ArrayList)
	public boolean deleteProduct(Product p) {

		boolean valid = false;

		for (int i = 0; i < products.size(); i++) {
			if (products.get(i) != null && products.get(i).equals(p) && products.contains(p)) {
				products.remove(i);
				valid = true;
			}
		}

		return valid;

	}

	// Método que nos permite obtener todos los productos que se encuentren en la
	// lista
	public ArrayList getAllProducts() {

		return products;

	}
	//¿esto que hace?
	public UUID todosId() {
		ArrayList<Product> products=new ArrayList<Product>();	
		Product p=null;
		return p.getId();
	}
	//¿Y esto?
	public double todosPrecio() {
		ArrayList<Product> products=new ArrayList<Product>();	
		Product p=null;
		return p.getPrice();
	}
 

	

	// Método que nos va a permitir obtener todas las bebidas que se encuentren en
	// la lista
	public ArrayList<drink> getAllDrinks() {
		ArrayList<drink> result=new ArrayList<drink>();
		for (int i = 0; i < products.size(); i++) {
			if(products.get(i) instanceof drink) {
				result.add((drink)products.get(i));
			}
			
		}
		return result;	
	}

	// Método que nos va a permitir obtener todas las comidas que se encuentren en
	// la lista
	public ArrayList<food> getAllFood() {
		ArrayList<food> result=new ArrayList<food>();
		for (int i = 0; i < products.size(); i++) {
			if(products.get(i) instanceof food) {
				result.add((food)products.get(i));
			}
			
		}
		
		return result;
	}

	// Método que nos va a permitir obtener todas las bebidas no alcohólicas que se
	// encuentren en la lista
	public ArrayList<drink> getNoAlcoholicDrinks() {
		ArrayList<drink> result=new ArrayList<drink>();
		for (int i = 0; i < products.size(); i++) {
			if(products.get(i)instanceof drink) {
				drink d=(drink) products.get(i);
				if(!d.getAlcoholic())
				result.add(d);
			}
			
		}
		return result;
	}

	// Método que nos va a permitir obtener todas las bebidas alcohólicas que se
	// encuentren en la lista
	public ArrayList<drink> getAlcoholicDrinks() {
		
		ArrayList<drink> result=new ArrayList<drink>();
		for (int i = 0; i < products.size(); i++) {
			if(products.get(i)instanceof drink) {
				drink d=(drink) products.get(i);
				if(d.getAlcoholic())
				result.add(d);
			}
			
		}
		return result;
	}

	// Método que nos va a permitir obtener todas las comidas veganas que se
	// encuentren en la lista
	public ArrayList<food> AllForVeganFood() {
		ArrayList<food> result=new ArrayList<food>();
		for (int i = 0; i < products.size(); i++) {
			if(products.get(i) instanceof food) {
				food f=(food)products.get(i);
				if(f.isForVegans())
				result.add(f);
			}
			
		}
		
		return result;
	}

	// Método que nos va a permitir obtener todas las productos que hagan ofertas
	// entre ellos que se encuentren en la lista
	public ArrayList<Product> getBundleProducts(Product p) {
		ArrayList<Product> result=new ArrayList<Product>();
		if(p!=null&&p.getName()!=null) {
			Product pr = searchProduct(p.getName());
			result=p.getBundlePack();			
		}
		return result;
	}

	// Método que nos va a permitir buscar en la lista un determinado producto por
	// su nombre
	public Product searchProduct(String name) {
		Product p = null;
		if (name != null) {
			for (int i = 0; i < products.size(); i++) {
				if (products.get(i).getName().equalsIgnoreCase(name)) {
					p = products.get(i);
					i = products.size();
				}
			}
		}

		return p;
	}

	// Método que nos va a permitir buscar en la lista una determinada bebida por su
	// nombre
	public drink searchDrinks(String name) {
		drink d1 = null;
		if(name!=null) {
			
			for (int i = 0; i < products.size(); i++) {
				if (products.get(i) instanceof drink && products.get(i).getName().equalsIgnoreCase(name)) {
				d1=(drink) products.get(i);
				i=products.size();
				}
			}
			
		}
		
		

		return d1;
	}

	// Método que nos va a permitir buscar en la lista una determinada comida por su
	// nombre
	public food searchFood(String name) {
		food f = null;
		if(name!=null) {
			for (int i = 0; i < products.size(); i++) {
				if (products.get(i)instanceof food && products.get(i).getName().equalsIgnoreCase(name)) {
				f=(food) products.get(i);
				i=products.size();
				}
			}
		}
		return f;
	}
	

	@Override
	public String toString() {
		return "Repository [products=" + products + "]";
	}

}
