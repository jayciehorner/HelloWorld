package com.skillstorm.training.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "category_id")
	
	@ManyToMany
//	@JoinTable(name = "category_id",
//	joinColumns = @JoinColumn(name = "actor_id"))
	
	private int categoryId;
    private String name;
    private String lastUpdate;
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastUpdate() {
		return lastUpdate;
	}
	public void setLastUpdate(String lastUpdate) {
		this.lastUpdate = lastUpdate;
	}
	@Override
	public String toString() {
		return "Category [categoryId=" + categoryId + ", name=" + name + ", lastUpdate=" + lastUpdate + "]";
	}
	public Category(int categoryId, String name, String lastUpdate) {
		super();
		this.categoryId = categoryId;
		this.name = name;
		this.lastUpdate = lastUpdate;
	}
    
    
}
