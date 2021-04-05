package itsup.chrasm.Chrasm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import itsup.chrasm.Chrasm.modele.UserConnexion;
import itsup.chrasm.Chrasm.ripo.UserConnexionRipository;

@Service
@Transactional
public class UserConnexionService {
	@Autowired
	private  UserConnexionRipository userConnexionRipo ;

	public UserConnexionService(UserConnexionRipository userConnexionRipo ) {
		this.userConnexionRipo = userConnexionRipo;
	}
	public UserConnexion findUserConnexion(Long id) {
		return userConnexionRipo.findUserConnexionById(id);
	}
	public List<UserConnexion> findAllUsersConnexion(){
		return userConnexionRipo.findAll();
		
	}
	public UserConnexion addUserConnexion(UserConnexion user) {
		return userConnexionRipo.save(user);
		
	}
	public UserConnexion updateUserConnexion(UserConnexion user) {
		return userConnexionRipo.save(user); 
		
	}
	public void deleteUserConnexion(long id) {
		userConnexionRipo.deleteUserById(id);
	}
}
