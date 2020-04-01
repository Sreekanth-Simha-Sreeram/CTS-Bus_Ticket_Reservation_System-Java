package com.bus.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="BusTypes")

public class BusTypes {
	@Id
	   @Column(name="busType")
	   @GeneratedValue(strategy=GenerationType.IDENTITY)	
    String busType;
	

	@Column(name="maxSeats")
    int maxSeats;
	
	
public String getBusType() {
	return busType;
}
public void setBusType(String busType) {
	this.busType = busType;
}
public int getMaxSeats() {
	return maxSeats;
}
public void setMaxSeats(int maxSeats) {
	this.maxSeats = maxSeats;
}
 
}
