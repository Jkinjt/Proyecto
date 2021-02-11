package proyectosegundaevaulacion;

import java.util.Scanner;

public class herramientas {

	private static Scanner teclado = new Scanner(System.in);

	/**
	 * Escribe un texto en consola sin sin salto de linea
	 * 
	 * @param f texto a imprimir
	 */
	public static void imprimirsinintro(String f) {
		System.out.print(f);
	}

	/**
	 * Escribe un texto en consola con salto de linea
	 * 
	 * @param f texto a imprimir
	 */
	public static void imprimirconintro(String f) {
		herramientas.imprimirsinintro(f + "\n");
	}

	/**
	 * Lee un entero de teclado
	 * 
	 * @return devuelve el entero leído
	 */
	public static int intcontrol() {
		int result = 0;
		boolean valid = false;
		do {
			try {
				result = Integer.parseInt(teclado.nextLine());
				valid = true;

			} catch (IllegalStateException ex) {
				teclado = new Scanner(System.in);
				herramientas.imprimirconintro("+-------------------------------------+");
				herramientas.imprimirconintro("| Error, introduzca el valor de nuevo |");
				herramientas.imprimirconintro("+-------------------------------------+");
			} catch (NumberFormatException ex) {
				herramientas.imprimirconintro("+----------------------------------------+");
				herramientas.imprimirconintro("| Error de lectura, numero no reconocido |");
				herramientas.imprimirconintro("+----------------------------------------+");
			} catch (Exception ex) {
				ex.printStackTrace();
				herramientas.imprimirconintro("+-------------------------------------+");
				herramientas.imprimirconintro("| Error desconocido , pruebe otra vez |");
				herramientas.imprimirconintro("+-------------------------------------+");
			}
		} while (!valid);
		return result;
	}

	/**
	 * Lee un double de teclado
	 * 
	 * @return devuelve el double
	 */
	public static double getdouble() {
		double result = 0;
		boolean valid = false;
		do {
			try {
				result = teclado.nextDouble();
				valid = true;

			}  catch (IllegalStateException ex) {
				teclado = new Scanner(System.in);
				herramientas.imprimirconintro("+-------------------------------------+");
				herramientas.imprimirconintro("| Error, introduzca el valor de nuevo |");
				herramientas.imprimirconintro("+-------------------------------------+");
			} catch (NumberFormatException ex) {
				herramientas.imprimirconintro("+----------------------------------------+");
				herramientas.imprimirconintro("| Error de lectura, numero no reconocido |");
				herramientas.imprimirconintro("+----------------------------------------+");
			} catch (Exception ex) {
				ex.printStackTrace();
				herramientas.imprimirconintro("+-------------------------------------+");
				herramientas.imprimirconintro("| Error desconocido , pruebe otra vez |");
				herramientas.imprimirconintro("+-------------------------------------+");
			}
		} while (!valid);
		return result;
	}

	/**
	 * Lee un string de teclado
	 * 
	 * @return strint insertado por el usuario
	 */
	public static String stringcontrol() {
		String result = "";
		boolean valid = false;
		do {
			try {
				result = teclado.nextLine();
				valid = true;

			} catch (Exception ex) {
				herramientas.imprimirconintro("+-------------------------------------+");
				herramientas.imprimirconintro("| Error desconocido , pruebe otra vez |");
				herramientas.imprimirconintro("+-------------------------------------+");
			}
		} while (!valid);
		return result;
	}

}
