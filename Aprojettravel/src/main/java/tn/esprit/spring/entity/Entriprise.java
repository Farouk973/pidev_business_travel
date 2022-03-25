package tn.esprit.spring.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;






@Entity
public class Entriprise {@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IdEntriprise")
	private Long IdEntriprise;
	private String nom;
	private String mail;
	private String image;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "Entreprises" )

	private List<Vm> vms;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "entriprise" )

	private List<Employee> Employes;
	public Long getIdEntriprise() {
		return IdEntriprise;
	}
	public void setIdEntriprise(Long idEntriprise) {
		IdEntriprise = idEntriprise;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
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
	public List<Vm> getVms() {
		return vms;
	}
	public void setVms(List<Vm> vms) {
		this.vms = vms;
	}
	public List<Employee> getEmployes() {
		return Employes;
	}
	public void setEmployes(List<Employee> employes) {
		Employes = employes;
	}
	public Entriprise(Long idEntriprise, String nom, String mail, String image, List<Vm> vms, List<Employee> employes) {
		super();
		IdEntriprise = idEntriprise;
		this.nom = nom;
		this.mail = mail;
		this.image = image;
		this.vms = vms;
		Employes = employes;
	}
	public Entriprise() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

	

}
