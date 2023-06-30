package com.skillstorm.training;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Barbeque {

	/**
	 * Barbeque is described by 
	 * - meatType 
	 * - cookingTime 
	 * - sauceType 
	 * - cookingStyle 
	 * - id (db will have an id)
	 */
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Short id;
	
	private String meatType;
	
	private String sauceType;
	
	private String cookingStyle;
	
	private short cookingTime;

	public Short getId() {
		return id;
	}

	public void setId(Short id) {
		this.id = id;
	}

	public String getMeatType() {
		return meatType;
	}

	public void setMeatType(String meatType) {
		this.meatType = meatType;
	}

	public String getSauceType() {
		return sauceType;
	}

	public void setSauceType(String sauceType) {
		this.sauceType = sauceType;
	}

	public String getCookingStyle() {
		return cookingStyle;
	}

	public void setCookingStyle(String cookingStyle) {
		this.cookingStyle = cookingStyle;
	}

	public short getCookingTime() {
		return cookingTime;
	}

	public void setCookingTime(short cookingTime) {
		this.cookingTime = cookingTime;
	}

	@Override
	public String toString() {
		return "Barbeque [id=" + id + ", meatType=" + meatType + ", sauceType="
				+ sauceType + ", cookingStyle=" + cookingStyle
				+ ", cookingTime=" + cookingTime + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Barbeque other = (Barbeque) obj;
		return id == other.id;
	}
	
	

}