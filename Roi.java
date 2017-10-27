package echecgame;

import java.util.List;
import java.util.ArrayList;
public class Roi extends Pieces {

	public static Roi BLANC = new Roi(Couleur.BLANC);
	public static Roi NOIR = new Roi(Couleur.NOIR);
	
	protected Roi(Couleur couleur) {
		super(couleur);
	}

	@Override
	List<Coordonnees> deplacementsValides(Coordonnees origine) {
		final List<Coordonnees> result = new ArrayList<>();
		
		checkPosition(origine.getX() - 1, origine.getY() - 1, result);
		checkPosition(origine.getX() - 1, origine.getY() + 1, result);
		checkPosition(origine.getX() - 1, origine.getY()    , result);
		checkPosition(origine.getX()    , origine.getY() - 1, result);
		checkPosition(origine.getX()    , origine.getY() + 1, result);
		checkPosition(origine.getX() + 1, origine.getY()    , result);
		checkPosition(origine.getX() + 1, origine.getY() - 1, result);
		checkPosition(origine.getX() + 1, origine.getY() + 1, result);
		
		return result;

	}

	
	private void checkPosition(int x, int y, List<Coordonnees> result) {
		if(isInside(x,y)) {
			result.add(new Coordonnees(x,y));
		}
	}

}
