package entites;

public class AdressePostale {

	int numeroRue ;
	String libelleRue ;
	int codePostal ;
	String ville;
	
	AdressePostale(int nvnumero, String nvlib, int nvcode, String nvville){
		numeroRue = nvnumero;
		libelleRue = nvlib;
		codePostal = nvcode;
		ville = nvville; 
		
	}
	
	
	AdressePostale(){
		System.out.println("cocuou");
		System.out.println("le monde");
	}
	
	
	@Override
	public String toString() {
		return "AdressePostale : numeroRue=" + numeroRue + ", libelleRue=" + libelleRue + ", codePostal=" + codePostal
				+ ", ville=" + ville;
	} 
}
