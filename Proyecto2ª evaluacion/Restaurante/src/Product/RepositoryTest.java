package Product;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.UUID;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class RepositoryTest {
	Repository rp=Repository.getSingletonInstance();
	food f1=new food("kebab", 5, false);
	food f2=new food("Hamburguesa", 3, false);
	food f3=new food( "Ensalada",3,true);
	drink d1=new drink( "Coca cola", 1, false);
	drink d2=new drink("Fanta", 1, false);
	drink d3=new drink( "JB", 8.50, true);
	
	@Before
	public void produc() {
		rp.addProduct(d1);
		rp.addProduct(f1);
		rp.addProduct(d2);
		rp.addProduct(f2);
	}
	@Test
	public void getAllProductsTest() {
		ArrayList<Product> p=new ArrayList<Product>();
		p.add(d1);
		p.add(f1);
		p.add(d2);
		p.add(f2);
		p.add(f3);
		p.add(d3);		
		assertEquals(p, rp.getAllProducts());
		
	}
	@Test
	public void getAllDrinksTest() {
		ArrayList<Product> p=new ArrayList<Product>();
		p.add(d1);
		p.add(d2);
		p.add(d3);		
		assertEquals(p, rp.getAllDrinks());
		
	}
	@Test
	public void getAllFood() {
		ArrayList<Product> p=new ArrayList<Product>();
		p.add(f1);
		p.add(f2);
		p.add(f3);
		assertEquals(p, rp.getAllFood());
		
	}
	@Test
	public void noAlcoholicDrinksTest() {
		ArrayList<Product> p=new ArrayList<Product>();
		p.add(d1);
		p.add(d2);
		assertEquals(p, rp.getNoAlcoholicDrinks());
	}
	@Test
	public void AlcoholicDrinksTest() {
		ArrayList<Product> p=new ArrayList<Product>();
		p.add(d3);		
		assertEquals(p, rp.getAlcoholicDrinks());
	}
	@Test
	public void AllForVegan() {
		ArrayList<Product> p=new ArrayList<Product>();
		rp.addProduct(f3);
		p.add(f3);
		assertEquals(p, rp.AllForVeganFood());
		rp.deleteProduct(f3);
		
		
	}
	@Test
	public void addProducttest() {
		assertTrue(rp.addProduct(f3));
		assertTrue(rp.addProduct(d3));
		assertFalse(rp.addProduct(d1));
		assertFalse(rp.addProduct(d2));
		assertFalse(rp.addProduct(f2));
		assertFalse(rp.addProduct(f1));
	}

	@Test
	public void deleteProductTest() {
		assertTrue(rp.deleteProduct(f1));
		assertTrue(rp.deleteProduct(d1));
		assertTrue(rp.deleteProduct(f2));
		assertTrue(rp.deleteProduct(d2));
		assertFalse(rp.deleteProduct(f3));
		assertFalse(rp.deleteProduct(d3));
	}
	
	

	
	
	

}
