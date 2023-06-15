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
public class Actor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "actor_id")
	
	@ManyToMany
	

	
	private int actorId;
    private String firstName;
    private String lastName;
    private String lastUpdate;
	public int getActorId() {
		return actorId;
	}
	public void setActorId(int actorId) {
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
	public String getLastUpdate() {
		return lastUpdate;
	}
	public void setLastUpdate(String lastUpdate) {
		this.lastUpdate = lastUpdate;
	}
	@Override
	public String toString() {
		return "Actor [actorId=" + actorId + ", firstName=" + firstName + ", lastName=" + lastName + ", lastUpdate="
				+ lastUpdate + "]";
	}
	public Actor(int actorId, String firstName, String lastName, String lastUpdate) {
		super();
		this.actorId = actorId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.lastUpdate = lastUpdate;
	}
	
    
}
