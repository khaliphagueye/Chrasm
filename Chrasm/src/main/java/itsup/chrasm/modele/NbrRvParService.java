package itsup.chrasm.modele;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class NbrRvParService {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id ;
	private int nbRv;
	private String dateRv;

}
