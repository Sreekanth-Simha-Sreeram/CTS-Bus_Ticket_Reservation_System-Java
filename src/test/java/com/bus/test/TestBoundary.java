package com.bus.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.bus.models.Customer;
public class TestBoundary {
	 @Test
	    public void validPassword()
	    {
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
	        
	        		
	        int passwordLength=10;
	assertEquals(passwordLength,customer.getPassword().length());
}
	 
	 @Test
	    public void validPincode()
	    {
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
	        
	        		
	        int pincodeLength=6;
	        int getLengthOfPin=(Integer.toString(customer.getPincode()).length());
	    	assertEquals( pincodeLength, getLengthOfPin);
	}
	 @Test
	    public void validPhoneNumber()
	    {
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
	        int phoneNumberLength=10;
	        
	        
	        int getLengthOfNumber=(Integer.toString(customer.getPhoneNumber()).length());
	assertEquals( phoneNumberLength, getLengthOfNumber);
	    }
	 
	 @Test
	    public void validName()
	    {
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
	        int min=2;
	        boolean name=customer.getName().length()>min;
	        assertEquals(true,name);
	    }
	 
	 @Test
	    public void validEmail()
	    {
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
	        int min=2;
	        boolean contains=customer.getEmail().contentEquals("@gmail.com");
	        assertEquals(true,contains);
	    }

	 
}
