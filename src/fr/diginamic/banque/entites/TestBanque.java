package fr.diginamic.banque.entites;
import fr.diginamic.banque.entites.*;

public class TestBanque {

	public static void main(String[] args) {

		Compte mycompte = new Compte("N°15", 1.574864867418678697481967896);
		System.out.println(mycompte);
		
        Compte comptes[] = new Compte[2]; 
        comptes[0] = new Compte("N°15", 2);
        comptes[1] = new CompteTaux("N°15", 1.5748648674186787 , 0.02);
        
        for(int i=0; i<comptes.length; i++) {
        	System.out.println(comptes[i]);
        }

            }

	}


