package fr.diginamic.banque.entites;

public class TestOperation {

	public static void main(String[] args) {

		Operation[] tabOperations = new Operation[8];
		Credit c1 = new Credit("10/07/2022", 92.6);
		Credit c2 = new Credit("11/08/2022", 100.6);
		Credit c3 = new Credit("12/09/2022", 110.6);
		Credit c4 = new Credit("13/10/2022", 120.6);

		Debit d1 = new Debit("20/07/2022", 80.5);
		Debit d2 = new Debit("21/08/2022", 70.5);
		Debit d3 = new Debit("24/09/2022", 60.5);
		Debit d4 = new Debit("22/10/2022", 50.5);

		tabOperations[0] = c1;
		tabOperations[1] = d1;

		tabOperations[2] = c2;
		tabOperations[3] = d2;

		tabOperations[4] = c3;
		tabOperations[5] = d3;

		tabOperations[6] = c4;
		tabOperations[7] = d4;

		int montantTotal = 0;
		for (int i = 0; i < tabOperations.length; i++) {
			if (tabOperations[i].getType().equals("CREDIT")) {
				montantTotal += tabOperations[i].getMontant();
			} else {
				montantTotal -= tabOperations[i].getMontant();
			}
		}

		System.out.println("le montant total du compte est " + montantTotal);
	}

}
