package fr.diginamic.testenumeration;

public enum Saison {
    PRINTEMPS("Printemps", 1),
    ETE("Ete", 2),
    AUTOMNE("Automne", 3),
    HIVER("Hiver", 4);
    
    private String libelle;
    private int numeroOrdre;
    
    private Saison(String libelle, int numeroOrdre) {
        this.libelle = libelle;
        this.numeroOrdre = numeroOrdre;
    }
    
    public String getLibelle() {
        return this.libelle;
    }
    
    public int getNumeroOrdre() {
        return this.numeroOrdre;
    }
    
    public static Saison getByLibelle(String libelle) {
        for (Saison saison : values()) {
            if (saison.getLibelle().equals(libelle)) {
                return saison;
            }
        }
        return null;
    }
}

