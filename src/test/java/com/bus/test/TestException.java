package com.bus.test;

import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bus.common.InvalidCredentials;
import com.bus.common.UserAlreadyExistException;
import com.bus.common.UserDoesNotExistException;
import com.bus.models.Customer;
import com.bus.services.CustomerService;

import junit.framework.Assert;

public class TestException {
	@Test
    public void testForUserRegistration() throws UserAlreadyExistException 
    {
	 ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("couponbank-application.xml");
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

	 CustomerService customerservice = (CustomerService) context.getBean("CustomerService");
	 customerservice.signUp(customer);
Assert.assertEquals(UserAlreadyExistException.message," user already exists !..please login");
    }
	
	@Test
    public void testForUserLogin() throws UserDoesNotExistException  
    {
		
	 ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("couponbank-application.xml");
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
     CustomerService customerservice = (CustomerService) context.getBean("CustomerService");
     customerservice.signIn(customer.getName(),customer.getPassword());
Assert.assertEquals(UserDoesNotExistException.message," user does not exists !..please register");
     }
	@Test
    public void testForvalidpassword() throws InvalidCredentials  
    {
		
	 ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("couponbank-application.xml");
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
     CustomerService customerservice = (CustomerService) context.getBean("CustomerService");
     customerservice.signIn(customer.getName(),customer.getPassword());
Assert.assertEquals(InvalidCredentials.message,"please enter valid email and password");
     }
	@Test
    public void testForvalidname() throws InvalidCredentials  
    {
		
	 ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("couponbank-application.xml");
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
     CustomerService customerservice = (CustomerService) context.getBean("CustomerService");
     customerservice.signIn(customer.getName(),customer.getPassword());
Assert.assertEquals(InvalidCredentials.message,"please enter valid email and password");
     }
	
}
