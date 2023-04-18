package maps;

import java.util.ArrayList;
import java.util.HashMap;

public class ComptagePaysParContinent {

	public static void main(String[] args) {
		ArrayList<Pays> paysList = new ArrayList<>();
		
		paysList.add(new Pays("France", 65000000, "Europe"));
		paysList.add(new Pays("Allemagne", 80000000, "Europe"));
		paysList.add(new Pays("Belgique", 10000000, "Europe"));
		paysList.add(new Pays("Russie", 150000000, "Asie"));
		paysList.add(new Pays("Chine", 1400000000, "Asie"));
		paysList.add(new Pays("Indonésie", 220000000, "Océanie"));
		paysList.add(new Pays("Australie", 20000000, "Océanie"));
		
		HashMap<String, Integer> comptageNbPays = new HashMap<>();
		
		for (Pays pays : paysList) {
			String continent = pays.getContinent();
			
			if (comptageNbPays.containsKey(continent)) {
				comptageNbPays.put(continent, comptageNbPays.get(continent) + 1);
			}else {
				comptageNbPays.put(continent, 1);
			}
		}
		
		System.out.println(comptageNbPays);
		
		
	}

}
