package client;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class RepositoryClients implements Serializable {
	private List<Client> client;
	public static RepositoryClients pointer;

	private RepositoryClients() {
		this.client = new ArrayList<Client>();
	}

	public static RepositoryClients getSingletonInstance() {
		if (pointer == null) {
			pointer = new RepositoryClients();
		}
		return pointer;
	}

	public List<Client> getClient() {
		return client;
	}

	public void setClient(List<Client> client) {
		this.client = client;

	}

	@Override
	public String toString() {
		return "RepositoryClients [client=" + client.toString() + "]";
	}

	/*
	 * @Param Actualiza un cliente pasado por parametro
	 * 
	 */
	public boolean aupdateClient(Client c) {
		boolean result = false;
		int position = -1;
		if (c != null) {
			for (int i = 0; i < client.size(); i++) {
				if (c.equals(client.get(i))) {
					position = i;
					i = client.size();
				}
			}
			if (position > -1) {
				client.remove(position);
				client.add(position, c);
				result = true;
			}

		}
		return result;
	}
	/*
	 * @Param cliente que se quiere añadir
	 * 
	 * @return booleano devuelve falso si el cliente existe o verdadero si se ha
	 * conseguido añadir
	 */

	public boolean addClient(Client c) {
		boolean result = false;
		if (c != null) {
			if (client.size() > 0) {
				if (searchClientByDni(c.getDni()) == null) {
					client.add(c);
					result = true;
				}
			} else {
				client.add(c);
				result = true;
			}
		}
		return result;
	}

	/*
	 * @Param Cliente que se quiera borrar
	 * 
	 * @return Verdadero si se a borrado y falso si no se ha borrado
	 */
	public boolean deleteClient(Client c) {
		boolean result = false;
		if (c != null) {
			if (client.size() > 0 && client.contains(c)) {
				client.remove(c);
				result = true;
			}
		}
		return result;
	}

	/*
	 * @Param DNI del cliente que se quiera buscar
	 * 
	 * @Return posición del cliente que se busca si es -1 no se a encotrado
	 */
	public Client searchClientByDni(String dni) {
		Client result = null;
		if (dni != null) {
			if (client != null) {
				for (int i = 0; i < client.size(); i++) {
					if (client.get(i).getDni().equalsIgnoreCase(dni)) {
						result = client.get(i);
						i = client.size();
					}
				}
			}

		}
		return result;
	}

	/*
	 * @Param Nombre del cliente que se quiere buscar
	 * 
	 * @Return Posición del cliente en la lista -1 si no se ha encontrado
	 */
	public Client searchClientByName(String name) {
		Client result = null;
		if (name != null) {
			for (int i = 0; i < client.size(); i++) {
				if (client.get(i).getName().equalsIgnoreCase(name)) {
					result = client.get(i);
					i = client.size();
				}
			}
		}

		return result;
	}

	
	
}
