package Product;

import java.util.ArrayList;

public interface iProduct {
	
	public ArrayList<Product> getBundlePack();
	
	public String getName();
	
	public double getPrice();
	
	public boolean getsIsForCeliac();
}
