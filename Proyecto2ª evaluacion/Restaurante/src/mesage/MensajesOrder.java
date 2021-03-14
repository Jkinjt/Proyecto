package mesage;

import repositoryUtils.herramientas;

public class MensajesOrder {
	static herramientas h= new herramientas();
	// meter todos los mensajes de los menus aqui
	public static void menuPrincicipal() {
		System.out.println("+---------------------------+");
		System.out.println("|     Elige una opcion      |");
		System.out.println("+---------------------------+");
		System.out.println("| 1-Modificar Orden         |");
		System.out.println("+---------------------------+");
		System.out.println("| 2-Anadir o eliminar orden |");
		System.out.println("+---------------------------+");
		System.out.println("| 3-Ver todas las ordenes   |");
		System.out.println("+---------------------------+");
		System.out.println("| 0-Salir                   |");
		System.out.println("+---------------------------+");
	}

	// -------------------------------------------------------------
	// opcion1
	public static void menueditar() {
		System.out.println("+--------------------------+");
		System.out.println("|    Elige una opcion      |");
		System.out.println("+--------------------------+");
		System.out.println("| 1-Modificar estado pago  |");
		System.out.println("+--------------------------+");
		System.out.println("| 2-Modificar estado envio |");
		System.out.println("+--------------------------+");
		System.out.println("| 0-Salir                  |");
		System.out.println("+--------------------------+");
	}

	// -------------------------------------------------------------
	// opcion2
	public static void menuaddorremove() {
		System.out.println("+------------------+");
		System.out.println("| Elige una opcion |");
		System.out.println("+------------------+");
		System.out.println("| 1-Eliminar orden |");
		System.out.println("+------------------+");
		System.out.println("| 0-Salir          |");
		System.out.println("+------------------+");
	}

	// -------------------------------------------------------------
	// opcion3
	public static void menuverordenes() {
		System.out.println("+------------------------------------------------------+");
		System.out.println("|               Elija una opcion                       |");
		System.out.println("+------------------------------------------------------+");
		System.out.println("| 1-Mostrar todas las ordenes                          |");
		System.out.println("+------------------------------------------------------+");
		System.out.println("| 2-Mostrar todas las ordenes pagadas                  |");
		System.out.println("+------------------------------------------------------+");
		System.out.println("| 3-Mostrar todas las ordenes no pagadas               |");
		System.out.println("+------------------------------------------------------+");
		System.out.println("| 4-Mostrar todas las ordenes entregadas               |");
		System.out.println("+------------------------------------------------------+");
		System.out.println("| 5-Mostrar todas las ordenes no entregadass           |");
		System.out.println("+------------------------------------------------------+");
		System.out.println("| 6-Mostrar todas las ordenes entre dos fechas         |");
		System.out.println("+------------------------------------------------------+");
		System.out.println("| 7-Mostrar todas las ordenes de una fecha en concreto |");
		System.out.println("+------------------------------------------------------+");
		System.out.println("| 8-Mostrar todas las ordenes de un cliente            |");
		System.out.println("+------------------------------------------------------+");
		System.out.println("| 9-Mostrar todo el dinero en caja                     |");
		System.out.println("+------------------------------------------------------+");
		System.out.println("| 0-Salir                                              |");
		System.out.println("+------------------------------------------------------+");
	}

	// -------------------------------------------------------------
	// --------------------modificar orden--------------------------
	// -------------------------------------------------------------
	public static void buscarpor() {
		System.out.println("+-----------------------------+");
		System.out.println("|     -Modificar orden por-   |");
		System.out.println("+-----------------------------+");
		System.out.println("| 1-Buscar por codigo         |");
		System.out.println("+-----------------------------+");
		System.out.println("| 2-Buscar por Dni de cliente |");
		System.out.println("+-----------------------------+");
		System.out.println("| 0-Salir                     |");
		System.out.println("+-----------------------------+");
	}
	// -------------------------------------------------------------
	
	// -------------------------------------------------------------
	public static void insertarc() {
		System.out.println("+------------------------------+");
		System.out.println("| Inserte el codigo de la orden|");
		System.out.println("+------------------------------+");
	}
	// -------------------------------------------------------------
	
	public static void insertarn() {
		System.out.println("+---------------------------+");
		System.out.println("| Inserte el Dni del cliente|");
		System.out.println("+---------------------------+");
	}

	// -------------------------------------------------------------

	public static void mdeli() {
		System.out.println("+---------------------------+");
		System.out.println("| Estado de pago modificado |");
		System.out.println("+---------------------------+");
	}

	// -----------------------------------------------------------

	public static void mpay() {
		System.out.println("+----------------------------+");
		System.out.println("| Estado de envio modificado |");
		System.out.println("+----------------------------+");
	}

	// -------------------------------------------------------------
	// --------------------añadir o eliminar--------------------------
	// -------------------------------------------------------------
	public static void addorremove() {
	
		System.out.println("+------------------+");
		System.out.println("| 1-Anadir orden   |");
		System.out.println("+------------------+");
		System.out.println("| 2-Eliminar orden |");
		System.out.println("+------------------+");
		System.out.println("| 0-Salir          |");
		System.out.println("+------------------+");
	}
	
	public static void mensajeAddOrRemove() {
		System.out.println("+-------------------------------+");
		System.out.println("| Inserte el codigo de la orden |");
		System.out.println("+-------------------------------+");
	}
	// -------------------------------------------------------------
	// --------------------mostrar orden--------------------------
	// -------------------------------------------------------------

	
	// -----------------------------------------------------------

	public static void salida() {
		h.Salida();
	}
}
