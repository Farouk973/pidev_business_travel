package tn.esprit.spring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Jour {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Idjour")
	private int IdJour;
	private int Numjour;
	private String Image;
	private  String Dscmatin;
	private  String Dscmidi;
	private String Dscnuit;
@ManyToOne
Voyage voyage;
}
