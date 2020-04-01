package com.bus.dao;

import com.bus.models.BusInformation;
import com.bus.models.BusTypes;
import com.bus.models.Customer;
import com.bus.models.RouteInformation;
import com.bus.models.Ticket;

public interface AdminServiceDao {
	boolean addNewBus(BusInformation bus);
	boolean addNewRoute(RouteInformation route);
	boolean schedleBus(BusInformation bus,Customer customer);
	boolean addNewBusTypes(BusTypes bus);
	int refundAmountForCancelTicket(Ticket ticket,Customer customer);
	boolean BookTicket(Ticket ticket,Customer customer);
	boolean updateTicket(Ticket ticket);
	boolean cancelTicket(Ticket ticket);
	boolean updateProfile(String customerId);
}
