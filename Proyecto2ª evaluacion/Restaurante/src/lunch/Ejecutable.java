package lunch;

import java.util.ArrayList;
import Order.RepositoryOrders;
import Product.Product;
import Product.Repository;

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
		
		
		snl.saveClient(rc.getClient());
		snl.saveProducts(rp.getAllProducts());
		snl.saveOrders(ro.getallorder());
		
		
		

	}

}
