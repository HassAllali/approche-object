package fr.diginamic.banque.entites;
import fr.diginamic.banque.entites.*;

public class Debit extends Operation{

	Debit(String dateOperation, double montantOperation) {
		super(dateOperation, montantOperation);

}
	 @Override
	    public String getType() {
	        return "DEBIT";
	    }
}
