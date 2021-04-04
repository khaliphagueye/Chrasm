package itsup.chrasm.Chrasm.ripo;

import org.springframework.data.jpa.repository.JpaRepository;

import itsup.chrasm.Chrasm.modele.User;

public interface UserRipository extends JpaRepository<User, Long> {
	public User findUserById(long id);

}
