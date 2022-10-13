package fr.diginamic.essais;

import fr.diginamic.entites.Cercle;
import fr.diginamic.utils.CercleFactory;

public class TestCercle {

	public static void main(String[] args) {
		Cercle c1= new Cercle(10);
		System.out.println(c1);
		
		
		// Avec la méthode static
		Cercle c2 = CercleFactory.afficherCercle(50);
		System.out.println(c2);
	}

}
