package fichier;

public class Ville {
	String nom;
	String codeDepartement;
	String nomRegion;
	int popuTotale;

	public Ville(String nom, String codeDepartement, String nomRegion, int popuTotale) {
		super();
		this.nom = nom;
		this.codeDepartement = codeDepartement;
		this.nomRegion = nomRegion;
		this.popuTotale = popuTotale;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getCodeDepartement() {
		return codeDepartement;
	}

	public void setCodeDepartement(String codeDepartement) {
		this.codeDepartement = codeDepartement;
	}

	public String getNomRegion() {
		return nomRegion;
	}

	public void setNomRegion(String nomRegion) {
		this.nomRegion = nomRegion;
	}

	public int getPopuTotale() {
		return popuTotale;
	}

	public void setPopuTotale(int popuTotale) {
		this.popuTotale = popuTotale;
	}

	@Override
	public String toString() {
		return nom + " " + codeDepartement + " " + nomRegion + " " + popuTotale;
	}

}
