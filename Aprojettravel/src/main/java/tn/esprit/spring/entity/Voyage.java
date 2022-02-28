package tn.esprit.spring.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor


@Entity
public class Voyage {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IdVoyage")
	private Long IdVoyage;
	private String distnation;
	private Date date;
	private int duree;
	private String image;
	private Date Date_ajoute;
	private  int permiter;
	@Enumerated(EnumType.STRING)
	private Objet_de_voyage objet_de_voyage ; 
@ManyToOne
Employee employee;
@ManyToOne
Room room;
@OneToOne
private Program program;
}
