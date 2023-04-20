package Tri;
import java.util.ArrayList;
import java.util.List;

public class TestContinentAvecEnum {

		
		public static void main(String[] args) {
	        List<Ville> villes = new ArrayList<>();
	        villes.add(new Ville("New York", 8175133, Continent.AMERIQUE));
	        villes.add(new Ville("Paris", 2206488, Continent.EUROPE));
	        villes.add(new Ville("Pékin", 21700000, Continent.ASIE));
	        villes.add(new Ville("Moscou", 11979529, Continent.EUROPE));
	        villes.add(new Ville("Berlin", 3769495, Continent.EUROPE));
	        villes.add(new Ville("Sydney", 4627345, Continent.OCEANIE));
	        villes.add(new Ville("Sao Paulo", 12106920, Continent.AMERIQUE));
	        villes.add(new Ville("Dakar", 1146053, Continent.AFRIQUE));
	        
	        for (Ville ville : villes) {
	            System.out.println(ville.toString());
	        }
	    }
}
