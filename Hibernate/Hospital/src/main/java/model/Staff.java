package model;

import java.util.LinkedList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Staff {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String gender;
	private String type;
	private String phoneno;
	
	@ManyToMany
	private List<Ward> ward=new LinkedList<>();
	
	public List<Ward> getWard() {
		return ward;
	}
	public void setWard(List<Ward> ward) {
		this.ward = ward;
	}
	@Override
	public String toString() {
		return "Staff [id=" + id + ", name=" + name + ", gender=" + gender + ", type=" + type + ", phoneno=" + phoneno
				+ "]";
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
}
