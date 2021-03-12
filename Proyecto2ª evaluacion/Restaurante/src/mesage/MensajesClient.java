package mesage;

import repositoryUtils.herramientas;

public class MensajesClient {
	static herramientas h= new herramientas();
	// ------------------------------------
	// menu inicio
	public static void menuinicio() {
		System.out.println("+-----------------------------+");
		System.out.println("|    ~~Elige una opcion~~     |");
		System.out.println("+-----------------------------+");
		System.out.println("| 1-Modificar un cliente      |");
		System.out.println("+-----------------------------+");
		System.out.println("| 2-Anadir o eliminar cliente |");
		System.out.println("+-----------------------------+");
		System.out.println("| 3-Mostrar CLientes          |");
		System.out.println("+-----------------------------+");
		System.out.println("| 0-Salir                     |");
		System.out.println("+-----------------------------+");

	}

	// -------------------------------------------------
	// insertar datos
	public static void pedidodni() {
		System.out.println("+------------------------------------+");
		System.out.println("|  ~~Introduzca el dni del cliente~~ |");
		System.out.println("+------------------------------------+");
	}

	// ------------------------------------
	// menu editar
	public static void menueditar() {
		System.out.println("+-----------------------+");
		System.out.println("|  ~~Elige una opcion~~ |");
		System.out.println("+-----------------------+");
		System.out.println("| 1-Modificar nombre    |");
		System.out.println("+-----------------------+");
		System.out.println("| 2-Modificar dni       |");
		System.out.println("+-----------------------+");
		System.out.println("| 3-Modificar edad      |");
		System.out.println("+-----------------------+");
		System.out.println("| 4-Modificar puntos    |");
		System.out.println("+-----------------------+");
		System.out.println("| 5-Modificar direccion |");
		System.out.println("+-----------------------+");
		System.out.println("| 0-Salir               |");
		System.out.println("+-----------------------+");
	}

	public static void insertardni() {
		System.out.println("+---------------------------+");
		System.out.println("| Inserte el Dni del cliente|");
		System.out.println("+---------------------------+");
	}

	// ------------------------------------
	// menu añadir o eliminar
	public static void menuAddOrRemove() {

		System.out.println("+--------------------+");
		System.out.println("| Elige una opcion   |");
		System.out.println("+--------------------+");
		System.out.println("| 1-Anadir cliente   |");
		System.out.println("+--------------------+");
		System.out.println("| 2-Eliminar cliente |");
		System.out.println("+--------------------+");
		System.out.println("| 0-Salir            |");
		System.out.println("+--------------------+");
	}

	public static void insertardatos() {
		System.out.println("+-----------------------------------------------+");
		System.out.println("| Por favor inserte los datos del nuevo cliente |");
		System.out.println("+-----------------------------------------------+");
	}

	public static void dni() {
		System.out.println("+----------------+");
		System.out.println("| Inserte el DNI |");
		System.out.println("+----------------+");
	}

	public static void nombre() {
		System.out.println("+-------------------+");
		System.out.println("| Inserte el nombre |");
		System.out.println("+-------------------+");
	}

	public static void edad() {
		System.out.println("+-----------------+");
		System.out.println("| Inserte la edad |");
		System.out.println("+-----------------+");
	}

	public static void direcciones() {
		System.out.println("+----------------------+");
		System.out.println("| Inserte la direccion |");
		System.out.println("+----------------------+");
	}
	public static void continuar() {
		System.out.println("+--------------------------------------+");
		System.out.println("| ¿Desea anadir mas direcciones? Si/no |");
		System.out.println("+--------------------------------------+");
	}

	// ------------------------------------
	// menu mostrar
	public static void menumostrar() {
		System.out.println("+------------------------------+");
		System.out.println("|     ~~Elige una opcion~~     |");
		System.out.println("+------------------------------+");
		System.out.println("| 1-Mostrar todos los clientes |");
		System.out.println("+------------------------------+");
		System.out.println("| 2-Mostrar cliente por Dni    |");
		System.out.println("+------------------------------+");
		System.out.println("| 0-Salir                      |");
		System.out.println("+------------------------------+");
	}
	public static void buscarpordni() {
		System.out.println("+-----------------------------+");
		System.out.println("| Inserte el DNI del cliente  |");
		System.out.println("+-----------------------------+");
	}
	// ------------------------------------
	public static void salida() {
		h.Salida();
	}
	//--------------------------------------------
	public static void insertdata() {
		System.out.println("+-----------------------+");
		System.out.println("| Inserte el nuevo dato |");
		System.out.println("+-----------------------+");
	}
}
