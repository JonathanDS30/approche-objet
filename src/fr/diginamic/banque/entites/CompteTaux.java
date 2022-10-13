package fr.diginamic.banque.entites;

public class CompteTaux extends Compte {

	private double tauxRemu;

	public CompteTaux(String numCompte, double soldeCompte, double tauxRemu) {
		super(numCompte, soldeCompte);
		this.numCompte = numCompte;
		this.soldeCompte = soldeCompte;
		this.tauxRemu = tauxRemu;
	}

	public String toString() {
		return super.toString() + " avec un taux de " + this.tauxRemu;
	}
}