package listes;

import java.util.ArrayList;

public class CreationListe {

	public static void main(String[] args) {
		ArrayList<Integer> listeEntier = new ArrayList<Integer>();

		for (int i = 1; i <= 100; i++) {
			listeEntier.add(i);
		}

		System.out.println(listeEntier);
		System.out.println("La taille de la liste : " + listeEntier.size());
	}

}
