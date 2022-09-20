package com.demo.model;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.demo.io.Logging;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "staff")
public class Staff{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Column(name = "name")
	private String name;
	
	@OneToOne(mappedBy = "staff", cascade = CascadeType.ALL)
	private PrimaryStaff ps;
	
	
	public Staff() {
		super();
	}
	
	public Staff(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	

	public Staff(int id, String name, PrimaryStaff ps) {
		super();
		this.id = id;
		this.name = name;
		this.ps = ps;
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

	public PrimaryStaff getPs() {
		return ps;
	}

	public void setPs(PrimaryStaff ps) {
		this.ps = ps;
	}

	@Override
	public String toString() {
		return "Staff [id=" + id + ", name=" + name + ", ps=" + ps + "]";
	}

	//@OneToOne(mappedBy = "staff", cascade = CascadeType.ALL)
	//private PrimaryStaff primaryStaff;
	
	
	
}
