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

import itsup.chrasm.Chrasm.modele.Contact;
import itsup.chrasm.Chrasm.service.ContactService;

@RestController
@RequestMapping("/contact")
public class ContactRequest {
	@Autowired
	ContactService contactService;

	public ContactRequest(ContactService contactService) {
		super();
		this.contactService = contactService;
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Contact>> getAllContact(){
		List<Contact> contacts = contactService.findAllContacts();
		return new ResponseEntity<>(contacts, HttpStatus.OK);
	}
	@GetMapping("/find/{id}")
	public ResponseEntity<Contact> getContactById(@PathVariable("id") Long id	){
		Contact contact = contactService.findContact(id);
		return new ResponseEntity<>(contact, HttpStatus.OK);
	}
	@PostMapping("/add")
	public ResponseEntity<Contact> addUser(@RequestBody Contact user){
		Contact newUser = contactService.addContact(user);
		return new ResponseEntity<>(newUser, HttpStatus.CREATED);
	}
	@PutMapping("/update")
	public ResponseEntity<Contact> updateUser(@RequestBody Contact contact){
		Contact updateUser = contactService.updateContact(contact);
		return new ResponseEntity<>(updateUser, HttpStatus.OK);
	}
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deleteContact(@PathVariable("id") Long id	){
		 contactService.deleteContact(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	

}
