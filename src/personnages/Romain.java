package personnages;

public class Romain {
	private static final int NB_EQUIPEMENTS=2;
	private String nom;
	private int force;
	private boolean estpositif() {
		return force>0;
	}
	private Equipement[] equipements= new Equipement[NB_EQUIPEMENTS];
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
		
	public void sEquiper(Equipement equipement) {
		switch (nbEquipement) {
		case 2:
			System.out.println("Le soldat "+nom+" est déjà bien protégé !");
			break;

		case 1:
			if (equipement.equals(equipement[0])) {
				System.out.println("Le soldat "+nom +"possède déjà un");
			} else {

			}
			break;
		default:
			break;
		}
		
	}
		
		
	}
	public static void main(String[] args) {
		Romain julius= new Romain("Julius", 6);
		System.out.println(julius.prendreParole());
		julius.parler("Ave moi !");
		System.out.println("Premier coup !");
		julius.recevoirCoup(9);
		System.out.println("Deuxième coup !");
		julius.recevoirCoup(2);
		}
}