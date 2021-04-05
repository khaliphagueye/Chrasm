package itsup.chrasm.Chrasm.modele;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class User implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(nullable=false, updatable = false)
	private long id;
	private String admin_nom;
	private String admin_mdp;
	public User(String admin_nom, String admin_mdp) {
		super();
		this.admin_nom = admin_nom;
		this.admin_mdp = admin_mdp;
	}
	public User() {
		super();
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getAdmin_nom() {
		return admin_nom;
	}
	public void setAdmin_nom(String admin_nom) {
		this.admin_nom = admin_nom;
	}
	public String getAdmin_mdp() {
		return admin_mdp;
	}
	public void setAdmin_mdp(String admin_mdp) {
		this.admin_mdp = admin_mdp;
	}
	
	
}
