package menuMenus;

import java.util.UUID;

public interface IMenuProduct {
	//mostrar id
	public  UUID showId (Product p);
	
	//mostrar precio
	public double showPrice(Product p);
	
	//modificar precio
	public double updatePrice(Product p);
	
	//modificar megano
	public boolean updateVegan(Product p);
	
	//modificar alcoholico
	public boolean updateAlchool(Product p);
	
	//modificar celiaco
	public boolean updateCeliac (Product p);
	
	//mostrar packs
	public String showBundlePack(Product p);
	
	//añadir al pack
	public void addToBudlePAck(Product p);
	
	//eliminar del pack
	public void removeFromBundlePack(Product p);
}
