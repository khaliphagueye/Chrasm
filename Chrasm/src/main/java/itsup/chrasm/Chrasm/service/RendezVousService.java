package itsup.chrasm.Chrasm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import itsup.chrasm.Chrasm.modele.RendezVous;
import itsup.chrasm.Chrasm.ripo.RendezVousRipository;

@Service
@Transactional
public class RendezVousService {
	@Autowired
	RendezVousRipository rendezVousRipository;

	public RendezVousService(RendezVousRipository rendezVousRipository) {
		this.rendezVousRipository = rendezVousRipository;
	}
	public RendezVous findRendezVous(Long id) {
		return rendezVousRipository.findRendezVousById(id);
	}
	public List<RendezVous> findAllRendezVous(){
		return rendezVousRipository.findAll();
		
	}
	public RendezVous addRendezVous(RendezVous rendezVous) {
		return rendezVousRipository.save(rendezVous);
		
	}
	public RendezVous updateRendezVous(RendezVous rendezVous) {
		return rendezVousRipository.save(rendezVous); 
		
	}
	public void deleteRendezVous(long id) {
		rendezVousRipository.deleteRendezVousById(id);
	}
	

}
