package echecgame;

import java.util.ArrayList;
import java.util.List;

public class Reine extends Pieces{

	public static Reine BLANC = new Reine(Couleur.BLANC);
	public static Reine NOIR = new Reine(Couleur.NOIR);
	
	protected Reine(Couleur couleur) {
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
			checkPosition(origine.getX() - n, origine.getY()    , result);
			checkPosition(origine.getX() + n, origine.getY()    , result);
			checkPosition(origine.getX()    , origine.getY() - n, result);
			checkPosition(origine.getX()    , origine.getY() + n, result);
			}
		
		
		return result;
	}
	private void checkPosition(int x, int y, List<Coordonnees> result) {
		if(isInside(x,y)) {
			result.add(new Coordonnees(x,y));
		}
	}
	
}
