package Product;
import Product.Repository;
import java.util.UUID;

public class drink extends Product {
	boolean Alcoholic;
	//no es un array de enteros, es mejor hacer una lista de  productos
	 int [] Drinks;
	 
	 
	public drink(UUID id, String name, double price, boolean alcoholic) {
		super(id, name, price, alcoholic);
		this.Alcoholic=alcoholic;
	}
	
	
	public boolean isAlcoholic() {
		return Alcoholic;
	}

	
	@Override
	public int[] getBundlePack() {
		for(int i=0;i<Drinks.length;i++) {
			
		}
		
		
		/*crear un array de enteros, en comida y en bebida,
		una vez creado el array en ambos buscamos la pocision de los objetos en el arraylist
		una vez sepamos la posicion hacemos la combinacion con los puestos del array
		esas combinaciones las hacemos en el array de enteros de cada clase
		finalmente en este metodo hacemos que devuelva ese array de enteros.
		*/
		return Drinks;
	}


	@Override
	public String toString() {
		return "Drink Is Alcoholic? =" + Alcoholic+"/n"+ 
				super.toString();
	}
	
	

}
