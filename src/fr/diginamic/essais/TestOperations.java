package fr.diginamic.essais;

import fr.diginamic.operations.Operations;

public class TestOperations {

	public static void main(String[] args) {
		double c1 = Operations.calcul(10, 2, '+');
		System.out.println(c1);
		
		double c2 = Operations.calcul(12, 2, '-');
		System.out.println(c2);
		
		double c3 = Operations.calcul(15, 2, '*');
		System.out.println(c3);
		
		double c4 = Operations.calcul(15, 2, '/');
		System.out.println(c4);


	}

}
