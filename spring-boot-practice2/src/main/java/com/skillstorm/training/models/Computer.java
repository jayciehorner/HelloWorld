package com.skillstorm.training.models;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

// If you want to add validation like NotNull that gets checked when an instance is created add the dependency to POM

@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Computer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "computer_id")
	private int id;
//	@NotNull // TODO add validation
	private String name;
	// computers have many parts
	@OneToMany(mappedBy = "computer")
	private Set<Part> parts;
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<Part> getParts() {
		return parts;
	}
	public void setParts(Set<Part> parts) {
		this.parts = parts;
	}
	@Override
	public String toString() {
		return "Computer [id=" + id + ", name=" + name + ", parts=" + parts
				+ "]";
	}
	
}