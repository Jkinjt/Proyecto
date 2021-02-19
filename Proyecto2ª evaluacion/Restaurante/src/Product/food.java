package Product;

import java.util.UUID;

public class food extends Product {
	boolean forVegans;
	
	int [] food;
	
	public food(UUID id, String name,double price,boolean forVegans) {
		super(name, price,forVegans);
		this.forVegans=forVegans;
		this.id=UUID.randomUUID();
	}

	
	
	
	public boolean isForVegans() {
		
		return forVegans;
	}

	@Override
	public int [] getBundlePack() {
		
		
		return food;
	}




	@Override
	public String toString() {
		return "Is for vegans=" + forVegans +"/n"+
			   "Is For Vegans=" + isForVegans()
			   + super.toString();
	}
	
	

}
