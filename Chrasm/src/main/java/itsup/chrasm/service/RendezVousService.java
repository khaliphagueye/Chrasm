package itsup.chrasm.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import itsup.chrasm.modele.RendezVous;
import itsup.chrasm.ripo.RendezVousRepository;
import lombok.AllArgsConstructor;


@Service
@Transactional
@AllArgsConstructor
public class RendezVousService {
	@Autowired
	RendezVousRepository rendezVousRipository;
	
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
	public List<RendezVous> findAllByTypeObjett() {
		
		return rendezVousRipository.findAllByTypeObjet();
	}
	
}
