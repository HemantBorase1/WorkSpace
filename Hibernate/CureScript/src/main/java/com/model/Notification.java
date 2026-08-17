package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Notification {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String msg;
	private String sendAt;
	
	@ManyToOne
	User user=new User();
	
	@Override
	public String toString() {
		return "Notification [id=" + id + ", msg=" + msg + ", sendAt=" + sendAt + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getSendAt() {
		return sendAt;
	}
	public void setSendAt(String sendAt) {
		this.sendAt = sendAt;
	}
}
