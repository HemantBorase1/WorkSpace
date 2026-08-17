package com.model;

import java.util.LinkedList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Prescription {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String imageUrl;
	private String uploadedAt;
	private String status;
	private String doctorName;
	private String rawOcrText;
	
	@ManyToOne
	 User user=new User();
	
	@ManyToOne
	private Pharmacist pharmacist=new Pharmacist();
	
	@OneToOne
	private OCRResult ocrResult;
	
	@OneToMany(mappedBy = "prescription")
	List<Medicine> medicine=new LinkedList();
	
	
	@Override
	public String toString() {
		return "Prescription [id=" + id + ", imageUrl=" + imageUrl + ", uploadedAt=" + uploadedAt + ", status=" + status
				+ ", doctorName=" + doctorName + ", rawOcrText=" + rawOcrText + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public String getUploadedAt() {
		return uploadedAt;
	}
	public void setUploadedAt(String uploadedAt) {
		this.uploadedAt = uploadedAt;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public String getRawOcrText() {
		return rawOcrText;
	}
	public void setRawOcrText(String rawOcrText) {
		this.rawOcrText = rawOcrText;
	}
}
