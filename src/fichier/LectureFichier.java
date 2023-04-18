package fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class LectureFichier {

	public static void main(String[] args) throws IOException {
		
		ArrayList<Ville> villes = new ArrayList<Ville>();
		ArrayList<Ville> listes = new ArrayList<>();
		
		Path pathFile = Paths.get("C:\\Users\\allal\\Documents\\workspace-spring-tool-suite-4-4.18.0.RELEASE\\recensement.csv");
		List<String> lines = Files.readAllLines(pathFile, StandardCharsets.UTF_8);
		System.out.println(lines);
		
		for(int i=1; i<lines.size(); i++) {
			String[] token = lines.get(i).split(";");
			Ville laVille = new Ville(token[6],token[2],token[0],Double.parseDouble(token[7].replaceAll(" ", "")));
			
			
			if (laVille.getPopulationTotale() > 25000) {
                listes.add(laVille);
		
		}	
		}
		System.out.println(listes.size());
	
	
	ArrayList<String> fichierSortie = new ArrayList<>();
	
	for(int i=0; i<listes.size(); i++) {
		fichierSortie.add(listes.get(i).toString());
	}

	Path pathCible = Paths.get("C:\\Users\\allal\\Documents\\workspace-spring-tool-suite-4-4.18.0.RELEASE\\LeFichier.csv");
	Files.write(pathCible, fichierSortie);
	
	
}
}
