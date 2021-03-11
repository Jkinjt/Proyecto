package client;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;


public class ClientTest {
	List<String> a=new ArrayList<String>();
	List<String> b=new ArrayList<String>();
	
	
	
	Client c1=new Client("1A","Juan",15,a);
	Client c2=new Client("2B","Pedro",15,null);
	Client c3=new Client("3C","Antonio",20,b);
	
	@Before
	public void setAddTest() {
		a.add("Calle falsa 123");
		a.add("Calle verdadera 321");
		b.add("Plaza alguien 8");
		
	}
	
	@Test
	public void addAddressTest() {
		assertTrue(c1.addAddress("Calle esta 8"));
		assertFalse(c1.addAddress("Calle falsa 123"));
	}
	
	@Test
	public void removeAddressTest() {
		assertTrue(c1.removerAddress("Calle falsa 123"));
		assertFalse(c1.removerAddress("no existe"));
	}
	
	@Test
	public void printSetTest() {
		Iterator<String> iteeratora=a.iterator();
		while(iteeratora.hasNext()) {
			String prueba=iteeratora.next();	
			 
			System.out.println(prueba);
		}
	}
	
	@Test
	public void equalsClient() {
		
		assertFalse(c1.equals(c2));
		assertTrue(c1.equals(c1));
		assertTrue(c2.equals(c2));
		assertTrue(c3.equals(c3));
	}

}
