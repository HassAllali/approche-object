package fr.diginamic.banque.entites;

public class Cercle implements ObjetGeometrique {
    private double rayon;

    public Cercle(double rayon) {
        this.rayon = rayon;
    }

    public double perimetre() {
        return 2 * Math.PI * rayon;
    }

    public double surface() {
        return Math.PI * rayon * rayon;
    }

	@Override
	public String toString() {
		return "Cercle rayon = " + rayon;
	}

}

