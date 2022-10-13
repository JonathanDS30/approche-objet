package fr.diginamic.operations;

public class Operations {
	public static double calcul(double a, double b, char operateur) {
		
		// test avec le switch
		switch(operateur) {
		case '+': 
			return a + b;
			
			
		case '-':
			return  a - b;
			
		
		case '*':
			return a * b ;
			
		
		case '/':
			 return a / b;
			 
			 
		default : 
			return 0;
		}


		// test avec le if
//		double resultat = 0;
//
//		if (Operateur == '+') {
//			resultat = a + b;
//		}
//
//		if (Operateur == '-') {
//			resultat = a - b;
//		}
//		
//		if (Operateur == '*') {
//			resultat = a * b;
//		}
//		
//		if (Operateur == '/') {
//			resultat = a / b;
//		}
//		return resultat;
	}
}
