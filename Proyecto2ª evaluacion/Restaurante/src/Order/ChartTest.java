package Order;

import static org.junit.Assert.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Product.Product;
import Product.drink;
import Product.food;
import client.Client;

public class ChartTest  {
	List<String> a=new ArrayList<String>();
	List<String> b=new ArrayList<String>();
	Client c1=new Client("1A","Juan",15,a);
	Chart c=Chart.get_Instance(c1);
	
	Client c2=new Client("2B","Pedro",15,null);
	Client c3=new Client("3C","Antonio",20,b);
	
	food f1=new food("kebab", 5, false);
	food f2=new food("Hamburguesa", 3, false);
	food f3=new food( "Ensalada",3,true);
	drink d1=new drink( "Coca cola", 1, false);
	drink d2=new drink("Fanta", 1, false);
	drink d3=new drink( "JB", 8.50, true);
	@Before
	public void addProducts() {
		c.addProduct(f1);
		c.addProduct(f2);
		c.addProduct(d1);
		c.addProduct(d2);
	
}
	
	
	@Test
	public void testAddProduct() {
		assertTrue(c.addProduct(d1));
		assertTrue(c.addProduct(d2));
		assertTrue(c.addProduct(f1));
		assertTrue(c.addProduct(f2));
		assertTrue(c.addProduct(d3));
		assertTrue(c.addProduct(f3));
		
	}
	@After
	public void removeProduct() {
		c.deleteProduct(d1);
		c.deleteProduct(d2);
		c.deleteProduct(d3);
		c.deleteProduct(f1);
		c.deleteProduct(f2);
		c.deleteProduct(f3);
		
	}
	@Test
	public void testDeleteProduct() {
		assertTrue(c.deleteProduct(d1));
		assertTrue(c.deleteProduct(d2));
		assertTrue(c.deleteProduct(f1));
		assertTrue(c.deleteProduct(f2));
		assertFalse(c.deleteProduct(d3));
		assertFalse(c.deleteProduct(f3));
	}

	@Test
	public void testTotalCalculation() {
		c.totalCalculation();
		assertEquals(10.00, c.getTotal(),0.009);
	}

}
