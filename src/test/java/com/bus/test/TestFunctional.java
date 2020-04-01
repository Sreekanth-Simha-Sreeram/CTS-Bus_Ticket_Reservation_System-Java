package com.bus.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bus.models.BusInformation;
import com.bus.models.BusTypes;
import com.bus.models.Customer;
import com.bus.models.RouteInformation;
import com.bus.models.Schedule;
import com.bus.models.Ticket;
import com.bus.services.AdminService;
import com.bus.services.CustomerService;

public class TestFunctional {
	@Test
	public void testvalidregistration() {
	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("cuponbank-application.xml");
    Customer customer=new Customer();
    customer.setName("jony");
    customer.setGender("female");
    customer.setCustomerId("A12");
    customer.setCustomerType("normal");
    customer.setCountry("India");
    customer.setEmail("james@gmail.com");
    customer.setPincode(577301);
    customer.setPassword("hello@1234");
    customer.setPhoneNumber(1234567890);
    
String isRegistered=(customer.getName());
	

	CustomerService customerservice=(CustomerService) context.getBean("CustomerService");
	boolean registration =customerservice.signUp(customer);
	assertEquals(isRegistered,registration);
}
	@Test
	public void tesForValidLogin() {
	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("cuponbank-application.xml");
	 Customer customer=new Customer();
	    customer.setName("jony");
	    customer.setGender("female");
	    customer.setCustomerId("A12");
	    customer.setCustomerType("normal");
	    customer.setCountry("India");
	    customer.setEmail("james@gmail.com");
	    customer.setPincode(577301);
	    customer.setPassword("hello@1234");
	    customer.setPhoneNumber(1234567890);
	    CustomerService customerservice=(CustomerService) context.getBean("CustomerService");
	boolean userdetailsfromdb=customerservice.signIn(customer.getName(), customer.getPassword());
	assertEquals(true,userdetailsfromdb);
}

	@Test
	public void tesForValidAddNewBus() {
	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("cuponbank-application.xml");
	 BusInformation bus=new BusInformation();
	 bus.setBusId("b1");
	 bus.setBusName("srs");
	 bus.setBusType("AC");
	 	 bus.setCapacity(34);
	    AdminService adminservice=(AdminService) context.getBean("AdminService");
	boolean added=adminservice.addNewBus(bus);
	assertEquals(true,added);
}
	
	@Test
	public void tesForValidAddNewBusTypes() {
	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("cuponbank-application.xml");
	 BusTypes b=new BusTypes();
	 b.setBusType("Ac");
	 b.setMaxSeats(23);
	    AdminService adminservice=(AdminService) context.getBean("AdminService");
	boolean added=adminservice.addNewBusTypes(b);
	assertEquals(true,added);
}
	@Test
	public void tesForValidAddNewRoute() {
	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("cuponbank-application.xml");
	 RouteInformation route=new RouteInformation();
	 route.setCost(1245);
	 route.setFrom("manglore");
	 route.setRouteId("r1");
	 route.setTo("banglore");
	    AdminService adminservice=(AdminService) context.getBean("AdminService");
	boolean added=adminservice.addNewRoute(route);
	assertEquals(true,added);
}
	@Test
	public void tesForValidBusSchedule() {
	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("cuponbank-application.xml");
	BusInformation bus=new BusInformation();
	 bus.setBusId("b1");
	 bus.setBusName("srs");
	 bus.setBusType("AC");
	 	 bus.setCapacity(34);
	 	 Customer customer=new Customer();
	     customer.setName("jony");
	     customer.setGender("female");
	     customer.setCustomerId("A12");
	     customer.setCustomerType("normal");
	     customer.setCountry("India");
	     customer.setEmail("james@gmail.com");
	     customer.setPincode(577301);
	     customer.setPassword("hello@1234");
	     customer.setPhoneNumber(1234567890);
	     
	 
	    AdminService adminservice=(AdminService) context.getBean("AdminService");
	boolean added=adminservice.schedleBus(bus, customer);
	assertEquals(true,added);
}
	@Test
	public void tesForBookTicket() {
	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("cuponbank-application.xml");
	
	 	 Ticket t=new Ticket();
	 	 t.setCustomerId("C1");
	 	 t.setBusId("b12");
	 	 t.setCustomerId("c12");
	 	 t.setFromLocation("banglore");
	 	 t.setToLocation("manglore");
	 	 
	 	 Customer customer=new Customer();
	     customer.setName("jony");
	     customer.setGender("female");
	     customer.setCustomerId("A12");
	     customer.setCustomerType("normal");
	     customer.setCountry("India");
	     customer.setEmail("james@gmail.com");
	     customer.setPincode(577301);
	     customer.setPassword("hello@1234");
	     customer.setPhoneNumber(1234567890);
	    
	 
	    AdminService adminservice=(AdminService) context.getBean("AdminService");
	boolean added=adminservice.BookTicket(t, customer);
	assertEquals(true,added);
}
	@Test
	public void tesForCancelTicket() {
	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("cuponbank-application.xml");
	
	 	 Ticket t=new Ticket();
	 	 t.setCustomerId("C1");
	 	 t.setBusId("b12");
	 	 t.setCustomerId("c12");
	 	 t.setFromLocation("banglore");
	 	 t.setToLocation("manglore");

		    AdminService adminservice=(AdminService) context.getBean("AdminService");
		boolean added=adminservice.cancelTicket(t);
		assertEquals(true,added);
	}
	@Test
	public void tesForUpdateTicket() {
	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("cuponbank-application.xml");
	
	 	 Ticket t=new Ticket();
	 	 t.setCustomerId("C1");
	 	 t.setBusId("b12");
	 	 t.setCustomerId("c12");
	 	 t.setFromLocation("banglore");
	 	 t.setToLocation("manglore");

		    AdminService adminservice=(AdminService) context.getBean("AdminService");
		boolean added=adminservice.updateTicket(t);
		assertEquals(true,added);
	}
	@Test
	public void tesForUpdateProfile() {
	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("cuponbank-application.xml");
	 Customer customer=new Customer();
     customer.setName("jony");
     customer.setGender("female");
     customer.setCustomerId("A12");
     customer.setCustomerType("normal");
     customer.setCountry("India");
     customer.setEmail("james@gmail.com");
     customer.setPincode(577301);
     customer.setPassword("hello@1234");
     customer.setPhoneNumber(1234567890);

	 	 
		    AdminService adminservice=(AdminService) context.getBean("AdminService");
		boolean updated=adminservice.updateProfile(customer.getCustomerId());
		assertEquals(true,updated);
	}

}
