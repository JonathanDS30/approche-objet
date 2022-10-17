package listes;

import java.util.ArrayList;
import java.util.Iterator;

public class TestListeString {

	public static void main(String[] args) {
		// Creation de la liste de ville
		ArrayList<String> listeVille = new ArrayList<String>();
		listeVille.add("Nice");
		listeVille.add("Carcassone");
		listeVille.add("Narbonne");
		listeVille.add("Lyon");
		listeVille.add("Foix");
		listeVille.add("Pau");
		listeVille.add("Marseille");
		listeVille.add("Tarbes");

		// Recherche de la ville avec le plus grand nombre de lettres
		String maxLettre = "";
		for (String string : listeVille) {
			maxLettre = string.length() > maxLettre.length() ? string : maxLettre;
		}

		System.out.println("Ville avec le plus grand nombre de lettre : " + maxLettre);

		// Permet de mettre en majuscule tout le contenu de la liste

		for (int i = 0; i < listeVille.size(); i++) {
			listeVille.set(i, listeVille.get(i).toUpperCase());
		}
		System.out.println("Liste des villes après avoir mis en majuscule toutes les lettres : " + listeVille);

		// Permet de supprimer les villes dont le nom commence par la lettre N

		Iterator<String> villeN = listeVille.iterator();
		while (villeN.hasNext()) {
			String ville = villeN.next();
			if (ville.charAt(0) == 'N') {
				villeN.remove();
			}
		}
		System.out.println("Liste des villes qui ne commencent pas par un N" + listeVille);

		// Création d'une liste à partir de la variable Ville

		ArrayList<Ville> villesHab = new ArrayList<Ville>();
		villesHab.add(new Ville("Nice", 343000));
		villesHab.add(new Ville("Carcassone", 47800));
		villesHab.add(new Ville("Narbonne", 53400));
		villesHab.add(new Ville("Lyon", 484000));
		villesHab.add(new Ville("Foix", 857000));
		villesHab.add(new Ville("Pau", 77200));
		villesHab.add(new Ville("Marseille", 484000));
		villesHab.add(new Ville("Tarbes", 40600));
		
		// Recherche de la ville la plus peuplée
		Ville villeMaxHab = villesHab.get(0);
		for(Ville ville : villesHab) {
			villeMaxHab = villeMaxHab.getNbHabitant() < villeMaxHab.getNbHabitant() ? villeMaxHab : ville;
		}
		
		System.out.println("Ville la plus peuplé:  " + villeMaxHab);
	}
}
