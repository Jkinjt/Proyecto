package menuMenus;

import java.util.ArrayList;

import Product.Product;
import Product.Repository;
import Product.drink;
import Product.food;
import mesage.mensajesProduct;
import repositoryUtils.RepositorySaveAndLoad;
import repositoryUtils.herramientas;

public class menuProductos /*implements IMenuProduct*/ {
	static RepositorySaveAndLoad snl=RepositorySaveAndLoad.getSingletoonInstance();
	static Repository c= Repository.getSingletonInstance();
	static herramientas h=new herramientas();
	static mensajesProduct m=new mensajesProduct();
	ArrayList<Product> products = new ArrayList<Product>();
	
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
			 editProduct();
			 snl.saveProducts(c.getAllProducts());
			break;
		//anadir o eliminar producto
		case 2:
			addORremove();
			 snl.saveProducts(c.getAllProducts());
			break;
		//mostrar producto	
		case 3:
			showProducts();
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
	public static void editProduct(){
		int opcion=-1;
		Product pp=null;
		do {
			m.menueditar();
			opcion=h.intcontrol();
			switch (opcion) {
			//Modificar precio
			case 1:
				updatePrice(null);
			break;
			//modificar comida vegana
			case 2:
				updateVegan(null);
				break;
			//update alcohol
			case 3:
				updateAlchool(null);
				break;
			//modificar comida celiaca
			case 4:
				updateCeliac(null);
				break;
			//añadir a bundlePack
			case 5:
				h.imprimirconintro("Inserte el producto");
				pp.anadirObejeto(pp);
				break;
			//quitar del bundlePack
			case 6:
				pp.eliminarObejeto(null);
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
	public static void addORremove() {
	int opcion=-1;
	
	do {
		m.menuAddOrRemove();
		opcion=h.intcontrol();
		
		switch (opcion) {
		//añadir producto
		case 1:
			c.addProduct(null);
			break;
		//remover producto	
		case 2:
			c.deleteProduct(null);
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
	public static void showProducts(){
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
			c.getAllProducts();
			break;
		//mostrar todas las bebidad alcoholicas
		case 2:
			c.getAlcoholicDrinks();
			break;
		//mostrar todas las bebidad no alcoholicas
		case 3:
			c.getNoAlcoholicDrinks();
			break;
		//mostrar toda la comida
		case 4:
			c.getAllFood();
			break;
		//mostrar toda la comida vegana
		case 5:
			c.AllForVeganFood();
			break;
		//mostrar todas las comidas con ofera (dentro del bundlePack)
		case 6:
			c.getBundleProducts(null);
			break;
		//mostrar todas las id de los productos
		case 7:
			c.todosId();
			break;
		//mostrar precio de los productos
		case 8:
			c.todosPrecio();
			break;

	default:
		break;
	}
	}while(opcion!=0);
	
	
	}

	//METODOS DE MENU EDITAR
		//METODO PARA MODIFICAR PRECIO
	public static double updatePrice(Product p) {
		Repository c= Repository.getSingletonInstance();
		ArrayList<Product> products = new ArrayList<Product>();
		int pNew=0;
		h.intcontrol();
		for(int i=0;i<products.size();i++) {
			if(p!=null && products.contains(p)) {
				System.out.println("Precio actual:"+p.getPrice());
				System.out.println("-------------------------------");
				System.out.println("Precio nuevo-->");
				pNew=h.intcontrol();
				p.setPrice(pNew);
				System.out.println("Cambio realizado con exito");
			}
		}
		return pNew;
	}

		//METODO PARA MODIFICAR VEGANO
	public static void updateVegan(Product p) {
		Repository c= Repository.getSingletonInstance();
		ArrayList<food> products = new ArrayList<food>();
		h.intcontrol();
		String yes;
		food f=(food)p;
		for(int i=0;i<products.size();i++) {
			if(f!=null && products.contains(f)) {
				if(f.isForVegans()==true) {
					System.out.println("Esta comida es vegana");
				}else if (f.isForVegans()==true){
					System.out.println("Cambiar a no vegano-->YES/NO");
					yes=h.stringcontrol();
					f.getClass().equals(f.isForVegans()==false);
					System.out.println("Cambio realizado con exito");
			    }if(f.isForVegans()==false) {
			    	System.out.println("Esta comida no es vegana");
			    }else if (f.isForVegans()==false){
					System.out.println("Cambiar a vegano-->YES/NO");
					yes=h.stringcontrol();
					f.getClass().equals(f.isForVegans()==true);
					System.out.println("Cambio realizado con exito");
			    }
			}
		}
	}

		//METODO PARA MODIFICAR BEBIDA ALCOHOLICA
	public static void updateAlchool(Product p) {
		Repository c= Repository.getSingletonInstance();
		ArrayList<drink> products = new ArrayList<drink>();
		h.intcontrol();
		String yes;
		drink d=(drink)p;
		for(int i=0;i<products.size();i++) {
			if(d!=null && products.contains(d)) {
				if(d.getAlcoholic()==true) {
					System.out.println("Esta bebida es alcoholica");
				}else if (d.getAlcoholic()==true){
					System.out.println("Cambiar a no alcoholica-->YES/NO");
					yes=h.stringcontrol();
					d.getClass().equals(d.getAlcoholic()==false);
					System.out.println("Cambio realizado con exito");
				}if(d.getAlcoholic()==false) {
			    	System.out.println("Esta bebida no es alcoholica");
			    }else if (d.getAlcoholic()==false){
					System.out.println("Cambiar a alcoholica-->YES/NO");
					yes=h.stringcontrol();
					d.getClass().equals(d.getAlcoholic()==true);
					System.out.println("Cambio realizado con exito");
			    }				
			}
		}
	}

		//METODO PARA MODIFICAR COMIDA CELIACA
	public static void updateCeliac(Product p) {
		Repository c= Repository.getSingletonInstance();
		ArrayList<food> products = new ArrayList<food>();
		h.intcontrol();
		String yes;
		food f=(food)p;
		for(int i=0;i<products.size();i++) {
			if(f!=null && products.contains(f)) {
				if(f.getsIsForCeliac()==true) {
					System.out.println("Esta comida es celiaca");
				}else if (f.getsIsForCeliac()==true){
					System.out.println("Cambiar a no celiaco-->YES/NO");
					yes=h.stringcontrol();
					f.getClass().equals(f.getsIsForCeliac()==false);
					System.out.println("Cambio realizado con exito");
			    }if(f.getsIsForCeliac()==false) {
			    	System.out.println("Esta comida no es celiaca");
			    }else if (f.getsIsForCeliac()==false){
					System.out.println("Cambiar a celiaco-->YES/NO");
					yes=h.stringcontrol();
					f.getClass().equals(f.getsIsForCeliac()==true);
					System.out.println("Cambio realizado con exito");
			    }
			}
		}
	}
}
