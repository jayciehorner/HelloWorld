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

import org.hibernate.annotations.UpdateTimestamp;

@Entity
public class FilmActor {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "actor_id")

@ManyToMany

@JoinTable(name = "film_actor.actor_id",
joinColumns = @JoinColumn(name = "actor.actor_id"))

private short actorId;
private short filmId;
@UpdateTimestamp
private Instant lastUpdate;
public short getActorId() {
	return actorId;
}
public void setActorId(short actorId) {
	this.actorId = actorId;
}
public short getFilmId() {
	return filmId;
}
public void setFilmId(short filmId) {
	this.filmId = filmId;
}
public Instant getLastUpdate() {
	return lastUpdate;
}
public void setLastUpdate(Instant lastUpdate) {
	this.lastUpdate = lastUpdate;
}
@Override
public String toString() {
	return "FilmActor [actorId=" + actorId + ", filmId=" + filmId + ", lastUpdate=" + lastUpdate + "]";
}
public FilmActor(short actorId, short filmId, Instant lastUpdate) {
	super();
	this.actorId = actorId;
	this.filmId = filmId;
	this.lastUpdate = lastUpdate;
}



}
