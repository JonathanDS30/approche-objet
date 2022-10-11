package entites;

import entites2.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		Personne pe1 = new Personne("Santina", "Jonathan");
		
		AdressePostale adr1 = new AdressePostale(433, "des tonneliers", 30000, "Nimes");
		AdressePostale adr2 = new AdressePostale(433, "des tonneliers", 30000, "Montpellier");
		
		pe1.adressePostale = adr1;
		
		System.out.println(pe1.getAdressePostale().ville);
		
		pe1.identifiant();
		
		pe1.setNom("LEA");
		
		pe1.identifiant();
		
		pe1.setPrenom("Laurent");
		
		pe1.identifiant();
		
		pe1.setAdressePostale(adr2);
		
		System.out.println(pe1.getAdressePostale().ville);
		
		String nom = pe1.getNom();
		System.out.println(nom);
	}
	


}
