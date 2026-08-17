package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class OCRResult {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String text;
	private float confidenceScore;
	private String processedAt;
	
	@OneToOne
	private Prescription prescription;
	
	@Override
	public String toString() {
		return "OCRResult [id=" + id + ", text=" + text + ", confidenceScore=" + confidenceScore + ", processedAt="
				+ processedAt + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public float getConfidenceScore() {
		return confidenceScore;
	}
	public void setConfidenceScore(float confidenceScore) {
		this.confidenceScore = confidenceScore;
	}
	public String getProcessedAt() {
		return processedAt;
	}
	public void setProcessedAt(String processedAt) {
		this.processedAt = processedAt;
	}
}
