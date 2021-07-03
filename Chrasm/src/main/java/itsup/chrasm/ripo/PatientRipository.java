package itsup.chrasm.Chrasm.ripo;

import org.springframework.data.jpa.repository.JpaRepository;

import itsup.chrasm.Chrasm.modele.Patient;

public interface RendezVousRipository extends JpaRepository<Patient, Long>{

	Patient findRendezVousById(Long id);

	void deleteRendezVousById(long id);

}
