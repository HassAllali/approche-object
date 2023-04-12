package fr.diginamic.banque.entites;
import fr.diginamic.banque.entites.*;

public class Credit extends Operation{
	
	Credit(String dateOperation, double montantOperation) {
		super(dateOperation, montantOperation);
		
	}
		@Override
	    public String getType() {
	        return "CREDIT";
	    }

}
