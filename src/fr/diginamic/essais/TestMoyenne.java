package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;

public class TestMoyenne {

	public static void main(String[] args) {
		CalculMoyenne a = new CalculMoyenne();
		a.ajout(12);
		a.ajout(2);
		a.ajout(2);
		a.ajout(2);
		a.ajout(20);

		System.out.println(a.calcul());

		CalculMoyenne b = new CalculMoyenne();
		b.ajout(12);
		b.ajout(13);
		b.ajout(14);

		System.out.println(b.calcul());
	}

}
