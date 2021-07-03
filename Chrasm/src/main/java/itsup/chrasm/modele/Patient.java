package itsup.chrasm.Chrasm.modele;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Patient implements Serializable {
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
	private String mail;
	@Column(nullable=false, updatable = false)
	private String departement;
	@Column(nullable=false, updatable = false)
	private String numTel;
	@Column(nullable=false, updatable = false)
	private String dateRv;
	public Patient(String nom, String prenom, String adresse, String departement, String numTel,
			String dateRv) {
		this.nom = nom;
		this.prenom = prenom;
		this.mail = adresse;
		this.departement = departement;
		this.numTel = numTel;
		this.dateRv = dateRv;
	}
	public Patient() {
		super();
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
	public String getAdresse() {
		return mail;
	}
	public void setAdresse(String adresse) {
		this.mail = adresse;
	}
	public String getDepartement() {
		return departement;
	}
	public void setDepartement(String departement) {
		this.departement = departement;
	}
	public String getNumTel() {
		return numTel;
	}
	public void setNumTel(String numTel) {
		this.numTel = numTel;
	}
	public String getDateRv() {
		return dateRv;
	}
	public void setDateRv(String dateRv) {
		this.dateRv = dateRv;
	}
	@Override
	public String toString() {
		return "RendezVous [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", adresse=" + mail
				+ ", departement=" + departement + ", numTel=" + numTel + ", dateRv=" + dateRv + "]";
	}
	

}
