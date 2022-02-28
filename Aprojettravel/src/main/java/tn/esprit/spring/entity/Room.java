package tn.esprit.spring.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor


@Entity
public class Room {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IdRoom")
	private Long IdRoom;
	private String nom;
	private Employee admin;
	private String image;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "room",fetch=FetchType.EAGER)
	private List<Voyage> voyage;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "room",fetch=FetchType.EAGER)
	private List<Boit_tchat> boit_tchat;
}
