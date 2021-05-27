package com.sagem.requivalence.entites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Composants {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long Id;
	public String AGS;
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	public String getAGS() {
		return AGS;
	}
	public void setAGS(String aGS) {
		AGS = aGS;
	}
	public Composants(long id, String aGS) {
		super();
		Id = id;
		AGS = aGS;
	}
	public Composants() {
		super();
		// TODO Auto-generated constructor stub
	}

}
