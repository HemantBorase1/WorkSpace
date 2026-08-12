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
public class Receptionist {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String type;
	
	@OneToMany(mappedBy = "receptionist")
	
	List<Bill> bill=new LinkedList<>();
	public List<Bill> getBill() {
		return bill;
	}
	public void setBill(List<Bill> bill) {
		this.bill = bill;
	}
	@Override
	public String toString() {
		return "Receptionist [id=" + id + ", name=" + name + ", type=" + type + "]";
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
}
