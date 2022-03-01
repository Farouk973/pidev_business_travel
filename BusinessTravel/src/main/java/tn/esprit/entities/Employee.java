package tn.esprit.entities;

import java.util.List;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;

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
	private String mail;
	@Column
	private String adresse;
	@Column
	private int num_tel;
	@Column
	private String sexe;
	@Column
	private int etat;
	@Column
	private int cin;
	@Column
	private String poste;
	@Column
	private String status_civil;
	
	
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
	 * @return the adresse
	 */
	public String getAdresse() {
		return adresse;
	}


	/**
	 * @param adresse the adresse to set
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}


	/**
	 * @return the num_tel
	 */
	public int getNum_tel() {
		return num_tel;
	}


	/**
	 * @param num_tel the num_tel to set
	 */
	public void setNum_tel(int num_tel) {
		this.num_tel = num_tel;
	}


	/**
	 * @return the sexe
	 */
	public String getSexe() {
		return sexe;
	}


	/**
	 * @param sexe the sexe to set
	 */
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}


	/**
	 * @return the etat
	 */
	public int getEtat() {
		return etat;
	}


	/**
	 * @param etat the etat to set
	 */
	public void setEtat(int etat) {
		this.etat = etat;
	}


	/**
	 * @return the cin
	 */
	public int getCin() {
		return cin;
	}


	/**
	 * @param cin the cin to set
	 */
	public void setCin(int cin) {
		this.cin = cin;
	}


	/**
	 * @return the poste
	 */
	public String getPoste() {
		return poste;
	}


	/**
	 * @param poste the poste to set
	 */
	public void setPoste(String poste) {
		this.poste = poste;
	}


	/**
	 * @return the status_civil
	 */
	public String getStatus_civil() {
		return status_civil;
	}


	/**
	 * @param status_civil the status_civil to set
	 */
	public void setStatus_civil(String status_civil) {
		this.status_civil = status_civil;
	}


	/**
	 * @return the reclamation
	 */
	public List<Reclamation> getReclamation() {
		return reclamation;
	}


	

	public Employee(Long id, String nom, String prenom, String mail, String adresse, int num_tel, String sexe, int etat,
			int cin, String poste, String status_civil, List<Reclamation> reclamation) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.mail = mail;
		this.adresse = adresse;
		this.num_tel = num_tel;
		this.sexe = sexe;
		this.etat = etat;
		this.cin = cin;
		this.poste = poste;
		this.status_civil = status_civil;
		this.reclamation = reclamation;
	}


	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}


	
	
}
