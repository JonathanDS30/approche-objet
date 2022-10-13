package fr.diginamic.entites;

public class Cercle {
	double rayon;

	static final double PI = Math.PI;

	public Cercle(double rayon) {
		super();
		this.rayon = rayon;
	}
	
	public String toString() {

		return "Voici le perimètre : " + calcPerim() + " et sa surface " + calcSurf();
	}

	public double getRayon() {
		return rayon;
	}

	public void setRayon(double rayon) {
		this.rayon = rayon;
	}

	public double calcPerim() {
		double calculPerim = 0.00;
		calculPerim = rayon * 2 * PI;
		return calculPerim;
	}

	public double calcSurf() {
		double calculSurf = 0.00;
		calculSurf = rayon * rayon * PI;
		return calculSurf;
	}


}
