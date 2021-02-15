package Product;

import java.util.UUID;

public class drink extends Product {
	boolean Alcoholic;
	
	public drink(int i, String string, double d, boolean alcoholic) {
		super(id, name, price, alcoholic);
		this.Alcoholic=Alcoholic;
	}
	
	
	public boolean isAlcoholic() {
		return Alcoholic;
	}


	@Override
	public void getBundlePack() {
		
		return;
	}


	@Override
	public String toString() {
		return "Drink Is Alcoholic? =" + Alcoholic+"/n"+ 
				super.toString();
	}
	
	

}
