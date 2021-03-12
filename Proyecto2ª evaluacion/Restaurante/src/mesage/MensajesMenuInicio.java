package mesage;

public class MensajesMenuInicio {
	public static void MainMenu() {
		System.out.println("+-------------------------+");
		System.out.println("| 1-Realizar Pedido       |");
		System.out.println("+-------------------------+");
		System.out.println("| 2-Administrar Clientes  |");
		System.out.println("+-------------------------+");
		System.out.println("| 3-Administrar Productos |");
		System.out.println("+-------------------------+");
		System.out.println("| 4-Administrar Ordenes   |");
		System.out.println("+-------------------------+");
		System.out.println("| 0-Cerrar Programa       |");
		System.out.println("+-------------------------+");


		
	}
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
	
	public static void Salida() {
		int temporizador=0;
		System.out.println("+-------------------+");
		System.out.print(  "| Saliendo ");
		do {
			try {
				Thread.sleep(350);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}System.out.print(".");
			temporizador++;
		} while (temporizador!=8);
		
		try {
			Thread.sleep(350);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}System.out.print(" |\n");
		
		System.out.println("+-------------------+"+"\n");
	}
}
