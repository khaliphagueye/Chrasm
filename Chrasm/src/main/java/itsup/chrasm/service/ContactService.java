package itsup.chrasm.Chrasm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import itsup.chrasm.Chrasm.modele.Contact;
import itsup.chrasm.Chrasm.ripo.ContactRipository;

@Service
@Transactional
public class ContactService {
	@Autowired
	ContactRipository contactRipository;

	public ContactService(ContactRipository contactRipository) {
		this.contactRipository = contactRipository;
	}
	public Contact findContact(Long id) {
		return contactRipository.findContactById(id);
	}
	public List<Contact> findAllContacts(){
		return contactRipository.findAll();
		
	}
	public Contact addContact(Contact contact) {
		return contactRipository.save(contact);
		
	}
	public Contact updateContact(Contact contact) {
		return contactRipository.save(contact); 
		
	}
	public void deleteContact(long id) {
		contactRipository.deleteContactById(id);
	}
	
	

}
