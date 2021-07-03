package itsup.chrasm.Chrasm.ripo;

import org.springframework.data.jpa.repository.JpaRepository;

import itsup.chrasm.Chrasm.modele.UserConnexion;

public interface UserConnexionRipository extends JpaRepository<UserConnexion, Long> {

	void deleteUserById(long id);

	UserConnexion findUserConnexionById(Long id);

}
