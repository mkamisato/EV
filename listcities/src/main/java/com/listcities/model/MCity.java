package com.listcities.model;

import com.listcities.entity.City;

public class MCity {
	public MCity() {
		
	}
	public MCity(City city) {
		this.id = city.getId();
		this.name = city.getName();
		
	}
	
	public MCity(int id, String name) {

		this.id = id;
		this.name = name;
	}
	private int id;
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
