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

	@Override
	public boolean equals(Object obj) {
		// Si le test du if est passé alors obj est une ville 
		if (!(obj instanceof Ville)) {
			return false;
		}
		// Conversion obj en ville Solution CAST
		Ville autre =(Ville)obj; 
		
		// on compare le nom et le nombre d'habitant pour vérifier qu'ils sont égales 
		if (autre.getNomVille().equals(this.getNomVille()) && autre.getNbHabitant()==this.getNbHabitant()) {
			return true;
		}
		return false;
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
		return nomVille + " " + nbHabitant;
	}

}
