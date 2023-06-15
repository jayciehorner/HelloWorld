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
public class FilmCategory {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "film_id")
	
	@ManyToMany
	
	@JoinTable(name = "film_id",
	joinColumns = @JoinColumn(name = "category_id"))
	
	private int filmId;
    private int categoryId;
    private String lastUpdate;
	public int getFilmId() {
		return filmId;
	}
	public void setFilmId(int filmId) {
		this.filmId = filmId;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public String getLastUpdate() {
		return lastUpdate;
	}
	public void setLastUpdate(String lastUpdate) {
		this.lastUpdate = lastUpdate;
	}
	@Override
	public String toString() {
		return "FilmCategory [filmId=" + filmId + ", categoryId=" + categoryId + ", lastUpdate=" + lastUpdate + "]";
	}
	public FilmCategory(int filmId, int categoryId, String lastUpdate) {
		super();
		this.filmId = filmId;
		this.categoryId = categoryId;
		this.lastUpdate = lastUpdate;
	}
    
    
}
