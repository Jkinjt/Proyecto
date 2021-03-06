package menuMenus;

import static org.junit.Assert.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import Order.Order;
import Order.RepositoryOrders;
import Product.Product;
import Product.drink;
import Product.food;
import client.Client;

public class TestMenuOrdenes {
	RepositoryOrders ro = RepositoryOrders.getSingletonInstance();
	menuOrdenes mo= new menuOrdenes();
	String[] a = { "Calle falsa 1234", "Plaza Ocurrencia  87" };
	String[] b = { "Plaza Ocurrencia  87" };
	Client c1 = new Client("1A", "Juan", 15, a);
	Client c2 = new Client("2B", "Pedro", 15, null);
	Client c3 = new Client("3C", "Antonio", 20, b);

	food f1 = new food("kebab", 5, false);
	food f2 = new food("Hamburguesa", 3, false);
	food f3 = new food("Ensalada", 3, true);
	drink d1 = new drink("Coca cola", 1, false);
	drink d2 = new drink("Fanta", 1, false);
	drink d3 = new drink("JB", 8.50, true);
	List<Product> p = new ArrayList<Product>();
	Order o1 = new Order(c1, (ArrayList<Product>) p, LocalDateTime.now(), a[0], false, true);
	Order o2 = new Order(c2, (ArrayList<Product>) p, LocalDateTime.now(), a[1], true, false);
	Order o3 = new Order(c3, (ArrayList<Product>) p, LocalDateTime.now(), b[0], false, false);

	@Test
	public void testmenu() {
		p.add(f1);
		p.add(f2);
		p.add(f3);
		p.add(d1);
		p.add(d2);
		p.add(d3);
		ro.addorden(o1);
		ro.addorden(o2);
		mo.menuprincipal();
	}

}
