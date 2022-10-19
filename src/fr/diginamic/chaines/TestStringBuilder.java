package fr.diginamic.chaines;

public class TestStringBuilder {

	public static void main(String[] args) {

		long debut = System.currentTimeMillis();

		StringBuilder s = new StringBuilder();
		for (int i = 1; i <= 100000; i++) {
			s.append(i);
		}

		long fin = System.currentTimeMillis();

		System.out.println("Temps écoulé en millisecondes: " + (fin - debut));

		long debutB = System.currentTimeMillis();

		String c = new String();
		for (int i = 1; i <= 100000; i++) {
			c += i;
		}
		
		 long finB = System.currentTimeMillis();
		System.out.println("Temps écoulé en millisecondes avec la méthode classique : " + (finB - debutB));
	}
}
