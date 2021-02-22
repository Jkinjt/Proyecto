package Product;
import Product.drink;
import java.util.ArrayList;
import java.util.UUID;

/**
 * @author JGL
 *
 */

//Clase repositorio donde se guardan los productos y todo lo relacionado con ello
public class Repository {
		// crea un repositorio unico
		private Repository() {
		}
		public static Repository unico;
		public static Repository getSingletonInstance() {
		
		if (unico == null) {
			unico = new Repository();
		}
		return unico;
		}
		
	
		//atributos de la clase producto
		ArrayList<Product> products= new ArrayList<Product>();
		UUID id = null;
		
		//Creación de los productos, tanto de comida como de bebida
		drink cocacola=new drink (id,"Coca Cola",1.50,false);
		drink cerveza=new drink (id,"Cerveza",1.70,true);
		drink agua=new drink (id,"Agua",1.00,false);
		
		
		food kebab=new food(id,"Kebab",4.50,false);
		food patatas=new food(id,"Patatas",3.50,false);
		food hamburguesaVegana=new food(id,"Hamburguesa Vegana de la casa",5.00,true);
		
		
		
		/*
		    products.add(cocacola);
		    products.add(cerveza)
			products.add(agua)
			products.add(kebab)
			products.add(patatas)
			products.add(hamburguesaVegana)
		 */
		
		
		
		
	//Método que nos va a permitir ingresar un nuevo producto a la lista de productos (ArrayList)
	public boolean addProduct (Product p) {
		
		boolean valid=false;
		
		for(int i=0;i<products.size();i++) {
			if(products.get(i)==null && !valid) {
				products.add(p);
				p=(Product) products.get(i);
				valid=true;
			}
		}
		
		return valid;
		
	}
	
	//Método que nos va a permitir eliminar un producto de la lista de productos (ArrayList)
	public boolean deleteProduct (Product p) {
		
		boolean valid=false;
		
		for(int i=0;i<products.size();i++) {
			if(products.get(i)!=null && products.get(i).equals(p) && products.contains(p)) {
				products.remove(i);				
				valid=true;
			}
		}
		
		return valid;
		
	}
	
	//Método que nos permite obtener todos los productos que se encuentren en la lista
	 public ArrayList getAllProducts() {
	
		return  products;

	}
	
	//Método que nos va a permitir obtener todas las bebidas que se encuentren en la lista
	public boolean getAllDrinks() {
		drink d = null;
		boolean valid=false;
		for(int i=0;i<products.size();i++) {
			if(products.contains(d)) {
					valid=true;
			}
		}
		return products.contains(d);
	}
	
	//Método que nos va a permitir obtener todas las comidas que se encuentren en la lista
	public boolean AllFood() {
		food f = null;
		boolean valid=false;
		for(int i=0;i<products.size();i++) {
			if(products.contains(f)) {
					valid=true;
			}
		}
		
		return products.contains(f);
		
	}
	
	//Método que nos va a permitir obtener todas las bebidas no alcohólicas que se encuentren en la lista
	public boolean NoAlcoholicDrinks() {
		drink d=null;
		
		boolean valid=false;
		
		for(int i=0;i<products.size();i++) {
			if(products.equals(!d.isAlcoholic())) {
					valid=true;
			}
		}
		
		return products.equals(!d.isAlcoholic());
	}
	
	//Método que nos va a permitir obtener todas las bebidas alcohólicas que se encuentren en la lista
	public boolean AlcoholicDrinks() {
			drink d=null;
			
			boolean valid=false;
			for(int i=0;i<products.size();i++) {
				if(products.equals(d.isAlcoholic())) {
						valid=true;
				}
			}
			
			return products.equals(d.isAlcoholic());
	}
	
	//Método que nos va a permitir obtener todas las comidas veganas que se encuentren en la lista
	public boolean AllForVeganFood() {
		food f=null;
		
		boolean valid=false;
		for(int i=0;i<products.size();i++) {
			if(products.equals(f.isForVegans())) {
					valid=true;
			}
		}
		
		return products.equals(f.isForVegans());
	}
	
	//Método que nos va a permitir obtener todas las productos que hagan ofertas entre ellos que se encuentren en la lista
	public boolean getBundleProducts(Product p){
		boolean valid=false;
			
			for(int i=0;i<products.size();i++) {
			if(products.contains(p.getBundlePack()!=false) && p!=null) {
					valid=true;
			}
		}
		
		return products.contains(p.getBundlePack());
	}
	
	//Método que nos va a permitir buscar en la lista un determinado producto por su nombre
	public Product searchProduct(String name) {
		boolean valid=false;
		Product p=null;
		
		for(int i=0;i<products.size();i++) {
			if(name.equals(p.getName()) && products.contains(p)){
				valid=true;
			}
		}
		
		return p;
	}
	
	//Método que nos va a permitir buscar en la lista una determinada bebida por su nombre
	public Product searhDrinks(String name) {
		boolean valid=false;
		drink d1=null;
		
		for(int i=0;i<products.size();i++) {
			if(name.equals(d1.getName()) && products.contains(d1)){
				valid=true;
			}
		}
		
		return d1;
	}
	
	//Método que nos va a permitir buscar en la lista una determinada comida por su nombre
	public Product searchFood(String name) {
		boolean valid=false;
		food f1=null;
		
		
		for(int i=0;i<products.size();i++) {
			if(name.equals(f1.getName()) && products.contains(f1)){
				valid=true;
			}
		}
		
		return f1;
	}

	//toString para imprimir los productos y el tamaño de la lista, es decir, cuantos productos hay en la lista.
	public String toString() {
		return "Repository [products=" + products.size() 
		+ ", cocacola="+ cocacola 
		+ ", cerveza=" + cerveza
		+ ", agua=" + agua 
		+ ", kebab=" + kebab 
		+ ", patatas=" + patatas 
		+ ", hamburguesaVegana="+ hamburguesaVegana + "]";
	}
	
	
}
