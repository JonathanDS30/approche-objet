package fr.diginamic.tri;

import java.util.ArrayList;
import java.util.Collections;

public class TestListeString {

	public static void main(String[] args) {

		// Création d'une liste à partir de la variable Ville

		ArrayList<Ville> villesHab = new ArrayList<Ville>();
		villesHab.add(new Ville("Nice", 343000));
		villesHab.add(new Ville("Carcassone", 47800));
		villesHab.add(new Ville("Narbonne", 53400));
		villesHab.add(new Ville("Lyon", 484000));
		villesHab.add(new Ville("Foix", 9700));
		villesHab.add(new Ville("Pau", 77200));
		villesHab.add(new Ville("Marseille", 857000));
		villesHab.add(new Ville("Tarbes", 40600));

		Collections.sort(villesHab);

		for (Ville v : villesHab) {
			System.out.println(v);
		}
		// permet de mélanger la liste
		Collections.shuffle(villesHab);

		System.out.println("------------");
		Collections.sort(villesHab, new ComparatorHabitant());

		for (Ville v : villesHab) {
			System.out.println(v);
		}

		Collections.shuffle(villesHab);

		System.out.println("------------");
		Collections.sort(villesHab, new ComparatorNom());

		for (Ville v : villesHab) {
			System.out.println(v);
		}
	}
}
