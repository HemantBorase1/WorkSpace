package com.model;

public class Address {

	private String line1;
	private String line2;
	private String City;
	private String State;
	@Override
	public String toString() {
		return "Address [line1=" + line1 + ", line2=" + line2 + ", City=" + City + ", State=" + State + "]";
	}
	public String getLine1() {
		return line1;
	}
	public void setLine1(String line1) {
		this.line1 = line1;
	}
	public String getLine2() {
		return line2;
	}
	public void setLine2(String line2) {
		this.line2 = line2;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
}
