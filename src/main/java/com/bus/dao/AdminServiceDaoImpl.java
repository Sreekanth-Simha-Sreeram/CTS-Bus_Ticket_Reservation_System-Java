package com.bus.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bus.models.BusInformation;
import com.bus.models.BusTypes;
import com.bus.models.Customer;
import com.bus.models.RouteInformation;
import com.bus.models.Ticket;
@Component
public class AdminServiceDaoImpl implements AdminServiceDao {
	@Autowired
	SessionFactory sessionfactory;

	public boolean addNewBus(BusInformation bus) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean addNewRoute(RouteInformation route) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean schedleBus(BusInformation bus, Customer customer) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean addNewBusTypes(BusTypes bus) {
		// TODO Auto-generated method stub
		return false;
	}

	public int refundAmountForCancelTicket(Ticket ticket, Customer customer) {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean BookTicket(Ticket ticket, Customer customer) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean updateTicket(Ticket ticket) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean cancelTicket(Ticket ticket) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean updateProfile(String customerId) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}
