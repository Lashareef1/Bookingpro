package com.infinite.BookingProject;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Billing")
public class Billing {

	@Id
	@Column(name="bookId")
	private String bookId;
	
	@Column(name="roomId")
	private String roomId;
	
	@Column(name="NoOfDays")
	private int NoOfDays;
	
	@Column(name="BillAmt")
	private int BillAmt;

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

	public int getNoOfDays() {
		return NoOfDays;
	}

	public void setNoOfDays(int noOfDays) {
		NoOfDays = noOfDays;
	}

	public int getBillAmt() {
		return BillAmt;
	}

	public void setBillAmt(int billAmt) {
		BillAmt = billAmt;
	}

	@Override
	public String toString() {
		return "Billing [bookId=" + bookId + ", roomId=" + roomId + ", NoOfDays=" + NoOfDays + ", BillAmt=" + BillAmt
				+ "]";
	}

	public Billing(String bookId, String roomId, int noOfDays, int billAmt) {
		super();
		this.bookId = bookId;
		this.roomId = roomId;
		NoOfDays = noOfDays;
		BillAmt = billAmt;
	}

	public Billing() {
		super();
		// TODO Auto-generated constructor stub
	}
	

 
}
