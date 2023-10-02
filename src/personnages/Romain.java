package personnages;

public class Romain {
	private static final int NB_EQUIPEMENTS=2;
	private String nom;
	private int force;
	private boolean estpositif() {
		return force>0;
	}
	private Equipement[] equipementsduromain= new Equipement[NB_EQUIPEMENTS];
	private int nbEquipement=0;
	private boolean adiminue(int nvforce, int ancienneforce) {
		
		return nvforce<ancienneforce;
	}
	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
		
		assert estpositif();
	}
	public String getNom() {
		return nom;
	}
	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + " »");
	}
	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}
	
	public void recevoirCoup(int forceCoup) {
		assert estpositif();
		int ancienneforce=force;
		force -= forceCoup;
		if (force > 0) {
			parler("Aïe");
		} else {
			parler("J'abandonne...");
		}
		assert adiminue(force,ancienneforce);
	}
		
	public void sEquiper(Equipement equipementamettre) {
		switch (nbEquipement) {
		case 2:
			System.out.println("Le soldat "+nom+" est déjà bien protégé !");
			break;

		case 1:
			if ((equipementamettre==equipementsduromain[0])) {
				System.out.println("Le soldat "+nom+" possède déjà un "+equipementsduromain[0]);
				break;
			} else {
				equipeobjet(equipementamettre);
				break;
			}
		case 0:
			equipeobjet(equipementamettre);
			break;

			
		default:
			break;
		}
		
	}
	private void equipeobjet(Equipement equipementamettre) {
		System.out.println("Le soldat "+nom+" s'équipe avec un "+equipementamettre);
		equipementsduromain[0]=equipementamettre;
		nbEquipement++;
	}
		
		
	
	public static void main(String[] args) {
		Romain minus= new Romain("Minus", 7);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.BOUCLIER);
		minus.sEquiper(Equipement.CASQUE);
		}
}