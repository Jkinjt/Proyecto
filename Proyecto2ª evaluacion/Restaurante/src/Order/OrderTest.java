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
		
							// clie prod total 
		Order order1=new Order(c1, null, null, null, true, false);
		Order order2=new Order(c1, null, null, null, false, true);
		Order order3=new Order(c2, null, null, null, true, false);
		Order order4=new Order(c2, null, null, null, false, true);
		
	
		repositorio.a�adirorden(order1);
		repositorio.a�adirorden(order2);
		repositorio.a�adirorden(order3);
		repositorio.a�adirorden(order4);
		repositorio.modificarorden(repositorio.getOrdersByClient("0001"));
		
		List<Order> n =repositorio.getallorder();
		System.out.println(n);
		
	}

}
