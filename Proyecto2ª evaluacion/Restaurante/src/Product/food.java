package Product;

import java.util.UUID;

public class food extends Product {
	boolean forVegans;
	//no es un array de enteros, es mejor hacer una lista de  productos
	int [] food;
	//si quitas la UUID en producto la tienes que quitar aquí
	public food(UUID id,String name,double price,boolean forVegans) {
		super(id, name, price,forVegans);
		this.forVegans=forVegans;
	}

	
	
	
	public boolean isForVegans(int id) {
		boolean forVegans=false;
		//aqui estas asignando una UUID nueva al producto 
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
