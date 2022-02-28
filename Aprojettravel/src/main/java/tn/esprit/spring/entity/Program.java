package tn.esprit.spring.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;
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
public class Program {@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "IdProgram")
private int idProgram;
private String Description;
private String image ;
@OneToOne
Voyage voyage;
@OneToMany(cascade = CascadeType.ALL, mappedBy = "program",fetch=FetchType.EAGER)
private List<Jour> jour;

}
