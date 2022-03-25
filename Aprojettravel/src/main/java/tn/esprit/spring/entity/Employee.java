package tn.esprit.spring.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;






@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IdEmployee")
	private Long IdEmployee;
	private String nom;
	private String prenom;
	private String mail;
	private String image;
	
	@ManyToOne
	Entriprise entriprise;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "employee",fetch=FetchType.EAGER)
     private List<Voyage> voyage;

	@ManyToMany(cascade = CascadeType.ALL)
	private List<Boit_tchat> boit_tchat ;

	public Long getIdEmployee() {
		return IdEmployee;
	}

	public void setIdEmployee(Long idEmployee) {
		IdEmployee = idEmployee;
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

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Entriprise getEntriprise() {
		return entriprise;
	}

	public void setEntriprise(Entriprise entriprise) {
		this.entriprise = entriprise;
	}

	public List<Voyage> getVoyage() {
		return voyage;
	}

	public void setVoyage(List<Voyage> voyage) {
		this.voyage = voyage;
	}

	public List<Boit_tchat> getBoit_tchat() {
		return boit_tchat;
	}

	public void setBoit_tchat(List<Boit_tchat> boit_tchat) {
		this.boit_tchat = boit_tchat;
	}

	public Employee(Long idEmployee, String nom, String prenom, String mail, String image, Entriprise entriprise,
			List<Voyage> voyage, List<Boit_tchat> boit_tchat) {
		super();
		IdEmployee = idEmployee;
		this.nom = nom;
		this.prenom = prenom;
		this.mail = mail;
		this.image = image;
		this.entriprise = entriprise;
		this.voyage = voyage;
		this.boit_tchat = boit_tchat;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
