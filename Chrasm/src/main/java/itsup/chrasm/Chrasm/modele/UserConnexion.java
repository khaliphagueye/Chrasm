package itsup.chrasm.Chrasm.modele;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserConnexion implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(nullable=false, updatable = false)
	private long id;
	@Column(nullable=false, updatable = false)
	private String nom;
	@Column(nullable=false, updatable = false)
	private String prenom;
	@Column(nullable=false, updatable = false)
	private String username;
	@Column(nullable=false, updatable = false)
	private String Mdp;
	@Column(nullable=false, updatable = false)
	private String confirmMdp;
	public UserConnexion() {
		super();
	}
	public UserConnexion(String nom, String prenom, String username, String mdp, String confirmMdp) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.username = username;
		Mdp = mdp;
		this.confirmMdp = confirmMdp;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
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
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getMdp() {
		return Mdp;
	}
	public void setMdp(String mdp) {
		Mdp = mdp;
	}
	public String getConfirmMdp() {
		return confirmMdp;
	}
	public void setConfirmMdp(String confirmMdp) {
		this.confirmMdp = confirmMdp;
	}
	

}
