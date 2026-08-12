package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Bill {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String description;
	private double amount;
	private String status;
	
	@ManyToOne
	Patient patient=new Patient();
	
	@ManyToOne
	Receptionist receptionist=new Receptionist();
	
	public Receptionist getReceptionist() {
		return receptionist;
	}
	public void setReceptionist(Receptionist receptionist) {
		this.receptionist = receptionist;
	}
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	@Override
	public String toString() {
		return "Bill [id=" + id + ", description=" + description + ", amount=" + amount + ", status=" + status + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}
