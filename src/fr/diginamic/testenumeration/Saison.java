package fr.diginamic.testenumeration;

public enum Saison {
	PRINTEMPS("Printemps", 1), 
	ETE("Eté", 2), 
	AUTOMNE("Automne", 3), 
	HIVER("Hiver", 4);

	private String libelle;
	private int numOrdre;

	private Saison(String nomSaison, int numOrdre) {
		this.libelle = nomSaison;
		this.numOrdre = numOrdre;
	}

	public String getlibelle() {
		return libelle;
	}

	public int getNumOrdre() {
		return numOrdre;
	}
	
	public static Saison getSaison(String libelle) {
		String libelleFormat = libelle.toUpperCase();
		return valueOf(libelleFormat);
	}
	
}
