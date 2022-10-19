package fr.diginamic.recensement;

public class Ville {
	int codeRegion;
	String nomRegion;
	String codeDepar;
	int codeCommune;
	String nomCommune;
	int popuTotale;

	public Ville(int codeRegion, String nomRegion, String codeDepar, int codeCommune, String nomCommune,int popuTotale) {
		super();
		this.codeRegion = codeRegion;
		this.nomRegion = nomRegion;
		this.codeDepar = codeDepar;
		this.codeCommune = codeCommune;
		this.nomCommune = nomCommune;
		this.popuTotale = popuTotale;
	}

	public int getCodeRegion() {
		return codeRegion;
	}

	public void setCodeRegion(int codeRegion) {
		this.codeRegion = codeRegion;
	}

	public String getNomRegion() {
		return nomRegion;
	}

	public void setNomRegion(String nomRegion) {
		this.nomRegion = nomRegion;
	}

	public String getCodeDepar() {
		return codeDepar;
	}

	public void setCodeDepar(String codeDepar) {
		this.codeDepar = codeDepar;
	}

	public int getCodeCommune() {
		return codeCommune;
	}

	public void setCodeCommune(int codeCommune) {
		this.codeCommune = codeCommune;
	}

	public String getNomCommune() {
		return nomCommune;
	}

	public void setNomCommune(String nomCommune) {
		this.nomCommune = nomCommune;
	}

	public int getPopuTotale() {
		return popuTotale;
	}

	public void setPopuTotale(int popuTotale) {
		this.popuTotale = popuTotale;
	}

	@Override
	public String toString() {
		return " "+ nomCommune;
	}
	
}
