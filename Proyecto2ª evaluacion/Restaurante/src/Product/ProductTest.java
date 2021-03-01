/**
 * 
 */
package Product;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;



public class ProductTest {
	ArrayList<Product> bP=new ArrayList<Product>();
	food f1=new food("kebab", 5, false);
	food f2=new food("Hamburguesa", 3, false);
	food f3=new food( "Ensalada",3,true);
	drink d1=new drink( "Coca cola", 1, false);
	drink d2=new drink("Fanta", 1, false);
	drink d3=new drink( "JB", 8.50, true);
	

	/**
	 * Test method for {@link Product.Product#getBundlePack()}.
	 */
	@Before
	public void setBundlePack() {
		bP.add(d1);
		bP.add(d2);
		bP.add(f1);
		bP.add(f2);
		f3.setBundlePack(bP);
	}
	@Test
	public void testGetBundlePack() {
		
	assertEquals(bP, f3.getBundlePack());
	//probar si borrar funciona	
	ArrayList<Product> temporal=new ArrayList<Product>();
	temporal.add(f3);
	temporal.add(d3);
	f3.anadirObejeto(f3);
	f3.anadirObejeto(d3);
	assertNotEquals(temporal, f3.getBundlePack());
	f3.eliminarObejeto(d1);
	f3.eliminarObejeto(f1);
	f3.eliminarObejeto(d2);
	f3.eliminarObejeto(f2);
	assertEquals(temporal, f3.getBundlePack());
	}

	/**
	 * Test method for {@link Product.Product#equals(java.lang.Object)}.
	 */
	@Test
	public void testEqualsObject() {
		assertTrue(f3.equals(f3));
		assertTrue(f2.equals(f2));
		assertFalse(f1.equals(f2));
		assertFalse(f3.equals(f1));
		assertFalse(d1.equals(f2));
		assertTrue(d2.equals(d2));
		assertTrue(d1.equals(d1));
		
	}

	/**
	 * Test method for {@link Product.Product#matchOffer(java.util.ArrayList)}.
	 */
	@Test
	public void testMatchOffer() {
		
		assertFalse(f1.isYesOffer());
		assertFalse(f2.isYesOffer());
		assertFalse(f3.isYesOffer());
		assertFalse(d1.isYesOffer());
		assertFalse(d2.isYesOffer());
		assertFalse(d3.isYesOffer());
		ArrayList<Product> temporal=new ArrayList<Product>();
		temporal.add(f3);
		temporal.add(d3);
		assertEquals(null, f3.matchOffer(temporal));
		temporal.add(d1);
		assertEquals(d1, f3.matchOffer(temporal));
		assertTrue(f3.isYesOffer());
		
		
	}



}
