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
@Table(name="Entreprise")
public class Entreprise implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 15482L;
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id ;
	@Column(name="nom")
	private String nom ; 
	@Column(name="description")
	private String description ; 
	@Column(name="categorie")
	private String categorie ;
	@Column(name="login")
	private String login ;
	@Column(name="password")
	private String password ; 
	@Column(name="adresse")
	private String string ; 
	@Column(name="number")
	private int number ;
	@ManyToMany(cascade = CascadeType.ALL)
	private Set <Abonement>entreprises;
	@ManyToMany(cascade = CascadeType.ALL) 
	private Set <Publication>company;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCategorie() {
		return categorie;
	}
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getString() {
		return string;
	}
	public void setString(String string) {
		this.string = string;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public Set<Abonement> getEntreprises() {
		return entreprises;
	}
	public void setEntreprises(Set<Abonement> entreprises) {
		this.entreprises = entreprises;
	}
	public Set<Publication> getCompany() {
		return company;
	}
	public void setCompany(Set<Publication> company) {
		this.company = company;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Entreprise(String nom, String description, String categorie, String login, String password, String string,
			int number, Set<Abonement> entreprises, Set<Publication> company) {
		super();
		this.nom = nom;
		this.description = description;
		this.categorie = categorie;
		this.login = login;
		this.password = password;
		this.string = string;
		this.number = number;
		this.entreprises = entreprises;
		this.company = company;
	}
	public Entreprise() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
