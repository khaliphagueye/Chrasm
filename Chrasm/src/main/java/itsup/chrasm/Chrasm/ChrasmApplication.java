package itsup.chrasm.Chrasm;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import itsup.chrasm.Chrasm.modele.User;



@SpringBootApplication
@Component
public class ChrasmApplication implements CommandLineRunner{
	//@Autowired
	//@Qualifier("User")
	User user = new User("Khalifa","123gueye");
	public static void main(String[] args) {
		SpringApplication.run(ChrasmApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		user.toString();
		
	}

}
