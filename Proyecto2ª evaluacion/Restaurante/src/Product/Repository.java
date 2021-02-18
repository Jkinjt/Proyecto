package Product;

import java.util.ArrayList;
import java.util.UUID;

public class Repository {

	//el repositorio no debe tener main, si quieres hacer pruebas hazlo en Junit
	public static void main(String[] args) {
		
		ArrayList<Product> products= new ArrayList<>();
		//no creo que en esta clase haga falta una UUID pero no es mala idea
		UUID uuid = UUID.randomUUID();
		
		
		//no hace falta meterlo directamente en esta clase
		
		
		drink cocacola=new drink (uuid,"Coca Cola",1.50,false);
		drink cerveza=new drink (uuid,"Cerveza",1.70,true);
		drink agua=new drink (uuid,"Agua",1.00,false);
		
		
		food kebab=new food(uuid,"Kebab",4.50,false);
		food patatas=new food(uuid,"Patatas",3.50,false);
		food hamburguesaVegana=new food(uuid,"Hamburguesa Vegana de la casa",5.00,true);
		
		
		
		products.add(cocacola);
		products.add(cerveza);
		products.add(agua);
		products.add(kebab);
		products.add(patatas);
		products.add(hamburguesaVegana);
		
	}
	//no imprimas en los metodos que te devuelva la lista
	public void getAllProducts(ArrayList products) {
		for(int i=0;i<products.size();i++) {
			System.out.println(products.get(i));
		}
		
	}
	
	//devuelve una lista y no hace falta que metas bebida por parametro
	public void getAllDrinks(ArrayList products, drink d) {
		for(int i=0;i<products.size();i++) {
			if(products.contains(d)) {
				System.out.println(products.get(i));	
			}
			
		}
		
	}
	
		
	public void AllFood() {
		
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
