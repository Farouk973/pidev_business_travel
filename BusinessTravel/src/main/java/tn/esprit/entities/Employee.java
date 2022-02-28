package tn.esprit.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


import tn.esprit.entities.Employee;

@Entity

public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column
	private String nom;
	@Column
	private String prenom;
	@Column
	@Enumerated(EnumType.STRING)
	private Genre genre;
	@OneToMany(mappedBy="employee", fetch=FetchType.EAGER, cascade=CascadeType.REMOVE)
	private List<Reclamation> reclamation;
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}
	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	/**
	 * @return the genre
	 */
	public Genre getGenre() {
		return genre;
	}
	/**
	 * @param genre the genre to set
	 */
	public void setGenre(Genre genre) {
		this.genre = genre;
	}
	/**
	 * @return the reclamation
	 */
	public List<Reclamation> getReclamation() {
		return reclamation;
	}
	/**
	 * @param reclamation the reclamation to set
	 */
	public void setReclamation(List<Reclamation> reclamation) {
		this.reclamation = reclamation;
	}
	public Employee(Long id, String nom, String prenom, Genre genre, List<Reclamation> reclamation) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.genre = genre;
		this.reclamation = reclamation;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setEmployee(Employee employee) {
		// TODO Auto-generated method stub
		
	}
	
}
