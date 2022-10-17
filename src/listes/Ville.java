package listes;

public class Ville {
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
	public String toString() {
		return  nomVille + " " + nbHabitant;
	}

}
