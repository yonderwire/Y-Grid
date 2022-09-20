package com.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "primary_staff")
public class PrimaryStaff{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="primary_id")
	private int primaryId;
	@Column(name="producers")
	private String producers;
	@OneToOne
    @PrimaryKeyJoinColumn(name = "primary_id")
    Staff staff;
	
	public PrimaryStaff() {
		super();
	}
	

	public PrimaryStaff(int primaryId, String producers) {
		super();
		this.primaryId = primaryId;
		this.producers = producers;
	}

	public int getPrimaryId() {
		return primaryId;
	}

	public void setPrimaryId(int primaryId) {
		this.primaryId = primaryId;
	}

	public String getProducers() {
		return producers;
	}

	public void setProducers(String producers) {
		this.producers = producers;
	}



	@Override
	public String toString() {
		return "PrimaryStaff [primaryId=" + primaryId + ", producers=" + producers + "]";
	}
	


	
	
}
