package client;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RepositoryClientTest {
	RepositoryClients rc=new RepositoryClients();
	@Before
	public void createRepository() {
		
	}
	@Test
	public void testAddClient() {
		String[] a= {"Calle", "Ovalle","n","3"};
		
		assertEquals(true,rc.addClient(new Client("1A","Juan",15,a)));
	}

}
