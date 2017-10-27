package echecgame;

public class Coordonnees {

	private final int x;
	private final int y;
	
	public Coordonnees(int x, int y) { 
		this.x = x;
		this.y = y;
	}
	
	public int getX() { return x; }
	public int getY() { return y; }
	
	public boolean equals (Object obj) {
		if(obj instanceof Coordonnees) {
			final Coordonnees coordonnees = (Coordonnees) obj;
			return ((this.x == coordonnees.x) && (this.y == coordonnees.y));
		} else {
			return false;
		}
	}
}
