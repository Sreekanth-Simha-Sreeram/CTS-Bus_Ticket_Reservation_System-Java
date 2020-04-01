package com.bus.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
@Entity
@Table(name="Schedule")
public class Schedule {
	
	 @Id
	   @Column(name="scheduleId")
	   @GeneratedValue(strategy=GenerationType.IDENTITY)
	 String scheduleId;
	 
	 @Column(name="routId")
	 String routId;
	 
	 @Column(name="busId")
	 String busId;
	 
	 @Column(name="time")
	 Date time;
	 
public String getScheduleId() {
	return scheduleId;
}
public void setScheduleId(String scheduleId) {
	this.scheduleId = scheduleId;
}
public String getRoutId() {
	return routId;
}
public void setRoutId(String routId) {
	this.routId = routId;
}
public String getBusId() {
	return busId;
}
public void setBusId(String busId) {
	this.busId = busId;
}
public Date getTime() {
	return time;
}
public void setTime(Date time) {
	this.time = time;
}


}
