package com.example.demo.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table
public class Instructor {
	public Instructor() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 Long id1;
	 String nom;
	 String Prenom;
	 String email;
	 String specialite ;
	
	public Instructor(Long id1, String nom, String Prenom, String email, String specialite) {
		super();
		this.id1 = id1;
		this.nom = nom;
		this.Prenom = Prenom;
		this.email = email;
		this.specialite = specialite;
	}
	
	public Instructor(String nom, String Prenom, String email, String specialite) {
		super();
		this.nom = nom;
		this.Prenom = Prenom;
		this.email = email;
		this.specialite = specialite;
	}

	public Long getId() {
		return id1;
	}
	public void setId(Long id) {
		this.id1 = id1;
	}
	public String getnom() {
		return nom;
	}
	public void setnom(String nom) {
		this.nom = nom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPrenom() {
		return Prenom;
	}
	public void setPrenom(String Prenom) {
		this.Prenom = Prenom;
	}
	public String getspecialite() {
		return specialite;
	}
	public void setspecialite(String specialite) {
		this.specialite = specialite;
	}
}
