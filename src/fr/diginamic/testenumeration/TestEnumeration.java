package fr.diginamic.testenumeration;

public class TestEnumeration {

	public static void main(String[] args) {
		// exo 1 TP

		// Boucle pour afficher toutes les saisons
		Saison[] vSaison = Saison.values(); // on récupérer les valeurs de saisons que l'on mets dans la variable saison
											// qui est de type tableau de Saison
		for (Saison s : vSaison) {
			System.out.println(s);
		}

		// ETE
		String nom = "ETE"; // création de la variable nom de type String
		Saison sEte = Saison.valueOf(nom); // On attribut la valeur de nom dans une variable de type Saison
		System.out.println(sEte.getlibelle()); // on affiche la valeur du libelle

		// HIVER

		String libelle = "Hiver";
		Saison methode = Saison.getSaison(libelle);
		System.out.println("La saison est : " + methode + " Son numéro d'ordre : " + methode.getNumOrdre());

	}

}
