package listes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestListeInt {
    public static void main(String[] args) {
        List<Integer> liste = new ArrayList<Integer>();
        liste.add(-1);
        liste.add(5);
        liste.add(7);
        liste.add(3);
        liste.add(-2);
        liste.add(4);
        liste.add(8);
        liste.add(5);

        System.out.println("Elements de la liste : " + liste);

        System.out.println("Taille de la liste : " + liste.size());

        int max = Collections.max(liste);
        System.out.println("Le plus grand element de la liste est : " + max);

        int min = Collections.min(liste);
        liste.remove(Integer.valueOf(min));
        System.out.println("Liste apres suppression du plus petit element : " + liste);

        for (int i = 0; i < liste.size(); i++) {
            if (liste.get(i) < 0) {
                liste.set(i, -liste.get(i));
            }
        }
        System.out.println("Liste apres inversion des elements negatifs : " + liste);
    }
}
