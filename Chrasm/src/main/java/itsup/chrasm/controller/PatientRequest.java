package itsup.chrasm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import itsup.chrasm.modele.Patient;
import itsup.chrasm.service.PatientService;
import lombok.Data;

@Controller
@RequestMapping("/patient")
@Data
public class PatientRequest {
	@Autowired
	PatientService patientService;
	
	@GetMapping("/")
	public String accueil() {
		return "index";
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Patient>> getAllPatients(){
		List<Patient> patient = patientService.findAllPatients();
		return new ResponseEntity<>(patient, HttpStatus.OK);
	}
	@GetMapping("/find/{id}")
	public ResponseEntity<Patient> getPatientById(@PathVariable("id") Long id	){
		Patient patient = patientService.findPatient(id);
		return new ResponseEntity<>(patient, HttpStatus.OK);
	}
	@PostMapping("/add")
	public ResponseEntity<Patient> addPatient(@RequestBody Patient patient){
		Patient newPatient = patientService.addPatient(patient);
		return new ResponseEntity<>(newPatient, HttpStatus.CREATED);
	}
	@PutMapping("/update")
	public ResponseEntity<Patient> updatePatient(@RequestBody Patient patient){
		Patient updatePatient = patientService.updatePatient(patient);
		return new ResponseEntity<>(updatePatient, HttpStatus.OK);
	}
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deletePatient(@PathVariable("id") Long id	){
		patientService.deletePatient(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
