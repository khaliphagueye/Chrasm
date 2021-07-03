package itsup.chrasm.ripo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import itsup.chrasm.modele.RendezVous;
@Repository
public interface RendezVousRepository extends JpaRepository<RendezVous, Long> {

	RendezVous findRendezVousById(Long id);

	void deleteRendezVousById(long id);

	@Query(value = "SELECT date_rv, count(*)  FROM rendez_vous r group by date_rv", nativeQuery = true)
	public List<RendezVous> findAllByTypeObjet();
	

}
