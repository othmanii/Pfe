package com.sagem.requivalence.entites;
import java.util.*;

import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.*;
@Entity
public class Users {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

	public long Id ;
	public String Nom ;
	public  String Prenom ;
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	public String getPrenom() {
		return Prenom;
	}
	
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	public void setPrenom(String prenom) {
		Prenom = prenom;
	}
	
	public Users(long id, String nom, String prenom) {
		super();
		Id = id;
		Nom = nom;
		Prenom = prenom;
	}
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
