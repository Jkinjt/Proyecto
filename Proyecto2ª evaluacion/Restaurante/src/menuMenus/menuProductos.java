package menuMenus;

import java.util.List;
import java.util.UUID;
import Product.Product;
import Product.Repository;
import Product.drink;
import Product.food;
import client.RepositoryClients;

import repositoryUtils.herramientas;

public class menuProductos {
	static Repository c= Repository.getSingletonInstance();
	static herramientas h=new herramientas();
	static mensajesProduct m=new mensajesProduct();
	public static void menuclientesprincipal() {
		menuInicio();
	}
	
	//menu de inicio
	public static void menuInicio() {
		int opcion=-1;
		
		do {
		m.menuinicio();
		opcion=h.intcontrol();
		
		switch (opcion) {
		//modificar producto
		case 1:
			
			break;
		//anadir o eliminar producto
		case 2:
			
			break;
		//mostrar producto	
		case 3:
			
			break;
		//salir
		case 0:
			m.salida();
			break;

		default:
			break;
		}
		}while(opcion!=0);
	}
	//EditProduct
	public void editProduct(){
		int opcion=-1;
		
		do {
			m.menueditar();
			opcion=h.intcontrol();
			switch (opcion) {
			//Modificar precio
			case 1:
				
			break;
			//modificar comida vegana
			case 2:
				
				break;
			//modificar bebida alcoholica
			case 3:
				
				break;
			//modificar comida celiaca
			case 4:
				
				break;
			//añadir a bundlePack
			case 5:
				
				break;
			//quitar del bundlePack
			case 6:
				
				break;
			//salir del menu
			case 0:
				m.salida();	
				break;
		
			default:
				break;
			}
		}while(opcion!=0);
	}
	//Add-OR-Remove
	public void addORremove() {
	int opcion=-1;
	
	do {
		m.menuAddOrRemove();
		opcion=h.intcontrol();
		
		switch (opcion) {
		//añadir producto
		case 1:
			
			break;
		//remover producto	
		case 2:
			
			break;
		//salir
		case 0:
			m.salida();
			break;

		default:
			break;
		}
	}while(opcion!=0);
   }
	
	//ShowProducts
	public void showProducts() {
	int opcion=-1;
	do {
	m.menumostrar();
	opcion=h.intcontrol();
	
	switch (opcion) {
		//salir
		case 0:
			m.salida();
		break;
		//mostrar todos los productos
		case 1:
			
			break;
		//mostrar todas las bebidad alcoholicas
		case 2:
			
			break;
		//mostrar todas las bebidad no alcoholicas
		case 3:
			
			break;
		//mostrar toda la comida
		case 4:
			
			break;
		//mostrar toda la comida vegana
		case 5:
			
			break;
		//mostrar todas las comidas con ofera (dentro del bundlePack)
		case 6:
			
			break;
		//mostrar todas las id de los productos
		case 7:
			
			break;
		//mostrar precio de los productos
		case 8:
			
			break;
			
		case 9:
			
			break;

	default:
		break;
	}
	}while(opcion!=0);
	
	
	}
}
