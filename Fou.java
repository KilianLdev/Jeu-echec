package echecgame;

import java.util.ArrayList;
import java.util.List;

public class Fou extends Pieces {

	public static Fou BLANC = new Fou(Couleur.BLANC);
	public static Fou NOIR = new Fou(Couleur.NOIR);
	
	protected Fou(Couleur couleur) {
		super(couleur);
	}

	@Override
	List<Coordonnees> deplacementsValides(Coordonnees origine) {
		final List<Coordonnees> result = new ArrayList<>();
		
		for(int n=0; n < 8 && n >= 0; n ++) {
			
			checkPosition(origine.getX() - n, origine.getY() - n, result);
			checkPosition(origine.getX() + n, origine.getY() + n, result);
			checkPosition(origine.getX() + n, origine.getY() - n, result);
			checkPosition(origine.getX() - n, origine.getY() + n, result);
		}
		
		
		
		return result;
	}
	private void checkPosition(int x, int y, List<Coordonnees> result) {
		if(isInside(x,y)) {
			result.add(new Coordonnees(x,y));
		}
	}
	
}
