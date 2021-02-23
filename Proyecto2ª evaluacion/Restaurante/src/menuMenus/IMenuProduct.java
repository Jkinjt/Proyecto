package Product;

import java.util.List;
import java.util.UUID;

public interface IMenuProduct {
	//recibe un producto y devuelve el id
	public  UUID showId (Product p);
	
	//recibe un producto y devuelve el precio de ese producto
	public double showPrice(Product p);
	
	//recibe un producto y modifica el precio de ese producto
	public double updatePrice(Product p);
	
	//recibe un producto y modifica el boolean de si es vegano
	public boolean updateVegan(Product p);
	
	//recibe un producto y modifica el boolean si es alchoolico
	public boolean updateAlchool(Product p);
	
	//recibe un producto y modificar el boolean celiaco
	public boolean updateCeliac (Product p);
	
	//recibe un producto y muestre una packs
	public List<String> showBundlePack(Product p);
	
	//recibe un producto y lo añade a la lista de bundlepack
	public void addToBudlePAck(Product p);
	
	//recibe un producto y lo elimina de la lista de bundlepack
	public void removeFromBundlePack(Product p);
}
