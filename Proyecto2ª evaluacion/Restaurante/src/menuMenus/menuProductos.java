package menuMenus;

import java.util.ArrayList;

import Product.Product;
import Product.Repository;
import Product.drink;
import Product.food;
import mesage.mensajesProduct;
import repositoryUtils.RepositorySaveAndLoad;
import repositoryUtils.herramientas;

public class menuProductos /* implements IMenuProduct */ {
	static RepositorySaveAndLoad snl = RepositorySaveAndLoad.getSingletoonInstance();
	static Repository c = Repository.getSingletonInstance();
	static herramientas h = new herramientas();
	static mensajesProduct m = new mensajesProduct();
	ArrayList<Product> products = new ArrayList<Product>();

	public static void menuProductprincipal() {
		menuInicio();
	}

	// menu de inicio
	public static void menuInicio() {
		int opcion = -1;

		do {
			m.menuinicio();
			opcion = h.intcontrol();

			switch (opcion) {
			// modificar producto
			case 1:
				h.cargando();
				editProduct();
				snl.saveProducts(c.getAllProducts());
				break;
			// anadir o eliminar producto
			case 2:
				h.cargando();
				addORremove();
				snl.saveProducts(c.getAllProducts());
				break;
			// mostrar producto
			case 3:
				h.cargando();
				showProducts();
				break;
			// salir
			case 0:
				h.Salida();
				
				break;

			default:
				break;
			}
		} while (opcion != 0);
	}

	// EditProduct
	public static void editProduct() {
		int opcion = -1;
		Product p = new Product() {
		} ;
		do {
			m.menueditar();
			opcion = h.intcontrol();
			switch (opcion) {
			// Modificar precio
			case 1:
				System.out.println("Introduce el nombre");
				p = c.searchProduct(h.stringcontrol());
				if (p != null) {
					System.out.println("Introduce el dato ");
					c.searchProduct(p.getName()).setPrice(h.doublecontrol());
				} else {
					System.out.println("Producto no encontrado");
				}
				break;
			// modificar comida vegana
			case 2:
				System.out.println("Introduce el nombre");
				 p = c.searchProduct(h.stringcontrol());
				if (p != null) {
					System.out.println("Introduce el dato ");
					if (c.searchFood(p.getName()).isForVegans() == false) {
						c.searchFood(p.getName()).setForVegans(true);
					} else if (c.searchFood(p.getName()).isForVegans() == true) {
						c.searchFood(p.getName()).setForVegans(false);
					}
				} else {
					System.out.println("Producto no encontrado");
				}
				break;
			// update alcohol
			case 3:
				System.out.println("Introduce el nombre");
				 p = c.searchProduct(h.stringcontrol());
				if (p != null) {
					System.out.println("Introduce el dato ");
					if (c.searchDrinks(p.getName()).getAlcoholic() == false) {
						c.searchDrinks(p.getName()).setAlcoholic(true);
					} else if (c.searchDrinks(p.getName()).getAlcoholic() == true) {
						c.searchDrinks(p.getName()).setAlcoholic(false);
					}
				} else {
					System.out.println("Producto no encontrado");
				}
				break;
			// modificar comida celiaca
			case 4:
				System.out.println("Introduce el nombre");
				 p = c.searchProduct(h.stringcontrol());
				if (p != null) {
					System.out.println("Introduce el dato ");
					if (c.searchFood(p.getName()).getsIsForCeliac() == false) {
						c.searchFood(p.getName()).setForCeliac(true);
					} else if (c.searchFood(p.getName()).getsIsForCeliac() == true) {
						c.searchFood(p.getName()).setForCeliac(false);
					}
				} else {
					System.out.println("Producto no encontrado");
				}
				break;
			// añadir a bundlePack
			case 5:
				m.pedirpro();
				p.anadirObejeto(c.searchProduct(h.stringcontrol()));
				break;
			// quitar del bundlePack
			case 6:
				m.pedirpro();
				p.eliminarObejeto(c.searchProduct(h.stringcontrol()));
				break;
			// salir del menu
			case 0:
				h.Salida();

				break;

			default:
				break;
			}
		} while (opcion != 0);
	}

	// Add-OR-Remove
	public static void addORremove() {
		int opcion = -1;

		do {
			m.menuAddOrRemove();
			opcion = h.intcontrol();

			switch (opcion) {
			// añadir producto
			case 1:
				addproduct();
				break;
			// remover producto
			case 2:
				c.deleteProduct(c.searchProduct(h.stringcontrol()));
				break;
			// salir
			case 0:
				h.Salida();
				
				break;

			default:
				break;
			}
		} while (opcion != 0);
	}

	// ShowProducts
	public static void showProducts() {
		int opcion = -1;
		do {
			m.menumostrar();
			opcion = h.intcontrol();

			switch (opcion) {
			// salir
			case 0:
				h.Salida();

				break;
			// mostrar todos los productos
			case 1:
				System.out.println(c.getAllProducts());
				break;
			// mostrar todas las bebidad alcoholicas
			case 2:
				System.out.println(c.getAlcoholicDrinks());
				break;
			// mostrar todas las bebidad no alcoholicas
			case 3:
				System.out.println(c.getNoAlcoholicDrinks());
				break;
			// mostrar toda la comida
			case 4:
				System.out.println(c.getAllFood());
				break;
			// mostrar toda la comida vegana
			case 5:
				System.out.println(c.AllForVeganFood());
				break;
			// mostrar todas las comidas con ofera (dentro del bundlePack)
			case 6:
				System.out.println(c.getBundleProducts(c.searchProduct(h.stringcontrol())));
				break;
			// mostrar todas las id de los productos
			case 7:
				System.out.println(c.todosId());
				break;
			// mostrar precio de los productos
			case 8:
				System.out.println(c.todosPrecio());
				break;

			default:
				break;
			}
		} while (opcion != 0);

	}

	// METODOS DE MENU EDITAR
	// METODO PARA MODIFICAR PRECIO
	/*
	 * public static double updatePrice(Product p) { Repository c=
	 * Repository.getSingletonInstance(); ArrayList<Product> products = new
	 * ArrayList<Product>(); double pNew=0; h.intcontrol(); for(int
	 * i=0;i<products.size();i++) { if(p!=null && products.contains(p)) {
	 * System.out.println("Precio actual:"+p.getPrice());
	 * System.out.println("-------------------------------");
	 * System.out.println("Precio nuevo-->"); pNew=h.intcontrol(); p.setPrice(pNew);
	 * System.out.println("Cambio realizado con exito"); } } return pNew; }
	 */

	// METODO PARA MODIFICAR VEGANO
	public static void updateVegan(Product p) {
		Repository c = Repository.getSingletonInstance();
		ArrayList<food> products = new ArrayList<food>();
		h.intcontrol();
		String yes;
		food f = (food) p;
		for (int i = 0; i < products.size(); i++) {
			if (f != null && products.contains(f)) {
				if (f.isForVegans() == true) {
					System.out.println("Esta comida es vegana");
				} else if (f.isForVegans() == true) {
					System.out.println("Cambiar a no vegano-->YES/NO");
					yes = h.stringcontrol();
					f.getClass().equals(f.isForVegans() == false);
					System.out.println("Cambio realizado con exito");
				}
				if (f.isForVegans() == false) {
					System.out.println("Esta comida no es vegana");
				} else if (f.isForVegans() == false) {
					System.out.println("Cambiar a vegano-->YES/NO");
					yes = h.stringcontrol();
					f.getClass().equals(f.isForVegans() == true);
					System.out.println("Cambio realizado con exito");
				}
			}
		}
	}

	// METODO PARA MODIFICAR BEBIDA ALCOHOLICA
	public static void updateAlchool(Product p) {
		Repository c = Repository.getSingletonInstance();
		ArrayList<drink> products = new ArrayList<drink>();
		h.intcontrol();
		String yes;
		drink d = (drink) p;
		for (int i = 0; i < products.size(); i++) {
			if (d != null && products.contains(d)) {
				if (d.getAlcoholic() == true) {
					System.out.println("Esta bebida es alcoholica");
				} else if (d.getAlcoholic() == true) {
					System.out.println("Cambiar a no alcoholica-->YES/NO");
					yes = h.stringcontrol();
					d.getClass().equals(d.getAlcoholic() == false);
					System.out.println("Cambio realizado con exito");
				}
				if (d.getAlcoholic() == false) {
					System.out.println("Esta bebida no es alcoholica");
				} else if (d.getAlcoholic() == false) {
					System.out.println("Cambiar a alcoholica-->YES/NO");
					yes = h.stringcontrol();
					d.getClass().equals(d.getAlcoholic() == true);
					System.out.println("Cambio realizado con exito");
				}
			}
		}
	}

	// METODO PARA MODIFICAR COMIDA CELIACA
	public static void updateCeliac(Product p) {
		Repository c = Repository.getSingletonInstance();
		ArrayList<food> products = new ArrayList<food>();
		h.intcontrol();
		String yes;
		food f = (food) p;
		for (int i = 0; i < products.size(); i++) {
			if (f != null && products.contains(f)) {
				if (f.getsIsForCeliac() == true) {
					System.out.println("Esta comida es celiaca");
				} else if (f.getsIsForCeliac() == true) {
					System.out.println("Cambiar a no celiaco-->YES/NO");
					yes = h.stringcontrol();
					f.getClass().equals(f.getsIsForCeliac() == false);
					System.out.println("Cambio realizado con exito");
				}
				if (f.getsIsForCeliac() == false) {
					System.out.println("Esta comida no es celiaca");
				} else if (f.getsIsForCeliac() == false) {
					System.out.println("Cambiar a celiaco-->YES/NO");
					yes = h.stringcontrol();
					f.getClass().equals(f.getsIsForCeliac() == true);
					System.out.println("Cambio realizado con exito");
				}
			}
		}
	}

	public static void addproduct() {
		int opcion = -1;
		m.pedir();
		opcion = h.intcontrol();
		switch (opcion) {
		case 1:
			int opcion2 = -1;
			// bebida
			m.nombre();
			String nombre = h.stringcontrol();
			m.precio();
			double precio = h.doublecontrol();
			m.opcion();
			boolean alcohol = false;
			opcion2 = h.intcontrol();
			switch (opcion2) {
			case 2:
				alcohol = false;
				break;
			case 1:
				alcohol = true;
				break;
			default:
				break;
			}

			drink bn = new drink(nombre, precio, alcohol);
			c.addProduct(bn);
			break;
		case 2:
			// comida
			int opcion3 = -1;
			// bebida
			m.nombre();
			String nombref = h.stringcontrol();
			m.precio();
			double preciof = h.doublecontrol();
			m.opcion2();
			boolean celiac = false;
			opcion3 = h.intcontrol();
			switch (opcion3) {
			case 2:
				celiac = false;
				break;
			case 1:
				celiac = true;
				break;
			default:
				break;
			}
			food fn = new food(nombref, preciof, celiac);
			c.addProduct(fn);
			break;
		default:
			break;
		}
	}

}
