package listes;

import java.util.ArrayList;

public class TestListeInt {

	public static void main(String[] args) {
		ArrayList<Integer> liste = new ArrayList<Integer>();
		liste.add(-1);
		liste.add(5);
		liste.add(7);
		liste.add(3);
		liste.add(-2);
		liste.add(4);
		liste.add(8);
		liste.add(5);

		// Permet d'afficher tous les éléments de la liste
		System.out.println("tous les éléments de la liste " + liste);

		// Permet d'afficher la taille de la liste
		System.out.println("La taille de la liste : " + liste.size());

		// Permet de rechercher le plus grand élément de la liste
		int max = liste.get(0);
		for (Integer integer : liste) {
			max = max > integer ? max : integer;
		}

		System.out.println(max);

		// Permet de supprimer le plus petit élément du tableau
		int min = liste.get(0);
		for (Integer integer : liste) {
			min = min < integer ? min : integer;
			if (min > integer) {
				min = integer;
			}
		}
		System.out.println("la valeur qui va être supprimé " + min);
		liste.remove(Integer.valueOf(min));
		System.out.println("Le contenu du tableau après avoir supprimé la plus petite valeur " + liste);

		// Permet de rechercher tous les éléments négatif et de les rendre

		for (int i = 0; i < liste.size(); i++) {
			if (liste.get(i) < 0) {
				liste.set(i, Math.abs(liste.get(i)));
			}
		}
		System.out.println("Le contenu du tableau après avoir convertis les valeurs négative en positive : " + liste);

	}

}
