package itsup.chrasm.Chrasm.ripo;

import org.springframework.data.jpa.repository.JpaRepository;

import itsup.chrasm.Chrasm.modele.Contact;

public interface ContactRipository extends JpaRepository<Contact, Long>{

	Contact findContactById(Long id);

	void deleteContactById(long id);

}
