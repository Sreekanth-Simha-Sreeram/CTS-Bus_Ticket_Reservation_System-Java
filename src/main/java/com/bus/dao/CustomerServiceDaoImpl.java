package com.bus.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bus.models.Customer;
import com.bus.models.Ticket;
@Component
public class CustomerServiceDaoImpl implements CustomerServiceDao {
	@Autowired
	SessionFactory sessionfactory;
	public boolean signUp(Customer customer) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean signIn(String name, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean signOut(String customerId) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean changePassword(String password) {
		// TODO Auto-generated method stub
		return false;
	}

	public Customer getCustomer(String customerId) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean bookTicket(Ticket ticket) {
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

}
