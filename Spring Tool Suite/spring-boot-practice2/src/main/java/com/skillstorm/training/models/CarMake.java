package com.skillstorm.training.models;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

//This is the owner side of our one-to-many
//One directional or bidirectional relationship
@Entity
@Table(name = "makes")
public class CarMake {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "make_id")
	private long id;
	@Column(length = 45)
	private String countryOfOrigin;
	@Column(length = 45)
	private String make;
	
	@OneToMany(mappedBy = "make") // java property name
	private Set<CarModel> models;
	
	public String getCountryOfOrigin() {
		return countryOfOrigin;
	}
	public void setCountryOfOrigin(String countryOfOrigin) {
		this.countryOfOrigin = countryOfOrigin;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public CarMake(long id, String countryOfOrigin, String make) {
		super();
		this.id = id;
		this.countryOfOrigin = countryOfOrigin;
		this.make = make;
	}
	
}
