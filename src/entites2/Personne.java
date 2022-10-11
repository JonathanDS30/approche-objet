package entites2;

import entites.AdressePostale;

public class Personne {
	private String nom;
	private String prenom;
	public AdressePostale adressePostale;
	
	public Personne(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}
	
	public Personne (String nom, String prenom, AdressePostale adressePostale) {
		this.nom = nom;
		this.prenom = prenom;
		this.adressePostale= adressePostale;
	}
	
	public void identifiant() {
		System.out.println(nom + " " + prenom.toUpperCase());
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getPrenom() {
		return this.prenom;
	}
	
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	public AdressePostale getAdressePostale() {
		return adressePostale;
	}
	
	public void setAdressePostale(AdressePostale adressePostale) {
		this.adressePostale = adressePostale;
	}
	
}
