package tn.esprit.entities;

import java.io.Serializable;
import java.util.List;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Invitation implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idinvitation")
	private Long id;
	private String Contenue;
	@OneToMany(cascade = CascadeType.ALL , mappedBy="invitation")
	private List<Employee> employees_invitee;
	
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getContenue() {
		return Contenue;
	}
	public void setContenue(String contenue) {
		Contenue = contenue;
	}
	public List<Employee> getEmployees_invitee() {
		return employees_invitee;
	}
	public void setEmployees_invitee(List<Employee> employees_invitee) {
		this.employees_invitee = employees_invitee;
	}
	@Override
	public String toString() {
		return "Invitation [id=" + id + ", Contenue=" + Contenue + ", employees_invitee=" + employees_invitee + "]";
	}
	public Invitation(Long id, String contenue, List<Employee> employees_invitee) {
		super();
		this.id = id;
		Contenue = contenue;
		this.employees_invitee = employees_invitee;
	}
	public Invitation() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
