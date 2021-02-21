package Order;



import static org.junit.Assert.assertSame;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import client.Client;

class OrderTest {
	
	
	@Test
	void testallinput() {
		RepositoryOrders repositorio= RepositoryOrders.getSingletonInstance();
		//interfazrepositorio n=new inter 
		Client c1=new Client("00001", "manolo", 18, null);
		Client c2=new Client("00002", "ana", 20, null);
		
		
		Order order1=new Order(c1, null, 123.3, null, false, true);
		Order order2=new Order(c1, null, 23.3, null, true, false);
		Order order3=new Order(c2, null, 43.3, null, false, true);
		Order order4=new Order(c2, null, 13.3, null, true, false);
		
	
		repositorio.a�adirorden(order1);
		repositorio.a�adirorden(order2);
		repositorio.a�adirorden(order3);
		repositorio.a�adirorden(order4);
		
		repositorio.modificarorden(repositorio.getOrdersByClient("0001"));
		
		List<Order> n =repositorio.getallorder();
		System.out.println(n);
		
	}

}
