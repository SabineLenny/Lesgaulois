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
	
//	private boolean adiminue(int nvforce, int ancienneforce) {
//		
//		return nvforce<ancienneforce;
//	}
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
	
//	public void recevoirCoup(int forceCoup) {
//		assert estpositif();
//		int ancienneforce=force;
//		force -= forceCoup;
//		if (force > 0) {
//			parler("Aïe");
//		} else {
//			parler("J'abandonne...");
//		}
//		assert adiminue(force,ancienneforce);
//	}
	
	
	public Equipement[] recevoirCoup(int forceCoup) { 
		Equipement[] equipementEjecte = null; 
		// Precondition 
		assert force > 0;
		int oldForce = force;
		forceCoup = calculResistanceEquipement(forceCoup);
		force -= forceCoup;
		 if (force > 0) { 
			 parler("Aïe"); 
		 } else { 
			 equipementEjecte = ejecterEquipement(); 
			 parler("J'abandonne..."); 
		 } 
		
	 
	// post condition la force a diminuée
	assert force < oldForce;
	return equipementEjecte;
}
	private int calculResistanceEquipement(int forceCoup) {
		String texte;
		texte = "Ma force est  de " + this.force + ", et la force du coup est de " + forceCoup;
		int resistanceEquipement = 0;
		if ((nbEquipement != 0)) {
			texte += "\nMais heureusement, grace à mon équipement sa force est diminué de ";
			for (int i = 0; i < nbEquipement;i++) {
				if ((equipements[i] != null &&
				equipements[i].equals(Equipement.BOUCLIER)) == true) {
					resistanceEquipement += 8; 
					} else { 
						System.out.println("Equipement casque");
						resistanceEquipement += 5; 
						} 
				
			}
			texte += resistanceEquipement + "!"; 
		} parler(texte);
		forceCoup -= resistanceEquipement;
		return forceCoup; 
	}
	private Equipement[] ejecterEquipement() {
		Equipement[] equipementEjecte = new Equipement[nbEquipement];
		System.out.println("L'équipement de " + nom + " s'envole sous la force du coup.");
		int nbEquipementEjecte = 0; 
		for (int i = 0; i < nbEquipement; i++) {
			if (equipements[i] == null) {
				
				} else { 
					equipementEjecte[nbEquipementEjecte] = equipements[i];
					nbEquipementEjecte++;
					equipements[i] = null; 
				} 
			}
		return equipementEjecte; 
		}

	public void sEquiper(Equipement equipementamettre) {
		switch (nbEquipement) {
		case 2:
			System.out.println("Le soldat "+nom+" est déjà bien protégé !");
			break;

		case 1:
			if ((equipementamettre==equipements[0])) {
				System.out.println("Le soldat "+nom+" possède déjà un "+equipements[0]);
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
		equipements[0]=equipementamettre;
		nbEquipement++;
	}
		
		
	
	public static void main(String[] args) {
		Romain minus= new Romain("Minus", 7);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.BOUCLIER);
		minus.sEquiper(Equipement.CASQUE);
		}
	public int getForce() {
		
		return force;
	}
}