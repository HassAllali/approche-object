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
	
	public String getNom() {
		return this.nom;
	}
	
	public String getPrenom() {
		return prenom.toUpperCase();
	}
	
	public AdressePostale getAdresse() {
		return this.adrpostale;
	}
	
	public void setPrenom(String nvprenom) {
		prenom = nvprenom; 
	}
	
	public void setadrpostale(AdressePostale nvadrpostale) {
		adrpostale = nvadrpostale; 
	}
	
	
	

	@Override
	public String toString() {
		return "Personne : nom=" + nom + ", prenom=" + prenom + ", adrpostale=" + adrpostale;
	}
}
