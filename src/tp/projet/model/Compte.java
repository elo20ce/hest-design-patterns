package tp.projet.model;

public class Compte {
	private long id;
	private long numeroCompte;
	private double solde;
	private TypeCompte typeCompte;
	private EtatCompte etat;
	
	public Compte(long id, long numeroCompte, double solde, TypeCompte typeCompte, EtatCompte etat) {
		this.id = id;
		this.numeroCompte = numeroCompte;
		this.solde = solde;
		this.typeCompte = typeCompte;
		this.etat = etat;
	}
	//constructeur par defaut
	public Compte() {
		
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getNumeroCompte() {
		return numeroCompte;
	}
	public void setNumeroCompte(long numeroCompte) {
		this.numeroCompte = numeroCompte;
	}
	public double getSolde() {
		return solde;
	}
	public void setSolde(double solde) {
		this.solde = solde;
	}
	public TypeCompte getTypeCompte() {
		return typeCompte;
	}
	public void setTypeCompte(TypeCompte typeCompte) {
		this.typeCompte = typeCompte;
	}
	public EtatCompte getEtat() {
		return etat;
	}
	public void setEtat(EtatCompte etat) {
		this.etat = etat;
	}
	@Override
	public String toString() {
		return "Compte [id=" + id + ", numeroCompte=" + numeroCompte + ", solde=" + solde + ", typeCompte=" + typeCompte
				+ ", etat=" + etat + "]";
	}
	
	public static class CompteBuilder{
		
		private Compte compte = new Compte();
		
		public CompteBuilder id(long id) {
			compte.id = id;
			return this;
		}
		public CompteBuilder numeroCompte(long numeroCompte) {
			compte.numeroCompte = numeroCompte;
			return this;
		}
		public CompteBuilder solde(double solde) {
			compte.solde = solde;
			return this;
		}
		public CompteBuilder typeCompte(TypeCompte typeCompte) {
			compte.typeCompte = typeCompte;
			return this;
		}
		public CompteBuilder etat(EtatCompte etat) {
			compte.etat = etat;
			return this;
		}
		public Compte build() {
			return this.compte;
		}
	}

}
