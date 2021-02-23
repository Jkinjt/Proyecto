package mainmenucontroller;

import java.time.LocalDate;
import java.time.LocalDateTime;

import Order.Order;
import client.Client;

public class MainControllerOrder implements IMaincontrollerOrder {

	@Override
	public Order newOrder(Client c, LocalDateTime id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Order Changerorder(Client c) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Order Changerorder(LocalDate d) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Order Changerorder(Client c, LocalDate d) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void DeleteOrder(Client c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void DeleteOrder(LocalDate d) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void DeleteOrder(Client c, LocalDate d) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int Cashtoday() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int CashThisMonth() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int CashTotal() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Order ViewOrdersNotPayed() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Order VierOrdersPendingDelivered() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void SaveAllAndClose() {
		// TODO Auto-generated method stub
		
	}

}
