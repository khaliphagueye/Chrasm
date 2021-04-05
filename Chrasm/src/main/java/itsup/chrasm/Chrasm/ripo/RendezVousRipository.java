package itsup.chrasm.Chrasm.ripo;

import org.springframework.data.jpa.repository.JpaRepository;

import itsup.chrasm.Chrasm.modele.RendezVous;

public interface RendezVousRipository extends JpaRepository<RendezVous, Long>{

	RendezVous findRendezVousById(Long id);

	void deleteRendezVousById(long id);

}
