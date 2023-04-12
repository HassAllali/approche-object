package fr.diginamic.banque.entites;

public abstract class Operation {
	
	String dateOperation;
	private double montantOperation;
	
	Operation(String dateOperation, double montantOperation) {
		super();
		this.dateOperation = dateOperation;
		this.montantOperation = montantOperation;
	}
		 public abstract String getType();

		    public double getMontant() {
		        return montantOperation;
		    }

		    public String getDate() {
		        return dateOperation;
		    
	}

}
