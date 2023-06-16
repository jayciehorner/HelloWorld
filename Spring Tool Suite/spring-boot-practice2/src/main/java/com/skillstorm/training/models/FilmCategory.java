package com.skillstorm.training.models;

import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.UpdateTimestamp;

@Entity
public class FilmCategory {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "film_id")
	
	@ManyToOne
	
	@JoinTable(name = "film_id",
	joinColumns = @JoinColumn(name = "category_id"))
	
	private short filmId;
    private byte categoryId;
    @UpdateTimestamp
    private Instant lastUpdate;
	public short getFilmId() {
		return filmId;
	}
	public void setFilmId(short filmId) {
		this.filmId = filmId;
	}
	public byte getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(byte categoryId) {
		this.categoryId = categoryId;
	}
	public Instant getLastUpdate() {
		return lastUpdate;
	}
	public void setLastUpdate(Instant lastUpdate) {
		this.lastUpdate = lastUpdate;
	}
	@Override
	public String toString() {
		return "FilmCategory [filmId=" + filmId + ", categoryId=" + categoryId + ", lastUpdate=" + lastUpdate + "]";
	}
	public FilmCategory(short filmId, byte categoryId, Instant lastUpdate) {
		super();
		this.filmId = filmId;
		this.categoryId = categoryId;
		this.lastUpdate = lastUpdate;
	}
    
    
}
