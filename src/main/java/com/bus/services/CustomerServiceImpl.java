package com.bus.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.bus.dao.AdminServiceDao;
import com.bus.dao.CustomerServiceDao;
import com.bus.models.Customer;
import com.bus.models.Ticket;

@Component
@Service("CustomerService")
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	CustomerServiceDao customerserviceDao;
	@Transactional
	public boolean signUp(Customer customer) {
		// TODO Auto-generated method stub
		return false;
	}

	@Transactional
	public boolean signIn(String name, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	@Transactional
	public boolean signOut(String customerId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Transactional
	public boolean changePassword(String password) {
		// TODO Auto-generated method stub
		return false;
	}

	@Transactional
	public Customer getCustomer(String customerId) {
		// TODO Auto-generated method stub
		return null;
	}
	@Transactional
	public boolean bookTicket(Ticket ticket) {
		// TODO Auto-generated method stub
		return false;
	}
	@Transactional
	public boolean updateTicket(Ticket ticket) {
		// TODO Auto-generated method stub
		return false;
	}
	@Transactional
	public boolean cancelTicket(Ticket ticket) {
		// TODO Auto-generated method stub
		return false;
	}

}
