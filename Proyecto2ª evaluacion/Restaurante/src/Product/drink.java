package Product;

public class drink extends Product {
	boolean Alcoholic;
	
	public drink() {
		super(id, name, price);
		this.Alcoholic=Alcoholic;
	}
	
	
	public boolean isAlcoholic() {
		return Alcoholic;
	}


	@Override
	public void getBundlePack() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public String toString() {
		return "Drink Is Alcoholic? =" + Alcoholic+"/n"+ 
				super.toString();
	}
	
	

}
