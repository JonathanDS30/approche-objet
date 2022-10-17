package maps;

import java.util.ArrayList;
import java.util.HashMap;

import listes.Ville;

public class MapVilles2 {

	public static void main(String[] args) {
		ArrayList<Ville> liste = new ArrayList<>();
		liste.add(new Ville("Nice", 343000));
		liste.add(new Ville("Carcassonne", 47800));
		liste.add(new Ville("Narbonne", 53400));
		liste.add(new Ville("Lyon", 484000));
		liste.add(new Ville("Foix", 9700));
		liste.add(new Ville("Pau", 77200));
		liste.add(new Ville("Marseille", 850700));
		liste.add(new Ville("Tarbes", 40600));
		
		// on créer la map
		
		HashMap<String, Ville> mapVilles2 = new HashMap<>();
		for(Ville v: liste) {
			mapVilles2.put(v.getNomVille(), v);
		}
		
		Integer min = Integer.MAX_VALUE;
		String nomVilleMin = null;
		for (String nomVille: mapVilles2.keySet()) {
			Ville v = mapVilles2.get(nomVille);
			if (v.getNbHabitant()<min) {
				min = v.getNbHabitant();
				nomVilleMin = nomVille;
			}
		}
		mapVilles2.remove(nomVilleMin);
		
		// Résultat après avoir supprimé la ville avec la plus petite population de la liste 
		System.out.println(mapVilles2);
		
	}

}
