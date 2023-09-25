package personnages;

public class Village {
	private String nom;
	private Chef chef;
	private int nbVillageois=0;
	private Gaulois[] villageois;
	
	
	public Village(String nom,int nbVillageoisMaximum) {
		this.nom = nom;
		villageois= new Gaulois[nbVillageoisMaximum];
	}

	public void ajouterHabitant(Gaulois gaulois) {
		villageois[nbVillageois]=gaulois;
		nbVillageois+=1;
		
	}
	
	public Gaulois trouverHabitant(int numero) {
		return villageois[numero-1];
		
	}

	public void setChef(Chef chef) {
		this.chef = chef;
	}

	public Chef getChef() {
		return chef;
	}

	public String getNom() {
		return nom;
	}
	
	public void afficherVillageois() {
		System.out.println("Dans le village du chef "+chef.getNom()+" vivent les légendaires gaulois :");
		for (int i = 1; i <= nbVillageois; i++) {
			System.out.println("- "+trouverHabitant(i).getNom());
		}
	}
	
	public static void main(String[] args) {
		Village village= new Village("Village des Irréductibles",30);
//		Gaulois gaulois = village.trouverHabitant(30);
//		Index 30 out of bounds c'est parce qu'il ny'a pas 30 habitants
//	
	Chef abraracourcix= new Chef("abraracourcix",6,village);
	village.setChef(abraracourcix);
	Gaulois asterix=new Gaulois("Astérix",8);
	village.ajouterHabitant(asterix);
//	Gaulois gaulois= village.trouverHabitant(1);
//	System.out.println(gaulois);
//	Les instructions affichent les caractéristiques d'Astérix car c'est le gaulois de numéro  1
	Gaulois obelix=new Gaulois("Obélix",25);
	village.ajouterHabitant(obelix);
	village.afficherVillageois();
	
	}
}
