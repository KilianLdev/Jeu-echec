package echecgame;

import java.util.ArrayList;
import java.util.List;

public class Pion extends Pieces {
	
	public static Pion BLANC = new Pion(Couleur.BLANC);
	public static Pion NOIR = new Pion(Couleur.NOIR);
	
	protected Pion(Couleur couleur) {
		super(couleur);
		
	}

	@Override
	List<Coordonnees> deplacementsValides(Coordonnees origine)  {
		final List <Coordonnees> result = new ArrayList<>();
		
		final int lastY = getCouleur() == Couleur.BLANC ? 0 : 7;
		
		if(origine.getY() != lastY) {
			if(getCouleur() == Couleur.BLANC) {
				result.add(new Coordonnees(origine.getX(),origine.getY() + 1));
			} else if (getCouleur() == Couleur.NOIR) {
				result.add(new Coordonnees(origine.getX(), origine.getY() - 1));
			}
		}
		return result;
	}

}
