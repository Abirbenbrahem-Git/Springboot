package com.example.demo.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table
public class Student {
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 Long id;
	 String nom;
	 String Prenom;
	 String email;
	 String niveau ;
	
	public Student(Long id, String nom, String Prenom, String email, String niveau) {
		super();
		this.id = id;
		this.nom = nom;
		this.Prenom = Prenom;
		this.email = email;
		this.niveau = niveau;
	}
	
	public Student(String nom, String Prenom, String email, String niveau) {
		super();
		this.nom = nom;
		this.Prenom = Prenom;
		this.email = email;
		this.niveau = niveau;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public String getniveau() {
		return niveau;
	}
	public void setniveau(String niveau) {
		this.niveau = niveau;
	}
	
}
