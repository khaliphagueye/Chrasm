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
public class RendezVous {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id ;
	private TypeRv typeObjet;
	private String dateRv;
	
	public RendezVous(TypeRv typeObjet, String dateRv2) {
		this.typeObjet=typeObjet;
		this.dateRv= dateRv2;
	}
	
}
 