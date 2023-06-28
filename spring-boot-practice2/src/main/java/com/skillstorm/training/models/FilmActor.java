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
import com.skillstorm.training.models.*;

import org.hibernate.annotations.UpdateTimestamp;

@Entity
public class FilmActor {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
@Column(name = "actor_id")

@UpdateTimestamp
private Instant lastUpdate;

@ManyToOne
@JoinColumn(name = "film_id")
private Film film;

public Instant getLastUpdate() {
	return lastUpdate;
}
public void setLastUpdate(Instant lastUpdate) {
	this.lastUpdate = lastUpdate;
}
@Override
public String toString() {
	return "FilmActor [id=" + id + ", lastUpdate=" + lastUpdate + ", film=" + film + "]";
}
public FilmActor(int id, Instant lastUpdate, Film film) {
	super();
	this.id = id;
	this.lastUpdate = lastUpdate;
	this.film = film;
}
public FilmActor() {
	
}




}