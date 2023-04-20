package fr.diginamic.testenumeration;

public class TestEnumeration {

    public static void main(String[] args) {
        for (Saison saison : Saison.values()) {
            System.out.println(saison.name() + " (" + saison.getLibelle() + ")");
        }
        
        String nom = "ETE";
        Saison saisonTrouvee = Saison.valueOf(nom);
        System.out.println("La saison avec le nom " + nom + " a pour libellé " + saisonTrouvee.getLibelle());
        
        String libelle = "Hiver";
        Saison saisonLibelle = Saison.getByLibelle(libelle);
        System.out.println("La saison avec le libellé " + libelle + " a pour numéro d'ordre " + saisonLibelle.getNumeroOrdre());
    }

}
