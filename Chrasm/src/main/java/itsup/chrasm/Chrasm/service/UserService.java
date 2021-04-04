package itsup.chrasm.Chrasm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import itsup.chrasm.Chrasm.modele.User;
import itsup.chrasm.Chrasm.ripo.UserRipository;
@Service
public class UserService {
	@Autowired
	private  UserRipository userRipo ;

	public UserService(UserRipository userRipo ) {
		this.userRipo = userRipo;
	}
	public User findUser(long id) {
		return userRipo.findUserById(id);
	}
	public User addUser(User user) {
		return userRipo.save(user);
		
	}
	public User updateUser(User user) {
		return userRipo.save(user); 
		
	}

}
