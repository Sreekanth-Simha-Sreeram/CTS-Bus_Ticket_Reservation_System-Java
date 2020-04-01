package com.bus.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="BusInformation")

public class BusInformation {
	
	 @Id
	   @Column(name="busId")
	   @GeneratedValue(strategy=GenerationType.IDENTITY)	
     String busId;
	
	 @Column(name="busName")
     String busName;
	 
	 @Column(name="busType")
    String busType;
	 
	 @Column(name="capacity")
      int capacity;
 
public String getBusId() {
	return busId;
}
public void setBusId(String busId) {
	this.busId = busId;
}
public String getBusName() {
	return busName;
}
public void setBusName(String busName) {
	this.busName = busName;
}
public String getBusType() {
	return busType;
}
public void setBusType(String busType) {
	this.busType = busType;
}
public int getCapacity() {
	return capacity;
}
public void setCapacity(int capacity) {
	this.capacity = capacity;
}
 
 
}
