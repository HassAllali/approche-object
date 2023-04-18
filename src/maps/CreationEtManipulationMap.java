package maps;

import java.util.HashMap;
import java.util.Map;

public class CreationEtManipulationMap {

	public static void main(String[] args) {
		HashMap<Integer, String> mapVilles = new HashMap<>();
		mapVilles.put(13, "Marseille");
		mapVilles.put(34, "Montpellier");
		mapVilles.put(44, "Nantes");
		mapVilles.put(75, "Paris");
		mapVilles.put(31, "Toulouse");

		mapVilles.put(59, "Lille");
		mapVilles.put(69, "Lyon");
		mapVilles.put(33, "Bordeaux");
		
		System.out.println("Clé : ");
		for (Integer departement : mapVilles.keySet()) {
			System.out.println(departement);
		}
		
		System.out.println(" ");
		
		
		System.out.println("Valeurs : ");
		for (String ville : mapVilles.values()) {
			System.out.println(ville);
		}
		
		System.out.println(" ");
		
		
		System.out.println("La taille de la map est : " + mapVilles.size());


	}

}
