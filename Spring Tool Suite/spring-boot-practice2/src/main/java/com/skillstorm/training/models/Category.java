package com.skillstorm.training.models;

import java.time.Instant;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "category_id")
	private byte categoryId;
	
//	@JoinTable(name = "category_film",
//	joinColumns = @JoinColumn(name = "category_id"))
	
	@OneToMany
	@JsonIgnore
	private Set<FilmCategory> categories;
	
	
	@Column(length = 25)
    private String name;
    @UpdateTimestamp
    private Instant lastUpdate;
	public byte getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(byte categoryId) {
		this.categoryId = categoryId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Instant getLastUpdate() {
		return lastUpdate;
	}
	public void setLastUpdate(Instant lastUpdate) {
		this.lastUpdate = lastUpdate;
	}
	@Override
	public String toString() {
		return "Category [categoryId=" + categoryId + ", name=" + name + ", lastUpdate=" + lastUpdate + "]";
	}
	public Category(byte categoryId, String name, Instant lastUpdate) {
		super();
		this.categoryId = categoryId;
		this.name = name;
		this.lastUpdate = lastUpdate;
	}
    
    
}
