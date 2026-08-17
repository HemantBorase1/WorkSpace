package com.model;

import java.util.LinkedList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Medicine {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String freqency;
	private String duration;
	private String genericName;
	
	@ManyToOne
	Prescription prescription=new Prescription();
	
	@ManyToMany
	List<Disease> disease=new LinkedList();
	
	@OneToMany(mappedBy = "medicine")
	List<PriceListing> pricelisting=new LinkedList();
	
	@Override
	public String toString() {
		return "Medicine [id=" + id + ", name=" + name + ", freqency=" + freqency + ", duration=" + duration
				+ ", genericName=" + genericName + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFreqency() {
		return freqency;
	}
	public void setFreqency(String freqency) {
		this.freqency = freqency;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getGenericName() {
		return genericName;
	}
	public void setGenericName(String genericName) {
		this.genericName = genericName;
	}
}
