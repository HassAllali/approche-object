package fr.diginamic.banque.entites;


public class Compte {
	
	private String numeroCompte;
	private double solde;
	
	Compte(String numeroCompte, double solde) {
		this.numeroCompte = numeroCompte;
		this.solde = solde;
	}
	

//    public String getNumero() {
//        return numero;
//    }
//
//    public double getSolde() {
//        return solde;
//    }
//
//    public void setSolde(double solde) {
//        this.solde = solde;
//    }

	@Override
	public String toString() {
		return "Votre numero de compte est " +  this.numeroCompte + ", et votre solde est " + solde;
	}

}
