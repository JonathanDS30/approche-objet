package maps;

import java.util.HashMap;

public class MapVilles {

	public static void main(String[] args) {
		
		
		HashMap<Integer, String> mapVilles = new HashMap<>(); 
		 mapVilles.put(13, "Marseille"); 
		 mapVilles.put(34, "Montpellier"); 
		 mapVilles.put(44, "Nantes"); 
		 mapVilles.put(75, "Paris"); 
		 mapVilles.put(31, "Toulouse");
		 
		 // ajout des info pour Lille, Lyon et Bordeaux
		 mapVilles.put(59, "Lille");
		 mapVilles.put(69, "Lyon");
		 mapVilles.put(33, "Bordeaux");
		 
		 // Permet de parcourir les clées 
		 System.out.println("Liste des clés : ");
		 for(Integer key : mapVilles.keySet()) {
			 System.out.println("- " + key);
		 }
		 System.out.println("-------");
		 
		 System.out.println("Liste des valeurs : ");
		 for(String value : mapVilles.values()) {
			 System.out.println("- " + value);
		 }
		 
		 System.out.println("La taille de la map est de " + mapVilles.size());
		 
	}

}
