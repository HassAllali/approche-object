package listes;
import java.util.ArrayList;

public class TestVille {
    public static void main(String[] args) {
        ArrayList<Ville> villes = new ArrayList<Ville>();
        villes.add(new Ville("Nice", 343000));
        villes.add(new Ville("Carcassonne", 47800));
        villes.add(new Ville("Narbonne", 53400));
        villes.add(new Ville("Lyon", 484000));
        villes.add(new Ville("Foix", 9700));
        villes.add(new Ville("Pau", 77200));
        villes.add(new Ville("Marseille", 850700));
        villes.add(new Ville("Tarbes", 40600));
        
        
        Ville plusPeuplee = villes.get(0);
        for (Ville v : villes) {
            if (v.getNbHabitants() > plusPeuplee.getNbHabitants()) {
                plusPeuplee = v;
            }
        }
        System.out.println("La ville la plus peuplée est " + plusPeuplee.getNom());
        
        
        Ville moinsPeuplee = villes.get(0);
        for (Ville v : villes) {
            if (v.getNbHabitants() < moinsPeuplee.getNbHabitants()) {
                moinsPeuplee = v;
            }
        }
        villes.remove(moinsPeuplee);
        
       
        for (Ville v : villes) {
            if (v.getNbHabitants() > 100000) {
                v.setNom(v.getNom().toUpperCase());
            }
        }
        

        for (Ville v : villes) {
            System.out.println(v.getNom() + " - " + v.getNbHabitants() + " hab.");
        }
    }
}

