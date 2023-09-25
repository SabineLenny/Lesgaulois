package histoire;

import java.util.Iterator;

import personnages.Druide;
import personnages.Gaulois;
import personnages.Romain;

public class Scenario {

	public static void main(String[] args) {
		Gaulois asterix= new Gaulois("Astérix", 8);
		Gaulois obelix= new Gaulois("Obélix", 25);
		Romain minus=new Romain("Minus", 10);
		Druide panoramix= new Druide("Panoramix",5,10);
		panoramix.parler("Je vais aller préparer une potion..");
		panoramix.preparerPotion();
		panoramix.booster(obelix);
		obelix.parler("Par Bélénos, ce n'est pas juste !");
		panoramix.booster(asterix);
		asterix.parler("Bonjour à tous");
		minus.parler("UN GAU .. UN GAUGAU");
		for (int i = 0; i < 3; i++) {
			asterix.frapper(minus);
		}
		
		
		

	}

}
