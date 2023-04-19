package Tri;

public class TestEquals {

	public static void main(String[] args) {
		
	        Ville ville1 = new Ville("Paris", 1000000);
	        Ville ville2 = new Ville("Paris", 1000000);
	        Ville ville3 = new Ville("Marseille", 900000);


	        System.out.println("Test avec equals :");
	        System.out.println("ville1.equals(ville2) : " + ville1.equals(ville2)); 
	        System.out.println("ville1.equals(ville3) : " + ville1.equals(ville3));


	        System.out.println("Test avec == :");
	        System.out.println("ville1 == ville2 : " + (ville1 == ville2)); 
	        System.out.println("ville1 == ville3 : " + (ville1 == ville3)); 


	        Ville ville4 = ville1;
	        System.out.println("ville1 == ville4 : " + (ville1 == ville4)); 
	    }

	}


