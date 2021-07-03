package itsup.chrasm.modele;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Patient implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(nullable=false)
	private long id;
	@Column(nullable=false)
	private String nom;
	@Column(nullable=false)
	private String prenom;
	@Column(nullable=false)
	private String mail;
	@Column(nullable=false)
	private String numTel;
	@Column(nullable=false)
	private String usernam;
	@Column(nullable=false)
	private String password;
	@Column(nullable=false)
	private String confirmpassword;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_id", referencedColumnName = "id")
	List<RendezVous> rendezvous = new ArrayList<>();
	
	public Patient(String nom, String prenom, String mail, String numTel, String usernam, String password,
			String confirmpassword) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.mail = mail;
		this.numTel = numTel;
		this.usernam = usernam;
		this.password = password;
		this.confirmpassword = confirmpassword;
	}
	
}
