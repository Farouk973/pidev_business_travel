package tn.esprit.entities;

import java.io.Serializable;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



import tn.esprit.entities.Genre;
import tn.esprit.entities.Employee;




@Entity

	public class  Reclamation implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column
	private String nom;
	@Column
	private String prenom;
	@Column
	private String reclam;
	@Column
	private String mail;
	@Enumerated(EnumType.STRING)
	private Genre genre;
	@Column
	@Temporal(TemporalType.DATE)
	
	private Date date_reclam;
	@ManyToOne
	private Employee employee;
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
	 * @return the reclam
	 */
	public String getReclam() {
		return reclam;
	}
	/**
	 * @param reclam the reclam to set
	 */
	public void setReclam(String reclam) {
		this.reclam = reclam;
	}
	/**
	 * @return the mail
	 */
	public String getMail() {
		return mail;
	}
	/**
	 * @param mail the mail to set
	 */
	public void setMail(String mail) {
		this.mail = mail;
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
	 * @return the date_reclam
	 */
	/**public Date getDate_reclam() {
		return date_reclam;
	}
	
	 * @param date_reclam the date_reclam to set
	 */
	public void setDate_reclam(Date date_reclam) {
	this.date_reclam = date_reclam;
	
	} 

	/**
	 * @return the employee
	 */
	public Employee getEmployee() {
		return employee;
	}
	/**
	 * @param employee the employee to set
	 */
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Reclamation(Long id, String nom, String prenom, String reclam, String mail, Genre genre, Date date_reclam,
			Employee employee) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.reclam = reclam;
		this.mail = mail;
		this.genre = genre;
	    this.date_reclam = date_reclam;
		this.employee = employee;
	}
	public Reclamation() {
		super();
		// TODO Auto-generated constructor stub
	}
		



}