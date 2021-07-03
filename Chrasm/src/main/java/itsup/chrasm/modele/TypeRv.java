package itsup.chrasm.modele;



public enum TypeRv {
	medecinegenerale("medecinegenerale"),
	immunologie("immunologie"),
	radiologie("radiologie"),
	chirurgie("chirurgie"),
	neurologie("neurologie"),
	pneumologie("pneumologie"),
	cardiologie("cardiologie"),
	odontologie("odontologie"),
	dermatologie("dermatologie"),
	service_accueil_de_traitement_des_urgences("service_accueil_de_traitement_des_urgences"),
	traumatologie("traumatologie");
  private  String label;
private TypeRv(String label) {
	  this.setLabel(label);
	
}
public String getLabel() {
	return label;
}
public void setLabel(String label) {
	this.label = label;
}


  
}
