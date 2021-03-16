package repositoryUtils;


import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class herramientas {

	private static Scanner teclado = new Scanner(System.in);
/**
 * escribe cualquier objeto
 * @param f
 */
	public static void imprimir(Object f) {
		System.out.println(f);
	}
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
	 * @return devuelve el entero le√≠do
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
	public static double doublecontrol() {
		double result = 0;
		boolean valid = false;
		do {
			try {
				result = Integer.parseInt(teclado.nextLine());
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
	/**
	 * mensaje mostrado cuando se esta cargando un listado
	 */
	public static void cargando() {
		int temporizador=0;
		System.out.println("+-------------------+");
		System.out.print(  "| CARGANDO: ");
		do {
			try {
				Thread.sleep(350);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}System.out.print(".");
			temporizador++;
		} while (temporizador!=7);
		
		try {
			Thread.sleep(350);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}System.out.print(" |\n");
		
		System.out.println("+-------------------+"+"\n");
	}
	/**
	 * mensaje de salida
	 */
	public static void Salida() {
		int temporizador=0;
		System.out.println("+-------------------+");
		System.out.print(  "| Saliendo ");
		do {
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}System.out.print(".");
			temporizador++;
		} while (temporizador!=8);
		
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}System.out.print(" |\n");
		
		System.out.println("+-------------------+"+"\n");
	}
	
	public static String ageControl() {
		String r="";
		boolean valid=false;
		do {
			Pattern p=Pattern.compile("^[1-9]{2}?[0-2]$");
			Matcher m=p.matcher(r);
			if(m.matches()) {
				System.out.println("Edad v·lida");
			}else{
				System.out.println("La edad introducida no es correcta");
			}	
		}while(!valid);
	 
		
		return r;
	}
	
	
	public static String nameControl() {
		String result = "";
		boolean valid = false;
		do {
			try {
				result = teclado.nextLine();
				valid = true;

			} catch (Exception ex) {
				herramientas.imprimirconintro("+----------------------------------------------+");
				herramientas.imprimirconintro("| Error desconocido , inserte un nombre valido |");
				herramientas.imprimirconintro("+----------------------------------------------+");
			}
		} while (!valid);
		return result;
	}
	
	public static double priceControl() {
		
		
		double result = 0.0;
		
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
				herramientas.imprimirconintro("| Error de lectura, introduzca dos decimales |");
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
}
