package menuMenus;

import java.util.List;
import java.util.UUID;

import Product.Product;

public interface IMainMenuRepostoryProducts {
	//añadir producto
	public Product addProduct(Product p);
	
	//quitar producto
	public Product removeProduct(Product p);
	
	//mostrar bebidas alcoholicas
	public List<drink> showAllAlcholic();
	
	//mostrar comidas
	public List<food> showAllFood();
	
	//mostrar bebidas no alcoholicas
	public List<drink> showAllNonAlcholic(drink d);
	
	//mostrar comidas veganas
	public food showAllVeganFood();
	
	//buscar producto
	public Product searchProduct(UUID id);
	
	//mostrar todos los productos que hagan oferta
	public List<Product> searchProduct(boolean pack);
	
	//buscar comida
	public food searhFood(UUID id);
	
	// buscar bebida
	public drink searhDrink(UUID id);
}
