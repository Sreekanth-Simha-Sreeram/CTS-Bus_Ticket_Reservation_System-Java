package com.bus.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="RouteInformation")

public class RouteInformation {
	
	@Id
	   @Column(name="routeId")
	   @GeneratedValue(strategy=GenerationType.IDENTITY)	
		String routeId;
	
	 @Column(name="from")
	 String from;
	
	 @Column(name="to")
	 String to;
	 
	 @Column(name="cost")
	 int cost;
	 
public String getRouteId() {
	return routeId;
}
public void setRouteId(String routeId) {
	this.routeId = routeId;
}
public String getFrom() {
	return from;
}
public void setFrom(String from) {
	this.from = from;
}
public String getTo() {
	return to;
}
public void setTo(String to) {
	this.to = to;
}
public int getCost() {
	return cost;
}
public void setCost(int cost) {
	this.cost = cost;
}

}
