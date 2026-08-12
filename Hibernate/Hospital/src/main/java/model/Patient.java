package model;

import java.util.LinkedList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Patient {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String gender;
	private String disease;
	
	@ManyToOne
	Ward ward=new Ward();
	
	@OneToMany(mappedBy = "patient")
	List<Bill> bill=new LinkedList<>();
	
	public Ward getWard() {
		return ward;
	}
	public void setWard(Ward ward) {
		this.ward = ward;
	}
	@Override
	public String toString() {
		return "Patient [id=" + id + ", name=" + name + ", gender=" + gender + ", disease=" + disease + "]";
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDisease() {
		return disease;
	}
	public void setDisease(String disease) {
		this.disease = disease;
	}
}
