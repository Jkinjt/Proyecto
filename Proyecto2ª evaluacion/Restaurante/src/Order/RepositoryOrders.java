package Order;

public class RepositoryOrders {
	//es mejor una lista
	Order order[];
//las mayusculas al inicio de cada palabra
	public void getallorder() {
		if (order!=null) {
			for (int i = 0; i < order.length; i++) {
				System.out.println(order[i]);
			}	
		}
	}
	//devolver una lista
	public Order getOrdersByClient(String dni) {
		
		Order result=null;
		if(dni!=null &&  order!=null) {
			for (int i = 0; i < order.length  &&  result==null; i++) {
				//si pones equalsIgnoreCase no distingue mayusculas de minusculas
				if(this.order[i].getClient().getDni().equals(dni)) {
					result=order[i];
				}
			}
		}
		return result;
	}
	//Te tine que devolver una lista de ordenes y ¿Pasarle un LocalDateTime?

	public void getOrdersByDate(String date) {
		Order result[]=null;
		if(date!=null &&  order!=null) {
			for (int i = 0; i < order.length ; i++) {
				if(this.order[i].getDate().equals(date)) {
					result[i]=order[i];
				}
			}
		}
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}

	}
	//devolver una lista de ordenes
	public void getOrdersNoDelivered(){
		Order result[]=null;
		if( order!=null) {
			for (int i = 0; i < order.length ; i++) {
				if(this.order[i].isDelivered()==false) {
					result[i]=order[i];
				}
			}
		}
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
	//devolver una orden una lista
	public void getOrdersNoPayed() {
		Order result[]=null;
		if  (order!=null) {
			for (int i = 0; i < order.length; i++) {
				if(this.order[i].isPayed()==false) {
					result[i]=order[i];
				}
			}
		}
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
	
	//dovelver una lista de ordenes
	
	//mostrar todos los pedidos pagados
	public void AllInput() {
		if(order!=null) {
			for (int i = 0; i < order.length; i++) {
				if(order[i].isPayed()==true ) {
					System.out.println(order[i]);
				}
			}
		}
		
	}
	
	//devolver una lista de ordenes
	
	//mostrar todos los pedidos entre dos fechas
	public void getInputByDate(LocalDateTime ini, LocalDateTime end) {
		if(order!=null) {
			for (int i = 0; i < order.length; i++) {
				if((order[i].getDate().isBefore(end) || order[i].getDate().isAfter(ini)) && order[i].isPayed()==true ) {
					System.out.println(order[i]);
				}
			}
		}
	}
}
