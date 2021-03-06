package com.bus.dao;

import com.bus.models.Customer;
import com.bus.models.Ticket;

public interface CustomerServiceDao {
	boolean signUp(Customer customer);
	boolean signIn(String name,String password);
	boolean signOut(String customerId);
	boolean changePassword(String password);
	Customer getCustomer(String customerId);
	boolean bookTicket(Ticket ticket);
	boolean updateTicket(Ticket ticket);
	boolean cancelTicket(Ticket ticket);

}
