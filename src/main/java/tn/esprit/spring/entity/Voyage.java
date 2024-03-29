package tn.esprit.spring.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;




@Entity
public class Voyage implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IdVoyage")
	private Long IdVoyage;
	private String distnation;
	private Date date=new Date();
	private int duree;
	private String image;
	private Date Date_ajoute;
	private  int permiter;
	
	
	
	@Enumerated(EnumType.STRING)
	private Objet_de_voyage objet_de_voyage ; 
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "voyage")
     private List<Program> program;

	@ManyToOne
	Employee employee;
	
	
	public Long getIdVoyage() {
		return IdVoyage;
	}
	public void setIdVoyage(Long idVoyage) {
		IdVoyage = idVoyage;
	}
	public String getDistnation() {
		return distnation;
	}
	public void setDistnation(String distnation) {
		this.distnation = distnation;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getDuree() {
		return duree;
	}
	public void setDuree(int duree) {
		this.duree = duree;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public Date getDate_ajoute() {
		return Date_ajoute;
	}
	public void setDate_ajoute(Date date_ajoute) {
		Date_ajoute = date_ajoute;
	}
	public int getPermiter() {
		return permiter;
	}
	public void setPermiter(int permiter) {
		this.permiter = permiter;
	}
	public Objet_de_voyage getObjet_de_voyage() {
		return objet_de_voyage;
	}
	public void setObjet_de_voyage(Objet_de_voyage objet_de_voyage) {
		this.objet_de_voyage = objet_de_voyage;
	}
	public List<Program> getProgram() {
		return program;
	}
	public void setProgram(List<Program> program) {
		this.program = program;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public Voyage(Long idVoyage, String distnation, Date date, int duree, String image, Date date_ajoute, int permiter,
			Objet_de_voyage objet_de_voyage, List<Program> program, Employee employee) {
		super();
		IdVoyage = idVoyage;
		this.distnation = distnation;
		this.date = date;
		this.duree = duree;
		this.image = image;
		Date_ajoute = date_ajoute;
		this.permiter = permiter;
		this.objet_de_voyage = objet_de_voyage;
		this.program = program;
		this.employee = employee;
	}
	public Voyage() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
