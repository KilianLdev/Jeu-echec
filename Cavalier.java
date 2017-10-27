package echecgame;

import java.util.List;
import java.util.ArrayList;

public  class Cavalier extends Pieces {

	public static Cavalier BLANC = new Cavalier(Couleur.BLANC);
	public static Cavalier NOIR = new Cavalier(Couleur.NOIR);
	
	protected Cavalier(Couleur couleur) {
		super(couleur);
	}

	@Override
	List<Coordonnees> deplacementsValides(Coordonnees origine) {
		final List<Coordonnees> result = new ArrayList<>();
		
		checkPosition(origine.getX() - 1, origine.getY() - 2, result);
		checkPosition(origine.getX() + 1, origine.getY() - 2, result);
		checkPosition(origine.getX() + 2, origine.getY() - 1, result);
		checkPosition(origine.getX() + 2, origine.getY() + 1, result);
		checkPosition(origine.getX() + 1, origine.getY() + 2, result);
		checkPosition(origine.getX() - 1, origine.getY() + 2, result);
		checkPosition(origine.getX() - 2, origine.getY() - 1, result);
		checkPosition(origine.getX() - 2, origine.getY() + 1, result);
		
		return result;
	}
	
	private void checkPosition(int x, int y, List<Coordonnees> result) {
		if(isInside(x,y)) {
			result.add(new Coordonnees(x,y));
		}
	}
}
