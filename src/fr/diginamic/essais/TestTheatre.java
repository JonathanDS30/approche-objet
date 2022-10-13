package fr.diginamic.essais;

import fr.diginamic.entites.Theatre;

public class TestTheatre {

	public static void main(String[] args) {
		Theatre t1 = new Theatre("Théâtre de Paris", 150, 100, 1000);
		t1.inscrire(10, 10);
	}

}
