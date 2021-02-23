package menuMenus;

import java.util.List;
import java.util.UUID;

import Product.Product;
import Product.drink;
import Product.food;

public interface IMenuPrincipalProducto {
	//recibe un producto y añadir producto
	public Product addProduct(Product p);
	
	//recibe un producto y quitar producto
	public Product removeProduct(Product p);
	
	//recibe una lista de productos y muestra todas las bebidas alcoholicas
	public List<drink> showAllAlcholic(List<Product> lista);
	
	//recibe una lista de productos y muestra todas las comidas
	public List<food> showAllFood(List<Product> lista);
	
	//recibe una lista de productos y muestra todas las bebidas no alcoholicas
	public List<drink> showAllNonAlcholic(List<Product>lista);
	
	//recibe una lista de productos y muestra todas las comidas veganas
	public food showAllVeganFood(List<Product> lista);
	
	//recibe un uuid y busca un producto
	public Product searchProduct(UUID id);
	
	//mostrar todos los productos que hagan oferta
	public List<Product> searchProduct(List<Product> lista);
	
	//recibe un uuid y busca una comida
	public food searhFood(UUID id);
	
	//recibe un uuid busca una bebida
	public drink searhDrink(UUID id);
}
