package fr.diginamic.tri;

public class Ville implements Comparable<Ville> {
	private String nomVille;
	private int nbHabitant;

	public Ville(String nomVille, int nbHabitant) {
		super();
		this.nomVille = nomVille;
		this.nbHabitant = nbHabitant;
	}

	public String getNomVille() {
		return nomVille;
	}

	public void setNomVille(String nomVille) {
		this.nomVille = nomVille;
	}

	public int getNbHabitant() {
		return nbHabitant;
	}

	public void setNbHabitant(int nbHabitant) {
		this.nbHabitant = nbHabitant;
	}

	@Override
	public int compareTo(Ville autre) {
		if (this.nbHabitant > autre.getNbHabitant()) {
			return 1;
		} else if (this.nbHabitant < autre.getNbHabitant()) {
			return -1;
		} else {
			return 0;
		}

	}

	@Override
	public String toString() {
		return nomVille + " " + nbHabitant;
	}

}
