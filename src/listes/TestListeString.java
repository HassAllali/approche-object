package listes;

import java.util.ArrayList;
import java.util.List;

public class TestListeString {
    public static void main(String[] args) {
        List<String> villes = new ArrayList<String>();
        villes.add("Nice");
        villes.add("Carcassonne");
        villes.add("Narbonne");
        villes.add("Lyon");
        villes.add("Foix");
        villes.add("Pau");
        villes.add("Marseille");
        villes.add("Tarbes");

        
        String plusLongue = "";
        for (String ville : villes) {
            if (ville.length() > plusLongue.length()) {
                plusLongue = ville;
            }
        }
        System.out.println("La ville avec le plus grand nombre de lettres est : " + plusLongue);

        
        for (int i = 0; i < villes.size(); i++) {
            villes.set(i, villes.get(i).toUpperCase());
        }
        System.out.println("Liste des villes en majuscules : " + villes);

      
        villes.removeIf(v -> v.startsWith("N"));
        System.out.println("Liste des villes après suppression des villes commençant par la lettre N : " + villes);
    }
}
