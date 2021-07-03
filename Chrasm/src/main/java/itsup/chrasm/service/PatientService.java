package itsup.chrasm.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import itsup.chrasm.modele.Patient;
import itsup.chrasm.ripo.PatientRipository;
import lombok.AllArgsConstructor;

@Service

@AllArgsConstructor
public class PatientService {
	@Autowired
	PatientRipository patientRipository;
	public Patient findPatient(Long id) {
		return patientRipository.findPatientById(id);
	}
	public List<Patient> findAllPatients(){
		return patientRipository.findAll();
		
	}
	public Patient addPatient(Patient patient) {
		return patientRipository.save(patient);
		
	}
	public Patient updatePatient(Patient patient) {
		return patientRipository.save(patient); 
		
	}
	public void deletePatient(long id) {
		patientRipository.deletePatientById(id);
	}
}
