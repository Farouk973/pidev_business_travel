package tn.esprit.spring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

//import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
public class Vm {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IdVm")
	private Long IdVm;
	private Long em1;
	private Long em2;
	private Long entriprisR;
	private Boolean match;
	@ManyToOne
	
	Entriprise Entreprises ;


	public Long getIdVm() {
		return IdVm;
	}
	public void setIdVm(Long idVm) {
		IdVm = idVm;
	}
	public Long getEm1() {
		return em1;
	}
	public void setEm1(Long em1) {
		this.em1 = em1;
	}
	public Long getEm2() {
		return em2;
	}
	public void setEm2(Long em2) {
		this.em2 = em2;
	}
	public Long getEntriprisR() {
		return entriprisR;
	}
	public void setEntriprisR(Long entriprisR) {
		this.entriprisR = entriprisR;
	}
	public Boolean getMatch() {
		return match;
	}
	public void setMatch(Boolean match) {
		this.match = match;
	}

	public Vm(Long idVm, Long em1, Long em2, Long entriprisR, Boolean match, Entriprise entriprise) {
		super();
		IdVm = idVm;
		this.em1 = em1;
		this.em2 = em2;
		this.entriprisR = entriprisR;
		this.match = match;
	}
	public Vm() {
		super();
		// TODO Auto-generated constructor stub
	}


}
