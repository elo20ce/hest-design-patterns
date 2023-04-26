package tp.projet;

import tp.projet.model.Compte;
import tp.projet.model.EtatCompte;
import tp.projet.model.TypeCompte;

public class Main {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello my guys");
		
		Compte c1 = new Compte();
		
		c1.setId(1L);
		c1.setNumeroCompte(9876567);
		c1.setEtat(EtatCompte.COMPTE_ACTIF);
		c1.setSolde(50000000);
		c1.setTypeCompte(TypeCompte.COMPTE_EPARGNE);
		
		Compte c2 = new Compte(2L,65718765,7000000,TypeCompte.COMPTE_COURANT,EtatCompte.COMPTE_CREE);
		
		System.out.println(c1);
		System.out.println(c2);
	}

}
