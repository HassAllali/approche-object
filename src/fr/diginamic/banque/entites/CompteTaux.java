package fr.diginamic.banque.entites;
import fr.diginamic.banque.entites.*;


public class CompteTaux extends Compte{
	
	private double tauxDeRemuneration;
	
	CompteTaux(String numeroCompte, double solde, double tauxDeRemuneration) {
		super(numeroCompte, solde);
		this.tauxDeRemuneration = tauxDeRemuneration;

	}

	public double getTauxDeRemuneration() {
		return tauxDeRemuneration;
	}

	public void setTauxDeRemuneration(double tauxDeRemuneration) {
		this.tauxDeRemuneration = tauxDeRemuneration;
	}

	@Override
	public String toString() {
		return   super.toString() +  " Taux De Remuneration = " + tauxDeRemuneration;
	}

	
	

}
