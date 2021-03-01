package menuMenus;

public class MensajesClient {
	//------------------------------------
	//menu inicio
	public static void menuinicio() {
		System.out.println("+-----------------------------+");
		System.out.println("|    ~~Elige una opcion~~     |");
		System.out.println("+-----------------------------+");
		System.out.println("| 1-Modificar un cliente      |");
		System.out.println("+-----------------------------+");	
		System.out.println("| 2-Añadir o eliminar cliente |");
		System.out.println("+-----------------------------+");
		System.out.println("| 3-Mostrar CLientes          |");
		System.out.println("+-----------------------------+");
		System.out.println("| 0-Salir                     |");
		System.out.println("+-----------------------------+");
		
	}
	//------------------------------------
	//menu editar
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
	//------------------------------------
	//menu añadir o eliminar
	public static void menuAddOrRemove() {
		
		System.out.println("+--------------------+");
		System.out.println("| Elige una opcion   |");
		System.out.println("+--------------------+");
		System.out.println("| 1-Añadir cliente   |");
		System.out.println("+--------------------+");
		System.out.println("| 2-Eliminar cliente |");
		System.out.println("+--------------------+");
		System.out.println("| 0-Salir            |");
		System.out.println("+--------------------+");
	}
	
	//------------------------------------
	//menu mostrar
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
	//------------------------------------
	public static void salida() {
		System.out.println("+------------+");
		System.out.println("| ~SALIENDO~ |");
		System.out.println("+------------+");
	}
}
