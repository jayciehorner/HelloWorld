package com.skillstorm.training.models;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import java.time.Instant;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
@Entity
//@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Film {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "film_id")
	private short filmId;
	@Column(length = 255)
	private String title;
	@Column(columnDefinition = "text")
	private String description;
	private int releaseYear;
	private short length;
	private EnumType rating;
	@UpdateTimestamp
	private Instant lastUpdate;
	
	@OneToMany(mappedBy = "film")
	@JsonIgnore
	private Set <FilmCategory> filmCategories;
	@OneToMany(mappedBy = "film")
	@JsonIgnore
	private Set <FilmActor> filmActors;
	
	
	public short getFilmId() {
		return filmId;
	}
	public void setFilmId(short filmId) {
		this.filmId = filmId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getReleaseYear() {
		return releaseYear;
	}
	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}
	public short getLength() {
		return length;
	}
	public void setLength(short length) {
		this.length = length;
	}
	public EnumType getRating() {
		return rating;
	}
	public void setRating(EnumType rating) {
		this.rating = rating;
	}
	public Instant getLastUpdate() {
		return lastUpdate;
	}
	public void setLastUpdate(Instant lastUpdate) {
		this.lastUpdate = lastUpdate;
	}
	@Override
	public String toString() {
		return "Film [filmId=" + filmId + ", title=" + title + ", description=" + description + ", releaseYear="
				+ releaseYear + ", length=" + length + ", rating=" + rating + ", lastUpdate=" + lastUpdate + "]";
	}
	public Film(short filmId, String title, String description, int releaseYear, short length, EnumType rating,
			Instant lastUpdate) {
		super();
		this.filmId = filmId;
		this.title = title;
		this.description = description;
		this.releaseYear = releaseYear;
		this.length = length;
		this.rating = rating;
		this.lastUpdate = lastUpdate;
	}
	public Set<FilmCategory> getFilmCategories() {
		return filmCategories;
	}
	public void setFilmCategories(Set<FilmCategory> filmCategories) {
		this.filmCategories = filmCategories;
	}
	public Set<FilmActor> getFilmActors() {
		return filmActors;
	}
	public void setFilmActors(Set<FilmActor> filmActors) {
		this.filmActors = filmActors;
	}
	public Film() {
		
	}
	
}