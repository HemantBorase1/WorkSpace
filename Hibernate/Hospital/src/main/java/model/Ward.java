package model;

import java.util.LinkedList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Ward {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String type;

    @OneToMany(mappedBy = "ward")
    private List<Doctor> doctors = new LinkedList<>();

    @OneToMany(mappedBy = "ward")
    private List<Bed> beds = new LinkedList<>();

    @OneToMany(mappedBy = "ward")
    private List<Patient> patient=new LinkedList();
    
    @ManyToMany(mappedBy = "ward")
    private List<Staff> staff=new LinkedList<>();
    
    
    public List<Staff> getStaff() {
		return staff;
	}

	public void setStaff(List<Staff> staff) {
		this.staff = staff;
	}

	public List<Doctor> getDoctors() {
		return doctors;
	}

	public void setDoctors(List<Doctor> doctors) {
		this.doctors = doctors;
	}

	public List<Patient> getPatient() {
		return patient;
	}

	public void setPatient(List<Patient> patient) {
		this.patient = patient;
	}

	@Override
    public String toString() {
        return "Ward [id=" + id + ", name=" + name + ", type=" + type + "]";
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

    public List<Bed> getBeds() {
        return beds;
    }

    public void setBeds(List<Bed> beds) {
        this.beds = beds;
    }
}