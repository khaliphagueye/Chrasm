package itsup.chrasm.ripo;

import org.springframework.data.jpa.repository.JpaRepository;

import itsup.chrasm.modele.Contact;

public interface ContactRipository extends JpaRepository<Contact, Long>{

	Contact findContactById(Long id);

	void deleteContactById(long id);

}
