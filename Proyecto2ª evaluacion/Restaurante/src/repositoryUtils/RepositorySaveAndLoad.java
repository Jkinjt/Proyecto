package repositoryUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import Order.Order;
import Order.RepositoryOrders;
import Product.Product;
import Product.Repository;
import client.Client;
import client.RepositoryClients;

public class RepositorySaveAndLoad {
	private static RepositorySaveAndLoad _instance;
	private Repository repositoryProduct = Repository.getSingletonInstance();
	private RepositoryOrders repositoryOrders = RepositoryOrders.getSingletonInstance();
	private RepositoryClients repositoryClient = RepositoryClients.getSingletonInstance();

	private RepositorySaveAndLoad() {
		super();
	}
	public static RepositorySaveAndLoad getSingletoonInstance() {
		if(_instance==null) {
			_instance=new RepositorySaveAndLoad();
		}
		return _instance;
	}

	public void saveClient(String url) {
		if (url != null) {
			FileOutputStream f;

			try {
				f = new FileOutputStream(url);
				ObjectOutputStream of = new ObjectOutputStream(f);
				of.writeObject(repositoryClient.getClient());
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public void loadClient(String url) throws ClassNotFoundException {
		if (url != null) {
			FileInputStream f;
			try {
				f = new FileInputStream(url);
				ObjectInputStream of = new ObjectInputStream(f);
				repositoryClient.setClient((List<Client>) of.readObject());

			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public void saveOrders(String url) {
		if (url != null) {
			FileOutputStream f;

			try {
				f = new FileOutputStream(url);
				ObjectOutputStream of;
				of = new ObjectOutputStream(f);
				of.writeObject(repositoryOrders.getallorder());

			} catch (FileNotFoundException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();

			}
		}
	}

	public void loadOrders(String url) {
		if (url != null) {
			FileInputStream f;

			try {
				f = new FileInputStream(url);
				ObjectInputStream of = new ObjectInputStream(f);
				repositoryOrders.setRegistro((List<Order>) of.readObject());

			} catch (ClassNotFoundException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void saveProducts(String url) {
		if (url != null) {
			FileOutputStream f;

			try {
				f = new FileOutputStream(url);
				ObjectOutputStream of;
				of = new ObjectOutputStream(f);
				of.writeObject(of);
			} catch (FileNotFoundException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
	public void loadProduct(String url) {
		if(url!=null) {
			
			
			try {
				FileInputStream f=new FileInputStream(url);
				ObjectInputStream of;
					of = new ObjectInputStream(f);
				repositoryProduct.setProducts((ArrayList<Product>) of.readObject());
			} catch (ClassNotFoundException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
