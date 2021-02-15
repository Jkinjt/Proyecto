package Product;

import java.util.ArrayList;
import java.util.UUID;

public class Repository {

	public static void main(String[] args) {
		ArrayList<Product> products= new ArrayList<Product>();
		
		String uuid = java.util.UUID.randomUUID().toString();
		
		drink cocacola=new drink (001,"Coca Cola",1.50,false);
		drink cerveza=new drink (002,"Cerveza",1.70,true);
		drink agua=new drink (003,"Agua",1.00,false);
		
		
		food kebab=new food(100,"Kebab",4.50,false);
		food patatas=new food(100,"Patatas",3.50,false);
		food hamburguesaVegana=new food(100,"Hmaburguesa Vegana de la casa",5.00,true);
		
		
		
		products.add(cocacola);
		products.add(cerveza);
		products.add(agua);
		products.add(kebab);
		products.add(patatas);
		products.add(hamburguesaVegana);
		
	}

}
