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

import itsup.chrasm.Chrasm.modele.UserConnexion;
import itsup.chrasm.Chrasm.service.UserConnexionService;

@RestController
@RequestMapping("/userConnexion")
public class UserConnexionRequest {
	@Autowired
	private UserConnexionService userConnexionService;

	public UserConnexionRequest(UserConnexionService userConnexionService) {
		super();
		this.userConnexionService = userConnexionService;
	}
	@GetMapping("/all")
	public ResponseEntity<List<UserConnexion>> getAllUsers(){
		List<UserConnexion> users = userConnexionService.findAllUsersConnexion();
		return new ResponseEntity<>(users, HttpStatus.OK);
	}
	@GetMapping("/find/{id}")
	public ResponseEntity<UserConnexion> getUserConnexionById(@PathVariable("id") Long id	){
		UserConnexion userConnexion = userConnexionService.findUserConnexion(id);
		return new ResponseEntity<>(userConnexion, HttpStatus.OK);
	}
	@PostMapping("/add")
	public ResponseEntity<UserConnexion> addUserConnexion(@RequestBody UserConnexion userConnexion){
		UserConnexion newUserConnexion = userConnexionService.addUserConnexion(userConnexion);
		return new ResponseEntity<>(newUserConnexion, HttpStatus.CREATED);
	}
	@PutMapping("/update")
	public ResponseEntity<UserConnexion> updateUser(@RequestBody UserConnexion userConnexion){
		UserConnexion updateUserConnexion = userConnexionService.updateUserConnexion(userConnexion);
		return new ResponseEntity<>(updateUserConnexion, HttpStatus.OK);
	}
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deleteUser(@PathVariable("id") Long id	){
		 userConnexionService.deleteUserConnexion(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
