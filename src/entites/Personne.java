package entites;

public class Personne {

	public String nom ;
	public String prenom;
	public AdressePostale adrpostale;
	
	
	Personne(String nvnom, String nvprenom, AdressePostale nvadrpostale){
		nom = nvnom;
		prenom = nvprenom;
		adrpostale = nvadrpostale; 
	
	}
	
	
	
	@Override
	public String toString() {
		return "Personne : nom=" + nom + ", prenom=" + prenom + ", adrpostale=" + adrpostale;
	}
}
