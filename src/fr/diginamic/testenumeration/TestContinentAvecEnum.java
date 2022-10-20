package fr.diginamic.testenumeration;

import java.util.ArrayList;
import java.util.Arrays;

import listes.Ville;

public class TestContinentAvecEnum {

	public static void main(String[] args) {
		
		// instanciation des villes avec le nom, le nombre d'habitant et sont continent 
		Ville newYork = new Ville("New York", 8_000_000, Continent.AMERIQUE);
		Ville paris = new Ville("Paris", 2_000_000, Continent.EUROPE);
		Ville pekin = new Ville("Pekin", 21_000_000, Continent.ASIE);
		Ville moscou = new Ville("Moscou", 10_000_000, Continent.EUROPE);
		Ville berlin= new Ville("Berlin", 3_700_000, Continent.EUROPE);
		Ville sydney = new Ville("Sydney", 4_800_000, Continent.OCEANIE);
		Ville saoPaulo = new Ville("Sao Paulo", 11_000_000, Continent.AMERIQUE);
		Ville dakar = new Ville("Dakar", 10_000_000, Continent.AFRIQUE);
		
		// Création d'une liste des villes 
		ArrayList<Ville> listeVilleContinent = new ArrayList<>(Arrays.asList(newYork, paris, pekin, moscou, berlin, sydney, saoPaulo, dakar));
		
		// Boucle pour parcourir la liste 
		for(Ville villes : listeVilleContinent) {
			System.out.println(villes);
		}
		
	}

}
