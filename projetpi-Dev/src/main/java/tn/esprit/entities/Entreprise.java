package tn.esprit.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Entreprise implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "identreprise")
	private Long id;
	private String nom;
	private String categorie;
	private String adresse;
	private String contact;
	@OneToMany(cascade = CascadeType.ALL , mappedBy="entreprise")
	private Set<Employee> employees;
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
	public String getCategorie() {
		return categorie;
	}
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public Set<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}
	public Entreprise(long id, String nom, String categorie, String adresse, String contact,
			Set<Employee> employees) {
		super();
		this.id = id;
		this.nom = nom;
		this.categorie = categorie;
		this.adresse = adresse;
		this.contact = contact;
		this.employees = employees;
	}
	public Entreprise() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Entreprise [id=" + id + ", nom=" + nom + ", categorie=" + categorie + ", adresse=" + adresse
				+ ", contact=" + contact + ", employees=" + employees + "]";
	}
	
	
	
}