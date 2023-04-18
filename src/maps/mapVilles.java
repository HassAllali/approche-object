package maps;
import java.util.HashMap;
import java.util.Map;
import fichier.Ville;


public class mapVilles {

	public static void main(String[] args) {
		
		
		Ville v1 = new Ville("Marseille", "13", "Bouches-du-Rhône", 344.000);
        Ville v2 = new Ville("Montpellier", "34", "Occitanie", 244.000);
        Ville v3 = new Ville("Nantes", "44", "Pays de la Loire", 600.000);
        Ville v4 = new Ville("Paris", "75", "Ile de France", 2258371.0);
		
		
		Map<String, Ville> mapVilles = new HashMap<>();
		
		mapVilles.put(v1.getNom(), v1);
		mapVilles.put(v2.getNom(), v2);
        mapVilles.put(v3.getNom(), v3);
        mapVilles.put(v4.getNom(), v4);
        
        System.out.println(mapVilles);
        int populationMin = Integer.MAX_VALUE;
        double villeMoinsHab = 0;
        String keyv = "";
        
        for(String name : mapVilles.keySet()) {
        	Ville v = mapVilles.get(name);
        	
        	if (v.getPopulationTotale() < populationMin ) {
        		villeMoinsHab = v.getPopulationTotale();
        		keyv = name; 
        		
        	}
        }
mapVilles.remove(keyv);
System.out.println(mapVilles);
System.out.println(mapVilles.size());

        
	}

}
