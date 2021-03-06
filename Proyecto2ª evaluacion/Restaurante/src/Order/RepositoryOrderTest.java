package Order;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Product.Product;
import Product.drink;
import Product.food;
import client.Client;
import menuMenus.menuOrdenes;

public class RepositoryOrderTest {
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
	Order o1=new Order(c1, (ArrayList<Product>) p,  a.get(0), false, true);
	Order o2=new Order(c2, (ArrayList<Product>) p, a.get(1), true, false);
	Order o3=new Order(c3, (ArrayList<Product>) p, b.get(0), false, false);
	
	
	
	
	@Test
	public void testGetSingletonInstance() {
		assertEquals(ro, RepositoryOrders.getSingletonInstance());
	}
	
	@Before
	public void addOrders() {
		ro.addorden(o1);
		ro.addorden(o2);
	}
	
	@Before
	public void addProducts() {
		p.add(f1);
		p.add(f2);
		p.add(f3);
		p.add(d1);
		p.add(d2);
		p.add(d3);
	
}
	@After
	public void deleteOrders() {
		ro.eliminarorde(o1);
		ro.eliminarorde(o2);
		ro.eliminarorde(o3);
	}
	@Test
	public void testaddorden() {
		
		assertFalse(ro.addorden(null));
		assertFalse(ro.addorden(o1));
		assertFalse(ro.addorden(o2));
		assertTrue(ro.addorden(o3));
		
		
	}

	@Test
	public void testEliminarorde() {
	assertTrue(ro.eliminarorde(o1));
	assertTrue(ro.eliminarorde(o2));
	assertFalse(ro.eliminarorde(o3));
	
	}

	@Test
	public void testGetallorder() {
		List<Order> lo=new ArrayList<Order>();
		lo.add(o1);
		lo.add(o2);
		assertEquals(lo, ro.getallorder());
	}

	@Test
	public void testGetOrdersByClient() {
		List<Order> lo=new ArrayList<Order>();
		lo.add(o2);
		assertEquals(lo, ro.getOrdersByClient(c2.getDni()));
	}

	//�que debe recibir la orden para que coincida?
	@Test
	public void testGetOrdersByDate() {
		//mirar como hacer los  patrones
		LocalDateTime hoy=LocalDateTime.now();
		DateTimeFormatter formater=DateTimeFormatter.ofPattern("dd mm uuuu");
		String ho1=hoy.format(formater);
		
		System.out.println(hoy.toString());
		System.out.println(ho1);
		
	}

	@Test
	public void testModificarordenString() {
		o1.setClient(c2);
		//ro.modificarorden(c1.getDni());
	}

	@Test
	public void testModificarordenInt() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetOrdersNoDelivered() {
		List<Order> lo=new ArrayList<Order>();
		lo.add(o1);
		assertEquals(lo, ro.getOrdersNoDelivered());
	}

	@Test
	public void testGetOrdersDelivered() {
		List<Order> lo=new ArrayList<Order>();
		lo.add(o2);
		assertEquals(lo, ro.getOrdersDelivered());
	}

	@Test
	public void testGetOrdersNoPayed() {
		//mismo problema  que el dni
		List<Order> lo=new ArrayList<Order>();
		lo.add(o2);
		assertEquals(lo, ro.getOrdersNoPayed());
	}

	@Test
	public void testAllInput() {
		List<Order> lo=new ArrayList<Order>();
		lo.add(o1);
		assertEquals(lo, ro.AllInput());
	}

	@Test
	public void testGetInputByDate() {
		List<Order> lo=new ArrayList<Order>();
		lo.add(o1);		
		assertEquals(lo, ro.getInputByDate("01 03 2021", "30 03 2021"));
	}
	public void testGetNotPayedByDate() {
		List<Order> lo=new ArrayList<Order>();
		lo.add(o2);		
		assertEquals(lo, ro.getNotPayedByDate("01 03 2021", "30 03 2021"));
	}

	@Test
	public void testCalculototal() {
		System.out.println(ro.calculototal(o1));
		System.out.println(ro.calculototal(o2));
		System.out.println(ro.calculototal(o3));
	}

	@Test
	public void testBuscarordencodigo() {
		
	}

}
