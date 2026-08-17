
package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class NaturalRemedy {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String description;
	private String SourceReference;
	private boolean isVerified;
	private String disclaimer;
	
	@ManyToOne
	Disease disease=new Disease();
	
	@Override
	public String toString() {
		return "NaturalRemedy [id=" + id + ", name=" + name + ", description=" + description + ", SourceReference="
				+ SourceReference + ", isVerified=" + isVerified + ", disclaimer=" + disclaimer + "]";
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getSourceReference() {
		return SourceReference;
	}
	public void setSourceReference(String sourceReference) {
		SourceReference = sourceReference;
	}
	public boolean isVerified() {
		return isVerified;
	}
	public void setVerified(boolean isVerified) {
		this.isVerified = isVerified;
	}
	public String getDisclaimer() {
		return disclaimer;
	}
	public void setDisclaimer(String disclaimer) {
		this.disclaimer = disclaimer;
	}
}
