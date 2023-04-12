package fr.diginamic.banque.entites;
import fr.diginamic.banque.entites.*;

public class TestObjetGeometrique {

	public static void main(String[] args) {
		
		ObjetGeometrique tab[] = new ObjetGeometrique[2];
		tab[0] = new Cercle(3);
		tab[1] = new Rectangle(7, 3);

	
		for(ObjetGeometrique objet : tab) {
			System.out.println(objet);
			System.out.println("Perimetre : " + objet.perimetre());
			System.out.println("Surface : " + objet.surface());

		}
		

	}

}
