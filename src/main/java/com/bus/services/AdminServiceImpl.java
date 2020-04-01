package com.bus.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.bus.dao.AdminServiceDao;
import com.bus.dao.CustomerServiceDao;
import com.bus.models.BusInformation;
import com.bus.models.BusTypes;
import com.bus.models.Customer;
import com.bus.models.RouteInformation;
import com.bus.models.Ticket;
@Component
@Service("CustomerService")
public class AdminServiceImpl implements AdminService{
	@Autowired
	AdminServiceDao adminserviceDao;
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
