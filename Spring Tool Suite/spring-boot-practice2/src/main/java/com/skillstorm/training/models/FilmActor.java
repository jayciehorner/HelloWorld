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
public class FilmActor {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "actor_id")

@ManyToMany

@JoinTable(name = "film_actor.actor_id",
joinColumns = @JoinColumn(name = "actor.actor_id"))

private int actorId;
private int filmId;
private String lastUpdate;
public int getActorId() {
	return actorId;
}
public void setActorId(int actorId) {
	this.actorId = actorId;
}
public int getFilmId() {
	return filmId;
}
public void setFilmId(int filmId) {
	this.filmId = filmId;
}
public String getLastUpdate() {
	return lastUpdate;
}
public void setLastUpdate(String lastUpdate) {
	this.lastUpdate = lastUpdate;
}
@Override
public String toString() {
	return "FilmActor [actorId=" + actorId + ", filmId=" + filmId + ", lastUpdate=" + lastUpdate + "]";
}
public FilmActor(int actorId, int filmId, String lastUpdate) {
	super();
	this.actorId = actorId;
	this.filmId = filmId;
	this.lastUpdate = lastUpdate;
}



}
