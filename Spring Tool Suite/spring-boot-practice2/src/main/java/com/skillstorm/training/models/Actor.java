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
public class Actor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "actor_id")
	private short actorId;
	
	
	@OneToMany
	@JoinColumn(name = "actor_id")
	@JsonIgnore
	private Set<FilmActor> filmActors;
	

	
	
	@Column(length = 45)
    private String firstName;
	@Column(length = 45)
    private String lastName;
    
    @UpdateTimestamp
    private Instant lastUpdate;
	public short getActorId() {
		return actorId;
	}
	public void setActorId(short actorId) {
		this.actorId = actorId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Instant getLastUpdate() {
		return lastUpdate;
	}
	public void setLastUpdate(Instant lastUpdate) {
		this.lastUpdate = lastUpdate;
	}
	@Override
	public String toString() {
		return "Actor [actorId=" + actorId + ", firstName=" + firstName + ", lastName=" + lastName + ", lastUpdate="
				+ lastUpdate + "]";
	}
	public Actor(short actorId, String firstName, String lastName, Instant lastUpdate) {
		super();
		this.actorId = actorId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.lastUpdate = lastUpdate;
	}
	
    
}
