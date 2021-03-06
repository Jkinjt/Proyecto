package Order;



import static org.junit.Assert.assertSame;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

import Product.Product;
import Product.drink;
import Product.food;
import client.Client;

public class OrderTest {
	RepositoryOrders ro= RepositoryOrders.getSingletonInstance();
	
	List<String> a=new ArrayList<String>();
	List<String> b=new ArrayList<String>();
	
	Client c1=new Client("1A","Juan",15,a);
	Client c2=new Client("2B","Pedro",15,null);
	Client c3=new Client("3C","Antonio",20,b);
	
	food f1=new food("kebab", 5, false);
	food f2=new food("Hamburguesa", 3, false);
	food f3=new food( "Ensalada",3,true);
	drink d1=new drink( "Coca cola", 1, false);
	drink d2=new drink("Fanta", 1, false);
	drink d3=new drink( "JB", 8.50, true);
	List<Product> p=new ArrayList<Product>();
	
	@Before
	public void addProducts() {
		a.add("Calle falsa 123");
		a.add("Calle verdadera 321");
		b.add("Plaza alguien 8");
		p.add(f1);
		p.add(f2);
		p.add(f3);
		p.add(d1);
		p.add(d2);
		p.add(d3);
	
}

	@Test
	public void constructorOrderTest() {

		Order o1=new Order(c1, (ArrayList<Product>) p, a.get(0), false, false);
		Order o2=new Order(c2, (ArrayList<Product>) p, a.get(1), false, false);
		Order o3=new Order(c1, (ArrayList<Product>) p, b.get(0), false, false);


		System.out.println(o1.toStringbasic());
		//System.out.println(o2.toString());
		//System.out.println(o3.toString());

	}
}
