package Product;

import java.util.UUID;

public class food extends Product {
	boolean forVegans;
	int [] food;
	public food(UUID id,String name,double price,boolean forVegans) {
		super(id, name, price,forVegans);
		this.forVegans=forVegans;
	}

	
	
	
	public boolean isForVegans(int id) {
		boolean forVegans=false;
		this.id=UUID.randomUUID();;
		if(forVegans!=false) {
			forVegans=true;
		}
		
		return forVegans;
	}

	@Override
	public int [] getBundlePack() {
		
		
		return food;
	}




	@Override
	public String toString() {
		return "Is for vegans=" + forVegans +"/n"+
			   "Is For Vegans=" + isForVegans(0)
			   + super.toString();
	}
	
	

}
