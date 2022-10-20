package fr.diginamic.testenumeration;

public enum Continent {
	AFRIQUE("Afrique"),
	AMERIQUE("Amérique"),
	ASIE("Asie"),
	OCEANIE("Océanie"),
	EUROPE("Europe");
	
	private String libelle;
	
	Continent(String libelle) {
		this.libelle = libelle;
	}

	public String getLibelle() {
		return libelle;
	}
}
