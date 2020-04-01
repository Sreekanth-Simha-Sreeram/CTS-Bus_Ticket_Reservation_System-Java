package com.bus.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name="CustomerTypes")
public class CustomerTypes {
	
	 @Column(name="customerType")
	 String customerType;
	 
	 @Column(name="priority")
	 String priority;
	 
	 @Column(name="weightage")
	 String weightage;
	 
	public String getCustomerType() {
		return customerType;
	}
	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	public String getWeightage() {
		return weightage;
	}
	public void setWeightage(String weightage) {
		this.weightage = weightage;
	}
	
	
}
