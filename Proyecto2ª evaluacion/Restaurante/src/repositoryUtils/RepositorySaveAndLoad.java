package repositoryUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import Order.Order;
import Order.RepositoryOrders;
import Product.Product;
import Product.Repository;
import client.Client;
import client.RepositoryClients;

public class RepositorySaveAndLoad {
	private static RepositorySaveAndLoad _instance;
	

	private RepositorySaveAndLoad() {
		super();
	}
	public static RepositorySaveAndLoad getSingletoonInstance() {
		if(_instance==null) {
			_instance=new RepositorySaveAndLoad();
		}
		return _instance;
	}

	public void saveClient(List<Client> l) {
		if (l != null) {
			FileOutputStream f;

			try {
				f = new FileOutputStream("Clientes.txt");
				ObjectOutputStream of = new ObjectOutputStream(f);
				of.writeObject(l);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public List<Client> loadClient() throws ClassNotFoundException {
		List<Client> result=null;
		
			FileInputStream f;
			try {
				f = new FileInputStream("Clientes.txt");
				ObjectInputStream of = new ObjectInputStream(f);
				//repositoryClient.setClient((List<Client>) of.readObject());
				result=((List<Client>) of.readObject());
				return result;
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		return result;

	}

	public void saveOrders(List<Order> l) {
		if (l != null) {
			FileOutputStream f;

			try {
				f = new FileOutputStream("Orders.txt");
				ObjectOutputStream of;
				of = new ObjectOutputStream(f);
				of.writeObject(l);

			} catch (FileNotFoundException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();

			}
		}
	}

	public List<Order> loadOrders() {
		List<Order> result=null;
			FileInputStream f;

			try {
				f = new FileInputStream("Orders.txt");
				ObjectInputStream of = new ObjectInputStream(f);
				result=(List<Order>) of.readObject();

			} catch (ClassNotFoundException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return result;
		
	}

	public void saveProducts(List<Product> l) {
		if (l != null) {
			FileOutputStream f;

			try {
				f = new FileOutputStream("Products.txt");
				ObjectOutputStream of;
				of = new ObjectOutputStream(f);
				of.writeObject(l);
			} catch (FileNotFoundException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
	public List<Product> loadProduct() {
		
			List<Product> result=null;
			
			try {
				FileInputStream f=new FileInputStream("Products.txt");
				ObjectInputStream of;
					of = new ObjectInputStream(f);
				result=(ArrayList<Product>) of.readObject();
			} catch (ClassNotFoundException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return result;
		}
	

}
