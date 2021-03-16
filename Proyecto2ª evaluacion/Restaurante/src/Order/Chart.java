package Order;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import Product.Product;
import client.Client;

public class Chart {
	public static Chart _instance;
	private static float discont=0.10f;
	private Client client;
	private List<Product> products=new ArrayList<Product>();
	private double total;
	

	private String addres;
	
	private Chart(Client client) {
		super();
		this.client = client;
	}
	public static Chart get_Instance(Client client) {
		if(_instance==null) {
			_instance=new Chart(client);
		}
		return _instance;
	}
	public Client getClient() {
		return client;
	}
	
	public List<Product> getProducts() {
		return products;
	}
	public double getTotal() {
		return total;
	}
	
	
	public String getAddres() {
		return addres;
	}
	
	public void setClient(Client client) {
		this.client = client;
	}
	public void setAddres(String addres) {
		this.addres = addres;
	}
	
	public boolean addProduct(Product p) {
		boolean valid = false;
		if (p != null) {
				products.add(p);
				valid = true;
		}

		return valid;

	}
	public boolean deleteProduct(Product p) {

		boolean valid = false;
		if(p!=null) {
			for (int i = 0; i < products.size(); i++) {
				if ( products.contains(p)&&products.get(i) != null && products.get(i).equals(p) ) {
					products.remove(i);
					valid = true;
				}
			}	
		}
		

		return valid;

	}
	public void totalCalculation() {
		if(products.size()>1) {
		for (int i = 0; i < products.size(); i++) {
			if(!products.get(i).isYesOffer()) {
				Product temporal=products.get(i).matchOffer((ArrayList) products);
				for (int j = 0; j < products.size(); j++) {
					if(temporal!=null&&!products.get(j).isYesOffer()&&temporal.equals(products.get(j))) {
						products.get(j).setYesOffer(true);
						j=products.size();
					}
					
				}
			}
		}
		
			for (Product product : products) {
				if(product.isYesOffer()) {
					total+=product.getPrice()*(1-discont);
				}else {
					total+=product.getPrice();	
				}
				
			}
		}
	}
	@Override
	public String toString() {
		return "Chart [client=" + client.toStringbasic() + ", products=" + products + ", total=" + total + ", addres=" + addres + "]";
	}
	
	
	
	
}
