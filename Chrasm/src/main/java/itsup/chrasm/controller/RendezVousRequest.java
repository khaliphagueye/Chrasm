package itsup.chrasm.Chrasm;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import itsup.chrasm.Chrasm.modele.Patient;
import itsup.chrasm.Chrasm.service.RendezVousService;

@RestController
@RequestMapping("/rendezVous")

public class RendezVousRequest {
	@Autowired
	RendezVousService rendezVousService;
	public RendezVousRequest(RendezVousService rendezVousService) {
		this.rendezVousService = rendezVousService;
	}
	@GetMapping("/all")
	public ResponseEntity<List<Patient>> getAllRendezVous(){
		List<Patient> patient = rendezVousService.findAllRendezVous();
		return new ResponseEntity<>(patient, HttpStatus.OK);
	}
	@GetMapping("/find/{id}")
	public ResponseEntity<Patient> getRendezVousById(@PathVariable("id") Long id	){
		Patient patient = rendezVousService.findRendezVous(id);
		return new ResponseEntity<>(patient, HttpStatus.OK);
	}
	@PostMapping("/add")
	public ResponseEntity<Patient> addRendezVous(@RequestBody Patient patient){
		Patient newRendezVous = rendezVousService.addRendezVous(patient);
		return new ResponseEntity<>(newRendezVous, HttpStatus.CREATED);
	}
	@PutMapping("/update")
	public ResponseEntity<Patient> updateRendezVous(@RequestBody Patient patient){
		Patient updateRendezVous = rendezVousService.updateRendezVous(patient);
		return new ResponseEntity<>(updateRendezVous, HttpStatus.OK);
	}
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deleteRendezVous(@PathVariable("id") Long id	){
		rendezVousService.deleteRendezVous(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
