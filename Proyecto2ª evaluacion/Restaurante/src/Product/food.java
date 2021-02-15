package Product;

import java.util.UUID;

public class food extends Product {
	boolean forVegans;
	
	public food(int id,String name,double price,boolean forVegans) {
		super(id, name, price,forVegans);
		this.forVegans=forVegans;
	}

	
	
	
	public boolean isForVegans(int id) {
		boolean forVegans=false;
		this.id=id;
		if(forVegans!=false) {
			forVegans=true;
			System.out.println("This food"+name+" is for vegans");
		}
		
		return forVegans;
	}

	@Override
	public void getBundlePack() {
		
		
		return;
	}




	@Override
	public String toString() {
		return "Is for vegans=" + forVegans +"/n"+
			   "Is For Vegans=" + isForVegans(0)
			   + super.toString();
	}
	
	

}
