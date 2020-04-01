package com.bus.models;

import java.sql.Time;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name="Ticket")
public class Ticket {
	
	@Column(name="customerId")
String customerId;
	
	@Column(name="fromLocation")
String fromLocation;
	
	@Column(name="toLocation")
String toLocation;
	
	@Column(name="journeyDate")
Date journeyDate;
	
	@Column(name="journeyTime")
Time journeyTime;
	
	@Column(name="numberOfTickets")
int numberOfTickets;
	
	@Column(name="BusId")
String BusId;
	
	@Column(name="ticketCharge")
int ticketCharge;

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getFromLocation() {
		return fromLocation;
	}

	public void setFromLocation(String fromLocation) {
		this.fromLocation = fromLocation;
	}

	public String getToLocation() {
		return toLocation;
	}

	public void setToLocation(String toLocation) {
		this.toLocation = toLocation;
	}

	public Date getJourneyDate() {
		return journeyDate;
	}

	public void setJourneyDate(Date journeyDate) {
		this.journeyDate = journeyDate;
	}

	public Time getJourneyTime() {
		return journeyTime;
	}

	public void setJourneyTime(Time journeyTime) {
		this.journeyTime = journeyTime;
	}

	public int getNumberOfTickets() {
		return numberOfTickets;
	}

	public void setNumberOfTickets(int numberOfTickets) {
		this.numberOfTickets = numberOfTickets;
	}

	public String getBusId() {
		return BusId;
	}

	public void setBusId(String busId) {
		BusId = busId;
	}

	public int getTicketCharge() {
		return ticketCharge;
	}

	public void setTicketCharge(int ticketCharge) {
		this.ticketCharge = ticketCharge;
	}
	
}
