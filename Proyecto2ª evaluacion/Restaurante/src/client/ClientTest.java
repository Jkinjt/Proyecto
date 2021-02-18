package client;

import static org.junit.Assert.*;

import org.junit.Test;

public class ClientTest {
	String[] a= {"Calle falsa 1234", "Plaza Ocurrencia  87"};
	String[] b= {"Plaza Ocurrencia  87"};
	Client c1=new Client("1A","Juan",15,a);
	Client c2=new Client("2B","Pedro",15,null);
	Client c3=new Client("3C","Antonio",20,b);
	
	@Test
	public void equalsClient() {
		assertFalse(c1.equals(c2));
		assertTrue(c1.equals(c1));
	}

}
