package com.infinite.BookingProject;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Booking")
public class Booking {

@Id
@Column(name="bookId")
private String bookId;

@Column(name="roomId")
	private String roomId;
	
@Column(name="custName")
	private String custName;
	
@Column(name="city")
	private String city;
	
@Column(name="BookDate")
private Date BookDate;

@Column(name="ChkInDate")
private Date ChkInDate;

@Column(name="ChkOutDate")
private Date ChkOutDate;

@Override
public String toString() {
	return "Booking [bookId=" + bookId + ", roomId=" + roomId + ", custName=" + custName + ", city=" + city
			+ ", BookDate=" + BookDate + ", ChkInDate=" + ChkInDate + ", ChkOutDate=" + ChkOutDate + "]";
}

public Booking(String bookId, String roomId, String custName, String city, Date bookDate, Date chkInDate,
		Date chkOutDate) {
	super();
	this.bookId = bookId;
	this.roomId = roomId;
	this.custName = custName;
	this.city = city;
	BookDate = bookDate;
	ChkInDate = chkInDate;
	ChkOutDate = chkOutDate;
}

public Booking() {
	 
	// TODO Auto-generated constructor stub
}

public String getBookId() {
	return bookId;
}

public void setBookId(String bookId) {
	this.bookId = bookId;
}

public String getRoomId() {
	return roomId;
}

public void setRoomId(String roomId) {
	this.roomId = roomId;
}

public String getCustName() {
	return custName;
}

public void setCustName(String custName) {
	this.custName = custName;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public Date getBookDate() {
	return BookDate;
}

public void setBookDate(Date bookDate) {
	BookDate = bookDate;
}

public Date getChkInDate() {
	return ChkInDate;
}

public void setChkInDate(Date chkInDate) {
	ChkInDate = chkInDate;
}

public Date getChkOutDate() {
	return ChkOutDate;
}

public void setChkOutDate(Date chkOutDate) {
	ChkOutDate = chkOutDate;
}


 
	
}
