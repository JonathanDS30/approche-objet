package entites;

public class AdressePostale {
	int numeroRue;
	String libelleRue;
	int codePostal;
	String ville;
	
	// Variable de classe i.e static
	
	public static String pays = "France";
	
	// TP 2 Constructeur

	public AdressePostale(int nvNumeroRue, String nvLibelleRue, int nvCodePostal, String nvVille) {
		numeroRue = nvNumeroRue;
		libelleRue = nvLibelleRue;
		codePostal = nvCodePostal;
		ville = nvVille;
	}
}
