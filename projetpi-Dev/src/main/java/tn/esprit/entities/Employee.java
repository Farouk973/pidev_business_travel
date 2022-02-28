package tn.esprit.entities;

import java.io.Serializable;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;




@Entity
public class Employee implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idemployee")
	private Long id ;
	private String nom;
	private String prenom;
	private int experience;
	private String age;
	private String telephone;
	private Long cin;
	private String adresse;
	
	private String email;
	@ManyToOne(cascade = CascadeType.ALL)
	private Entreprise entreprise;
	@ManyToOne(cascade = CascadeType.ALL)
	private Invitation invitation;
	
	
	public Invitation getInvitation() {
		return invitation;
	}
	public void setInvitation(Invitation invitation) {
		this.invitation = invitation;
	}
	public long getId() {
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
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public long getCin() {
		return cin;
	}
	public void setCin(Long cin) {
		this.cin = cin;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Entreprise getEntreprise() {
		return entreprise;
	}
	public void setEntreprise(Entreprise entreprise) {
		this.entreprise = entreprise;
	}
	public Employee(Long id, String nom, String prenom, int experience, String age, String telephone, Long cin,
			String adresse, String email, Entreprise entreprise) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.experience = experience;
		this.age = age;
		this.telephone = telephone;
		this.cin = cin;
		this.adresse = adresse;
		this.email = email;
		this.entreprise = entreprise;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", experience=" + experience + ", age="
				+ age + ", telephone=" + telephone + ", cin=" + cin + ", adresse=" + adresse + ", email=" + email
				+ ", entreprise=" + entreprise + "]";
	}
	
	
	
	
	
}
