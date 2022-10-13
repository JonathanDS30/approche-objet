package fr.diginamic.entites;

public class Theatre {
	String nomTheatre;
	int capaciteMax;
	int nbClient;
	double recetteTotale;

	public Theatre(String nomTheatre, int capaciteMax, int nbClient, double recetteTotale) {
		super();
		this.nomTheatre = nomTheatre;
		this.capaciteMax = capaciteMax;
		this.nbClient = nbClient;
		this.recetteTotale = recetteTotale;
	}

	public void inscrire(int nbClient, double prixPlace) {
		if (this.capaciteMax > this.nbClient + nbClient) {
			this.nbClient += nbClient;
			this.recetteTotale = prixPlace * this.nbClient;

			System.out.println("Nombre de client : " + this.nbClient + " La recette totale : " + this.recetteTotale);
		} else {
			System.out.println("La capacité max est atteint");
		}
	}

	public int getNbClient() {
		return nbClient;
	}

	public void setNbClient(int nbClient) {
		this.nbClient = nbClient;
	}

	public double getRecetteTotale() {
		return recetteTotale;
	}

	public void setRecetteTotale(double recetteTotale) {
		this.recetteTotale = recetteTotale;
	}

}
