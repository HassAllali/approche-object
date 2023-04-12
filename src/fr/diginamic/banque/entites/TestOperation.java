package fr.diginamic.banque.entites;
import fr.diginamic.banque.entites.*;


public class TestOperation {

	public static void main(String[] args) {

		Operation[] operations = {
                new Credit("18/01/1999", 1000),
                new Debit("18/01/2000", 200),
                new Credit("18/01/2001", 500),
                new Debit("18/01/2002", 3)
        };

        double montantGlobal = 0;

        for (Operation operation : operations) {
            System.out.println("Date : " + operation.getDate());
            System.out.println("Montant : " + operation.getMontant());
            System.out.println("Type : " + operation.getType());

            if (operation instanceof Credit) {
                montantGlobal += operation.getMontant();
            } else if (operation instanceof Debit) {
                montantGlobal -= operation.getMontant();
            }

            System.out.println();
        }

        System.out.println("Montant global : " + montantGlobal);
		
	}

}
