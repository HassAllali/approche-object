package entites;
import entites.AdressePostale;

public class TestAdressePostale {

	public static void main(String[] args) {

		AdressePostale ad1 = new AdressePostale(9, "La Rue", 34080, "Montpelleir"); 
		/*ad1.codePostal = 34080;
		ad1.numeroRue = 9; 
		ad1.ville = "Montpellier";
		ad1.libelleRue = "La Rue"; */
		System.out.println(ad1);
	}

}
