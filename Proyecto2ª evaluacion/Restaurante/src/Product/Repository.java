package Product;

import java.util.ArrayList;
import java.util.UUID;

public class Repository {

	//el repositorio no debe tener main, si quieres hacer pruebas hazlo en Junit
	public static void main(String[] args) {
		
		ArrayList<Product> products= new ArrayList<>();
		//no creo que en esta clase haga falta una UUID pero no es mala idea
		UUID id = UUID.randomUUID();
		
		
		//no hace falta meterlo directamente en esta clase
		
		
		drink cocacola=new drink (id,"Coca Cola",1.50,false);
		drink cerveza=new drink (id,"Cerveza",1.70,true);
		drink agua=new drink (id,"Agua",1.00,false);
		
		
		food kebab=new food(id,"Kebab",4.50,false);
		food patatas=new food(id,"Patatas",3.50,false);
		food hamburguesaVegana=new food(id,"Hamburguesa Vegana de la casa",5.00,true);
		
		
		
		products.add(cocacola);
		products.add(cerveza);
		products.add(agua);
		products.add(kebab);
		products.add(patatas);
		products.add(hamburguesaVegana);
		
	}
	
	public ArrayList getAllProducts(ArrayList products) {
		for(int i=0;i<products.size();i++) {
			
		}
		return products;

	}
	
	//devuelve una lista y no hace falta que metas bebida por parametro
	public boolean getAllDrinks(ArrayList products) {
		drink d = null;
		boolean valid=false;
		for(int i=0;i<products.size();i++) {
			if(products.contains(d)) {
					valid=true;
			}
		}
		return products.contains(d);
	}
	
		
	public boolean AllFood() {
		
		
		
		return false;
		
	}
	
	public void NoAlcoholicDrinks() {
		
	}
	
	public void AlcoholicDrinks() {
		
	}
	
	public void AllForVeganFood() {
		
	}
	
	public void getBundleProducts(Product p){
		
	}
	
	public void searchProduct(String name) {
		
	}
	
	public void searhDrinks(String name) {
		
	}
	
	public void searchFood(String name) {
		
	}
}
