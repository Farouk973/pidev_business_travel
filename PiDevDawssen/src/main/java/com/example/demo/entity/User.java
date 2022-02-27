package com.example.demo.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="User")
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 15440L;
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long id ;
	@Column(name="nom")
	private String nom ; 
	@Column(name="prenom")
	private String prenom ;
	@Column(name="mail")
	private String mail;
	@Column(name="adresse")
	private String adresse ;
	@Column(name="num_tel")
	private int num_tel ;
	@Column(name="sexe")
	private String sexe ;
	@Column(name="etat")
	private int etat ;
	@Column(name="cin")
	private int cin ;
	@Column(name="post")
	private String post ;
	@Column(name="status_civil")
	private String status_civil ;
	@ManyToMany(cascade = CascadeType.ALL) 
	private Set <Commentaire>utilisateur;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public int getNum_tel() {
		return num_tel;
	}
	public void setNum_tel(int num_tel) {
		this.num_tel = num_tel;
	}
	public String getSexe() {
		return sexe;
	}
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
	public int getEtat() {
		return etat;
	}
	public void setEtat(int etat) {
		this.etat = etat;
	}
	public int getCin() {
		return cin;
	}
	public void setCin(int cin) {
		this.cin = cin;
	}
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
	}
	public String getStatus_civil() {
		return status_civil;
	}
	public void setStatus_civil(String status_civil) {
		this.status_civil = status_civil;
	}
	public Set<Commentaire> getUtilisateur() {
		return utilisateur;
	}
	public void setUtilisateur(Set<Commentaire> utilisateur) {
		this.utilisateur = utilisateur;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public User(String nom, String prenom, String mail, String adresse, int num_tel, String sexe, int etat, int cin,
			String post, String status_civil, Set<Commentaire> utilisateur) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.mail = mail;
		this.adresse = adresse;
		this.num_tel = num_tel;
		this.sexe = sexe;
		this.etat = etat;
		this.cin = cin;
		this.post = post;
		this.status_civil = status_civil;
		this.utilisateur = utilisateur;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
