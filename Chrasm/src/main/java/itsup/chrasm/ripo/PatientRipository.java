package itsup.chrasm.ripo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import itsup.chrasm.modele.Patient;
@Repository
public interface PatientRipository extends JpaRepository<Patient, Long>{

	Patient findPatientById(Long id);

	void deletePatientById(long id);


}
