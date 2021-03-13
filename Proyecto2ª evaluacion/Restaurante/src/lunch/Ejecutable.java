package lunch;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import Order.Order;
import Order.RepositoryOrders;
import Product.Product;
import Product.Repository;
import Product.drink;
import Product.food;
import client.Client;
import client.RepositoryClients;
import menuMenus.MenuInicio;
import repositoryUtils.RepositorySaveAndLoad;

public class Ejecutable {
	

	public static void main(String[] args) throws ClassNotFoundException {
		RepositorySaveAndLoad snl;
		snl=RepositorySaveAndLoad.getSingletoonInstance();
		RepositoryClients rc =RepositoryClients.getSingletonInstance();
		RepositoryOrders ro=RepositoryOrders.getSingletonInstance();
		Repository rp=Repository.getSingletonInstance();
		ro.setRegistro(snl.loadOrders());
		rc.setClient(snl.loadClient());
		rp.setProducts((ArrayList<Product>) snl.loadProduct());
		MenuInicio.MenuInicio();
		/*
		List<Product> p=new ArrayList<Product>();
		List<Order> o=new ArrayList<>();
		
		List<String> a=new ArrayList<String>();
		List<String> b=new ArrayList<String>();
		a.add("Calle falsa 123");
		a.add("Calle verdadera 321");
		b.add("Plaza alguien 8");
		//Clientes
		Client c1 = new Client("1A", "Juan", 15, a);
		Client c2 = new Client("2B", "Pedro", 15, b);
		Client c3 = new Client("3C", "Antonio", 20, b);
		//Productos
		food f1=new food("kebab", 5, false);
		food f2=new food("Hamburguesa", 3, false);
		food f3=new food( "Ensalada",3,true);
		drink d1=new drink( "Coca cola", 1, false);
		drink d2=new drink("Fanta", 1, false);
		drink d3=new drink( "JB", 8.50, true);
		p.add(f1);
		p.add(f2);
		p.add(f3);
		p.add(d1);
		p.add(d2);
		p.add(d3);
		//Ordenes
		Order o1=new Order(c1, (ArrayList<Product>) p,LocalDateTime.now() ,c1.getAddress().get(0), false, false);
		Order o2=new Order(c2, (ArrayList<Product>) p,LocalDateTime.now() , c2.getAddress().get(0), false, false);
		Order o3=new Order(c1, (ArrayList<Product>) p,LocalDateTime.now() , c1.getAddress().get(1), false, false);
		o.add(o1);
		o.add(o2);
		c1.setOrders((ArrayList<Order>) o);
		c2.setOrders((ArrayList<Order>) o);
		rc.addClient(c1);
		rc.addClient(c2);
		ro.addorden(o1);
		ro.addorden(o2);
		rp.addProduct(d3);
		rp.addProduct(f3);
		snl.saveClient(rc.getClient());
		snl.saveOrders(ro.getallorder());
		snl.saveProducts(rp.getAllProducts());
		*/
		//System.out.println(rc.toString());
		
		System.out.println(rc.toString());
		System.out.println(ro.toString());
		System.out.println(rp.toString());
		
		
		
		

	}

}
