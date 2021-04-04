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
	@Column (name ="admin_nom")

	private String admin_nom;
	@Column (name ="admin_mdp")
	private String admin_mdp;
	
	public User() {
		super();
	}
	public User(long id, String adminNom, String adminMdp) {
		super();
		this.id = id;
		this.admin_nom = adminNom;
		this.admin_mdp = adminMdp;
	}
	public User(String adminNom, String adminMdp) {
		super();
		this.admin_nom = adminNom;
		this.admin_mdp = adminMdp;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getAdminNom() {
		return admin_nom;
	}
	public void setAdminNom(String adminNom) {
		this.admin_nom = adminNom;
	}
	public String getAdminMdp() {
		return admin_mdp;
	}
	public void setAdminMdp(String adminMdp) {
		this.admin_mdp = adminMdp;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", adminNom=" + admin_nom + ", adminMdp=" + admin_mdp + "]";
	}
	
}
