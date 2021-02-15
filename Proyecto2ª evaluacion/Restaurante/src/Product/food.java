package Product;

import java.util.UUID;

public class food extends Product {
	boolean forVegans;
	
	public food() {
		super(id, name, price);
		this.forVegans=forVegans;
	}

	
	
	
	public boolean isForVegans(UUID id) {
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
		// TODO Auto-generated method stub
		
	
	}




	@Override
	public String toString() {
		return "Is for vegans=" + forVegans +"/n"+
			   "Is For Vegans=" + isForVegans(null)
			   + super.toString();
	}
	
	

}
