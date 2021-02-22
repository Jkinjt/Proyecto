package Order;

import java.time.LocalDate;
import java.time.LocalDateTime;

import client.Client;

public interface IMaincontrollerOrder {
	public Order newOrder(Client c, LocalDateTime id) ; 
	
	public Order Changerorder(Client c);
	
	public Order Changerorder(LocalDate d);
	
	public Order Changerorder(Client c, LocalDate d);
	
	public void DeleteOrder(Client c);
	
	public void DeleteOrder(LocalDate d);
	
	public void DeleteOrder(Client c, LocalDate d);
	
	public int Cashtoday();
	
	public int CashThisMonth();
	
	public int CashTotal();
	
	public Order ViewOrdersNotPayed();
	
	public Order VierOrdersPendingDelivered();
	
	public void SaveAllAndClose();
}
