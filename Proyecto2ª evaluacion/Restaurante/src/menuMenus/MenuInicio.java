package menuMenus;

import mesage.MensajesMenuInicio;
import repositoryUtils.herramientas;

public class MenuInicio {
	
	static herramientas h=new herramientas();
	static MensajesMenuInicio m= new MensajesMenuInicio();
	static menuClientes ci=new menuClientes();
	static menuProductos p= new menuProductos();
	static menuOrdenes o= new menuOrdenes();
	public static void MenuInicio() {
		int opcion=-1;
		do {
			m.MainMenu();
			opcion=h.intcontrol();
			switch (opcion) {
			case 1:
				//carrito
				m.cargando();
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				break;
			case 2:
				//menu clientes
				m.cargando();
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
				ci.MenuPrincipal();
				break;
			case 3:
				//menu productos
				m.cargando();
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				p.menuInicio();
				break;
			case 4:
				//menu ordenes
				m.cargando();
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				o.menuprincipal();
				break;
			case 0:
				try {
					Thread.sleep(400);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				m.Salida();
				break;
				
			default:
				break;
			}
		}while(opcion!=0);
	}
}
