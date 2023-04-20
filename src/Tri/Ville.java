package Tri;

import java.util.Objects;

public class Ville implements Comparable<Ville>{
    private String nom;
    private Integer nbHabitants;
    private Continent continent;
    
    public Ville(String nom, Integer nbHabitants, Continent continent) {
        this.nom = nom;
        this.nbHabitants = nbHabitants;
        this.continent = continent;
    }

    public Ville(String nom, Integer nbHabitants) {
        this.nom = nom;
        this.nbHabitants = nbHabitants;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Integer getNbHabitants() {
        return nbHabitants;
    }

    public void setNbHabitants(Integer nbHabitants) {
        this.nbHabitants = nbHabitants;
    }

	@Override
	public int compareTo(Ville o) {
		// TODO Auto-generated method stub
//		return this.nom.compareTo(o.getNom());
		return this.nbHabitants.compareTo(o.getNbHabitants());
	}

//	@Override
//	public String toString() {
//		return "Ville nom = " + nom + ", nbHabitants=" + nbHabitants;
//	}
	
	
	
	@Override
	public boolean equals(Object obj) {
	    if (this == obj) {
	        return true;
	    }
	    if (!(obj instanceof Ville)) {
	        return false;
	    }
	    Ville other = (Ville) obj;
	    return Objects.equals(nom, other.nom) && Objects.equals(nbHabitants, other.nbHabitants);
	}
	
	
	
	 public Continent getContinent() {
	        return continent;
	    }
	    
	    public void setContinent(Continent continent) {
	        this.continent = continent;
	    }
	    
	    public String toString() {
	        return nom + " (" + continent.getLibelle() + ")";
	    }
	}

	

