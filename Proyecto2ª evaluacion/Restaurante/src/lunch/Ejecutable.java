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
		
		
		
		
		

	}

}
