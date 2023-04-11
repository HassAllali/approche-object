package entites;

public class TestPersonne {

	public static void main(String[] args) {

		
		AdressePostale ad1 = new AdressePostale(9, "La Rue", 34080, "Montpelleir"); 
		Personne pers1 = new Personne("Allali Bouirig", "Hassan", ad1);
		
		
		pers1.setPrenom("WEWE");
		pers1.setadrpostale(ad1);
		
		System.out.println(pers1.getNom());
		System.out.println(pers1.getPrenom());
		System.out.println(pers1.getAdresse());
		System.out.println(pers1.getPrenom());

//		pers1.nom = "Allali Bouirig";
//        pers1.prenom = "Hassan"; 
        
//        pers1.adrpostale = new AdressePostale();
//        
//        pers1.adrpostale.codePostal = 34080;
//        pers1.adrpostale.ville = "Montpellier";
//        pers1.adrpostale.numeroRue = 9;
//        pers1.adrpostale.libelleRue = "La Rue"; 
        
//        System.out.println(pers1); 
        
	}

}
