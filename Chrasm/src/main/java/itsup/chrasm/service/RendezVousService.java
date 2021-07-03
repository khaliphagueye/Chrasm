package itsup.chrasm.Chrasm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import itsup.chrasm.Chrasm.modele.Patient;
import itsup.chrasm.Chrasm.ripo.RendezVousRipository;

@Service
@Transactional
public class RendezVousService {
	@Autowired
	RendezVousRipository rendezVousRipository;

	public RendezVousService(RendezVousRipository rendezVousRipository) {
		this.rendezVousRipository = rendezVousRipository;
	}
	public Patient findRendezVous(Long id) {
		return rendezVousRipository.findRendezVousById(id);
	}
	public List<Patient> findAllRendezVous(){
		return rendezVousRipository.findAll();
		
	}
	public Patient addRendezVous(Patient patient) {
		return rendezVousRipository.save(patient);
		
	}
	public Patient updateRendezVous(Patient patient) {
		return rendezVousRipository.save(patient); 
		
	}
	public void deleteRendezVous(long id) {
		rendezVousRipository.deleteRendezVousById(id);
	}
	

}
