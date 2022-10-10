package entites;

import entites2.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		AdressePostale adrPr1 = new AdressePostale(433, "des maréchaux", 30000, "Nîmes");
		Personne pr1 = new Personne("Nom1", "Prenom1", adrPr1);
		
		System.out.println("Voici les informations de la personne 1 : " + pr1.prenom + " " + pr1.nom);
	}

}
