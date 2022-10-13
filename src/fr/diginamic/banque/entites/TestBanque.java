package fr.diginamic.banque.entites;

public class TestBanque {

	public static void main(String[] args) {
		Compte[] tabComptes = new Compte[2];
		tabComptes[0] = new Compte("FR030", 2304.21);
		tabComptes[1] = new CompteTaux("FR644", 2000, 2);
		
		System.out.println("Voici le tableau des comptes : ");
		for (int i = 0; i < tabComptes.length; i++) {
			System.out.println("Le numéro de compte " + i + tabComptes[i].toString());
		}

	}

}
