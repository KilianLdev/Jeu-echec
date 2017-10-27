package echecgame;

import java.util.List;
enum Couleur { BLANC, NOIR };

abstract public class Pieces {
	
	private final Couleur couleur;
	
	protected Pieces (Couleur couleur) {
		this.couleur = couleur;
	}
	
	protected boolean isInside(int x, int y) {
		
		return (x>=0 && x<8 && y>=0 && y<8);
	}
	
	abstract List<Coordonnees> deplacementsValides(Coordonnees origine);
	
	public Couleur getCouleur () {
		return couleur;
	}
	
	
}
