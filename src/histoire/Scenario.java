//package histoire;
//
//import java.util.Iterator;
//
//import personnages.Druide;
//import personnages.Gaulois;
//import personnages.Romain;
//
//public class Scenario {
//
//	public static void main(String[] args) {
//		Gaulois asterix= new Gaulois("Ast�rix", 8);
//		Gaulois obelix= new Gaulois("Ob�lix", 25);
//		Romain minus=new Romain("Minus", 10);
//		Druide panoramix= new Druide("Panoramix",5,10);
//		panoramix.parler("Je vais aller pr�parer une potion..");
//		panoramix.preparerPotion();
//		panoramix.booster(obelix);
//		obelix.parler("Par B�l�nos, ce n'est pas juste !");
//		panoramix.booster(asterix);
//		asterix.parler("Bonjour � tous");
//		minus.parler("UN GAU .. UN GAUGAU");
//		for (int i = 0; i < 3; i++) {
//			asterix.frapper(minus);
//		}
//		
//		
//		
//
//	}
//
//}
package histoire;

import personnages.Druide;
import personnages.Equipement;
import personnages.Gaulois;
import personnages.Romain;
import villagegaulois.Musee;

public class Scenario {

	public static void main(String[] args) {
		Druide druide = new Druide("Panoramix", 5, 10);
		druide.parler("Je vais aller pr�parer une petite potion...");
		druide.preparerPotion();
		Gaulois obelix = new Gaulois("Ob�lix", 25);
		Gaulois asterix = new Gaulois("Ast�rix", 8);
		druide.booster(obelix);
		obelix.parler("Par B�l�nos, ce n'est pas juste !");
		druide.booster(asterix);
		asterix.parler("Bonjour");
		Romain minus = new Romain("Minus", 6);
		Romain milexcus = new Romain("Milexcus", 8);
		minus.sEquiper(Equipement.BOUCLIER);
		minus.sEquiper(Equipement.CASQUE);
		milexcus.sEquiper(Equipement.CASQUE);
		minus.parler("UN GAU... UN GAUGAU...");
		do {
			asterix.frapper(minus);
		} while (minus.getForce() > 0);
		milexcus.parler("UN GAU... UN GAUGAU...");
		do {
			asterix.frapper(milexcus);
		} while (milexcus.getForce() > 0);
		
//		Partie a decommenter
		
//		Musee musee = new Musee();
//		asterix.faireUneDonnation(musee);

	}

}