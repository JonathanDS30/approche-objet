package entites;

import entites2.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		Personne Pr1 = new Personne();
		Pr1.nom = "Nom1";
		Pr1.prenom = "Prenom1";
		Pr1.adressePostale = new AdressePostale();
		Pr1.adressePostale.numeroRue = 433;
		Pr1.adressePostale.libelleRue = "rue des tonnes";
		Pr1.adressePostale.codePostal = 30000;
		Pr1.adressePostale.ville = "Nîmes";
		
		Personne Pr2 = new Personne();
		Pr2.nom = "Nom2";
		Pr2.prenom = "Prenom2";
		Pr2.adressePostale = new AdressePostale();
		Pr2.adressePostale.numeroRue = 212;
		Pr2.adressePostale.libelleRue = "des catalognes";
		Pr2.adressePostale.codePostal = 30000;
		Pr2.adressePostale.ville = "Nîmes";
		
		
		
		

	}

}
