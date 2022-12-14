package com.infinite.BookingProject;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="Room")
public class Room {

	
	
	@Id
	@Column(name="RoomId")
	private String RoomId;
	
	@Column(name="Type")
	private String  type;
	
	@Enumerated(EnumType.STRING)
	@Column(name="status")
	private Status status ;
	
	@Column(name="CostPerDay")
	private int costPerDay;
	
	
	public String getRoomId() {
		return RoomId;
	}


	public void setRoomId(String roomId) {
		RoomId = roomId;
	}




	public Status getStatus() {
		return status;
	}


	public void setStatus(Status status) {
		this.status = status;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public int getCostPerDay() {
		return costPerDay;
	}


	public void setCostPerDay(int costPerDay) {
		this.costPerDay = costPerDay;
	}


	
	
}
