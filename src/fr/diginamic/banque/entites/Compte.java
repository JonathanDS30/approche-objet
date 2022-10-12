package fr.diginamic.banque.entites;

public class Compte {
	private String numCompte;
	double soldeCompte;

	public Compte(String numCompte, double soldeCompte) {
		this.numCompte = numCompte;
		this.soldeCompte = soldeCompte;
	}

	public String toString() {
		return "Compte  1 toString: \nNuméro de compte : " + numCompte + "\nSolde du compte : " + soldeCompte + "€";
	}

	public String getNumCompte() {
		return numCompte;
	}

	public void setNumCompte(String numCompte) {
		this.numCompte = numCompte;
	}

	public double getSoldeCompte() {
		return soldeCompte;
	}

	public void setSoldeCompte(int soldeCompte) {
		this.soldeCompte = soldeCompte;
	}

}
