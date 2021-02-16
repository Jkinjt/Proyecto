package Product;

import java.util.ArrayList;
import java.util.UUID;

public class Repository {

	public static void main(String[] args) {
		ArrayList<Product> products= new ArrayList<Product>();
		
		UUID uuid = UUID.randomUUID();
		
		drink cocacola=new drink (uuid,"Coca Cola",1.50,false);
		drink cerveza=new drink (uuid,"Cerveza",1.70,true);
		drink agua=new drink (uuid,"Agua",1.00,false);
		
		
		food kebab=new food(uuid,"Kebab",4.50,false);
		food patatas=new food(uuid,"Patatas",3.50,false);
		food hamburguesaVegana=new food(uuid,"Hmaburguesa Vegana de la casa",5.00,true);
		
		
		
		products.add(cocacola);
		products.add(cerveza);
		products.add(agua);
		products.add(kebab);
		products.add(patatas);
		products.add(hamburguesaVegana);
		
	}

}
