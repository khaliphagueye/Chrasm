package itsup.chrasm.Chrasm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import itsup.chrasm.Chrasm.modele.User;
import itsup.chrasm.Chrasm.ripo.UserRipository;
@Service
@Transactional
public class UserService {
	@Autowired
	private  UserRipository userRipo ;

	public UserService(UserRipository userRipo ) {
		this.userRipo = userRipo;
	}
	public User findUser(Long id) {
		return userRipo.findUserById(id);
	}
	public List<User> findAllUsers(){
		return userRipo.findAll();
		
	}
	public User addUser(User user) {
		return userRipo.save(user);
		
	}
	public User updateUser(User user) {
		return userRipo.save(user); 
		
	}
	public void deleteUser(long id) {
		userRipo.deleteUserById(id);
	}

}
