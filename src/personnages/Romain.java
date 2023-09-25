package personnages;

public class Romain {
	private String nom;
	private int force;
	private boolean estpositif() {
		return force>0;
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
		force -= forceCoup;
		if (force > 0) {
			parler("Aïe");
		} else {
			parler("J'abandonne...");
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