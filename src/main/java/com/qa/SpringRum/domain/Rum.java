package com.qa.SpringRum.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

public class Rum {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull(message = "What is the name of the Rum?")
	private String name;
	
	
	private long alcoholpercentage;
	
	
	private String type;
	
	
	public Rum() { 
		
	}
	
	
	public Rum (long id, String name, long alcoholpercentage, String type) {
		super();
		this.id = id;
		this.name = name;
		this.alcoholpercentage = alcoholpercentage;
		this.type = type;
		
		}


	public Rum(String name, long alcoholpercentage, String type) {
		super();
		this.name = name;
		this.alcoholpercentage = alcoholpercentage;
		this.type = type;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public long getAlcoholpercentage() {
		return alcoholpercentage;
	}


	public void setAlcoholpercentage(long alcoholpercentage) {
		this.alcoholpercentage = alcoholpercentage;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (alcoholpercentage ^ (alcoholpercentage >>> 32));
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rum other = (Rum) obj;
		if (alcoholpercentage != other.alcoholpercentage)
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}
	
	
	
	

	}
	
	
