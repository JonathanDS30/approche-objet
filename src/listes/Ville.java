package listes;

import fr.diginamic.testenumeration.Continent;

/**
 * javadoc test Ville.liste
 */
public class Ville {

	private String nomVille;
	private int nbHabitant;
	private Continent continent;

	public Ville(String nomVille, int nbHabitant) {
		super();
		this.nomVille = nomVille;
		this.nbHabitant = nbHabitant;
	}

	public Ville(String nomVille, int nbHabitant, Continent continent) {
		super();
		this.nomVille = nomVille;
		this.nbHabitant = nbHabitant;
		this.continent = continent;
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
		Ville autre = (Ville) obj;

		// on compare le nom et le nombre d'habitant pour vérifier qu'ils sont égales
		if (autre.getNomVille().equals(this.getNomVille()) && autre.getNbHabitant() == this.getNbHabitant()) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Nom de la ville : " + nomVille + " Sont nombre d'habitant : " + nbHabitant + " Sont continent : "
				+ continent;
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

	public Continent getContinent() {
		return continent;
	}

	public void setContinent(Continent continent) {
		this.continent = continent;
	}

}
