package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Booking {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String CheckIn;
	private String CheckOut;
	private String Status;
	@Override
	public String toString() {
		return "Booking [id=" + id + ", CheckIn=" + CheckIn + ", CheckOut=" + CheckOut + ", Status=" + Status + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCheckIn() {
		return CheckIn;
	}
	public void setCheckIn(String checkIn) {
		CheckIn = checkIn;
	}
	public String getCheckOut() {
		return CheckOut;
	}
	public void setCheckOut(String checkOut) {
		CheckOut = checkOut;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
}
