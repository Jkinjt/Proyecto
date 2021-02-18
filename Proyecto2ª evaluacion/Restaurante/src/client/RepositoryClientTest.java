package client;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RepositoryClientTest {
	RepositoryClients rc = new RepositoryClients();
	String[] a = { "Calle falsa 1234", "Plaza Ocurrencia  87" };
	String[] b = { "Plaza Ocurrencia  87" };
	Client c1 = new Client("1A", "Juan", 15, a);
	Client c2 = new Client("2B", "Pedro", 15, null);
	Client c3 = new Client("3C", "Antonio", 20, b);

	@Before
	public void createRepository() {

	}

	@Before
	public void AddClient() {
		rc.addClient(c1);
		rc.addClient(c2);

	}
	@Test
	public void testSearchClientByName() {
		assertEquals(0, rc.searchClientByName(c1.getName()));
		assertEquals(1, rc.searchClientByName(c2.getName()));
	}
	@Test
	public void testSearchClientByDni() {
		assertEquals(0, rc.searchClientByDni(c1.getDni()));
		assertEquals(1, rc.searchClientByDni(c2.getDni()));
	}

	@Test
	public void testAddClient() {
		assertFalse(rc.addClient(c1));
		assertFalse(rc.addClient(c2));
		assertTrue(rc.addClient(c3));
	}

	@Test
	public void testDeleteClient() {
		assertTrue(rc.deleteClient(c1));
		assertTrue(rc.deleteClient(c2));
		assertFalse(rc.deleteClient(c3));
	}

	@Test
	public void testAupdatClient() {
		assertTrue(rc.aupdateClient(c1));

		assertTrue(rc.aupdateClient(c2));

		assertFalse(rc.aupdateClient(c3));
	}

}
