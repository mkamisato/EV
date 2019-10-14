package com.listcities.entity;

import javax.persistence.Table;
//import javax.xml.bind.annotation.XmlRootElement;

//import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Table(name = "CITIES")
@Entity
//@XmlRootElement
//public class City implements Serializable {
	public class City  {
	
	public City() {
		
	}
	public City(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Id
	@Column(name = "ID")
	private int id;
	
	@Column(name = "NAME")
	private String name;
	


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

	
	
	

	
}
