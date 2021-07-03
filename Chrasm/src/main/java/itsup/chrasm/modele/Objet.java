package itsup.chrasm.modele;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Objet {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private TypeRv nomObjet;
	public Objet(TypeRv nomObjet) {
		super();
		this.nomObjet = nomObjet;
	}
	
}
