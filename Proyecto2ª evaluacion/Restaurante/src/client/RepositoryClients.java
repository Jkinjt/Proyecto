package client;

import java.util.List;

public class RepositoryClients {
	private List<Client> client;
	
	public List<Client> getClient() {
		return client;
	}
	public void setClient(List<Client> client) {
		this.client = client;
	}
	/*
	 * @Param Nombre del cliente que se quiere buscar
	 * @Return Posici�n del cliente en la lista
	 * -1 si no se ha encontrado
	 */
	public int searchClientByName(String name) {
		int result=-1;
		if(name!=null) {
			for (int i = 0; i < client.size(); i++) {
				if(client.get(i).getName().equalsIgnoreCase(name)) {
					result=i;
					i=client.size();
				}				
			}
		}
		
		return result;
	}
	/*
	 * @Param Actualiza un cliente pasado por  parametro
	 * 
	 */
	public void aupdateClient(Client c) {
		if(c!=null) {
			int position=searchClientByDni(c.getDni());
			client.set(position, c);
		}
		
	}
	/*
	 * @Param cliente que se quiere a�adir
	 * @return booleano devuelve falso si el cliente existe o verdadero si se ha conseguido a�adir
	 */
	
	public boolean addClient(Client c) {
		boolean result=false;
		if(c!=null) {
			if(searchClientByDni(c.getDni())>-1)			
			client.add(c);
			result=true;
		}
		return result;
	}
	/*
	 * @Param Cliente que se quiera borrar
	 * @return Verdadero si se a borrado y falso si no se ha borrado
	 */
	public boolean deleteClient(Client c) {
		boolean result=false;
		if(c!=null) {
			client.remove(c);
			result=true;
		}
		return result;
	}
	/*
	 * @Param DNI del cliente que se quiera buscar
	 * @Return posici�n del cliente que se busca si es -1 no se a encotrado
	 */
	public int searchClientByDni(String dni) {
		int result=-1;
		if(dni!=null) {
			for (int i = 0; i < client.size(); i++) {
				if(client.get(i).getDni().equalsIgnoreCase(dni)) {
					result=i;
					i=client.size();
				}				
			}
		}
		return result;
	}
	
	
	
	
	
}
