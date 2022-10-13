package fr.diginamic.operations;

public class CalculMoyenne {
// Création de l'attribut d'instance de type tableau de double
	double[] tab = new double [0];
	double somme = 0.0;

// Constructeur
	public CalculMoyenne(double[] tab) {
		super();
		this.tab = tab;
	}

	public CalculMoyenne() {
		super();
	}

	// Création Méthode ajout
	public void ajout(double rajout) {
		double[] nvTab = new double[tab.length + 1];
		for (int i = 0; i < tab.length; i++) {
			nvTab[i] = tab[i];
			somme += nvTab[i];
		}
		nvTab[nvTab.length - 1] = rajout;
		this.tab = nvTab;
	}

	public double calcul() {
		double Moyenne = somme / tab.length;
		return Moyenne;
	}

}