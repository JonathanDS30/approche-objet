package entites;

public class TestAdressePostale {

	public static void main(String[] args) {
		AdressePostale adr1 = new AdressePostale();
		adr1.numeroRue = 433;
		adr1.libelleRue = "des maréchaux";
		adr1.codePostal = 30000;
		adr1.ville = "Nîmes";
		AdressePostale adr2 = new AdressePostale();
		adr2.numeroRue = 212;
		adr2.libelleRue = "des catalognes";
		adr2.codePostal = 30000;
		adr2.ville ="Nîmes";
	}

}