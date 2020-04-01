package com.bus.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="SeatAvailability")
public class SeatAvailability {
	
	 @Id
	   @Column(name="scheduleId")
	   @GeneratedValue(strategy=GenerationType.IDENTITY)
String scheduleId;
	 
	 @Column(name="dateOfJourney")
     Date dateOfJourney;
	 
	 @Column(name="availableSeats")
     int availableSeats;
	 
public String getScheduleId() {
	return scheduleId;
}
public void setScheduleId(String scheduleId) {
	this.scheduleId = scheduleId;
}
public Date getDateOfJourney() {
	return dateOfJourney;
}
public void setDateOfJourney(Date dateOfJourney) {
	this.dateOfJourney = dateOfJourney;
}
public int getAvailableSeats() {
	return availableSeats;
}
public void setAvailableSeats(int availableSeats) {
	this.availableSeats = availableSeats;
}

}
