package com.example.demo.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
@Entity
@Table
public class Course {
	@Id 
	@GeneratedValue
	long id_course;
	String titre;
	String description;
	
	@ManyToOne 
	@JoinColumn(name="id", nullable=false)
	Student student;

	@ManyToOne 
	@JoinColumn(name="id1", nullable=false)
	Instructor instructor;
	
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Course(String titre, String description, Student student,Instructor instructor) {
		super();
		this.titre = titre;
		this.description = description;
		this.student = student;
		this.instructor=instructor;
	}
	public long getid() {
		return id_course;
	}
	public void setid(long id_course) {
		this.id_course = id_course;
	}
	public String gettitre() {
		return titre;
	}
	public void settitre(String titre) {
		this.titre = titre;
	}
	public String getdescription() {
		return description;
	}
	public void setSpecialite(String description) {
		this.description = description;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Instructor getInstructor() {
		return instructor;
	}
	public void setInstructor(Instructor instructor) {
		this.instructor =instructor ;
	}

}
