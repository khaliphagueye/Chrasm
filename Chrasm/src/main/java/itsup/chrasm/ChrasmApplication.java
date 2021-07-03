package itsup.chrasm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import itsup.chrasm.modele.Patient;
import itsup.chrasm.modele.RendezVous;
import itsup.chrasm.modele.TypeRv;
import itsup.chrasm.ripo.PatientRipository;

@SpringBootApplication
@Component
public class ChrasmApplication implements CommandLineRunner{
	
	@Autowired
	PatientRipository patientRipository;
	
	public static void main(String[] args) {
		SpringApplication.run(ChrasmApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Patient patient = new Patient("Gueye", "khalipha", "gueye@gmail.com", "062387047", "KHALIFAGUEYE", "1441", "1441");
		RendezVous rv1 = new RendezVous(TypeRv.cardiologie, "14/04/2021");
		RendezVous rv2 = new RendezVous(TypeRv.chirurgie, "19/04/2021");
		RendezVous rv3 = new RendezVous(TypeRv.chirurgie, "19/04/2021");
		Patient patient1 = new Patient("Mbengue", "Ndeya", "ndeya@gmail.com", "062387047", "ndeyachou", "1441gueye", "1441gueye");
		RendezVous rv11 = new RendezVous(TypeRv.cardiologie, "03/05/2021");
		RendezVous rv22 = new RendezVous(TypeRv.chirurgie, "19/07/2021");
		RendezVous rv33 = new RendezVous(TypeRv.neurologie, "14/10/2021");
		patient.getRendezvous().add(rv1);
		patient.getRendezvous().add(rv2);
		patient.getRendezvous().add(rv3);
		patient1.getRendezvous().add(rv11);
		patient1.getRendezvous().add(rv22);
		patient1.getRendezvous().add(rv33);
		
		this.patientRipository.save(patient);
		this.patientRipository.save(patient1);
		System.out.println(rv11);

	}
	//

}
