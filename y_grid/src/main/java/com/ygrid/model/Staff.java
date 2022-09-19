package com.ygrid.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import com.ygrid.io.Logging;

@Entity
@Table(name = "staff")
public class Staff implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8485745572603704070L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private @Getter @Setter int id;
	@Column(name = "name")
	private @Getter @Setter String name;

	
	public Staff() {
		super();	
	}
	
	public Staff(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		Logging.LogIt("info", "Staff, "+ this.name + ", was updated");
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

	@Override
	public String toString() {
		return "Staff [id=" + id + ", name=" + name + "]";
	}

}
