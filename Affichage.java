package echecgame;

public class Affichage {
	public static void main (String[]args) {
		final Echiquier echiquier = new Echiquier();
		
		for (int y= 0; y < 8; y++) {
			String line="";
			
			for(int x= 0; x < 8; x++){
				final Pieces pieces =  echiquier.getPieceEn(new Coordonnees(x,y));
				String representation = (pieces == null) ? "--": asString(pieces);
				line = line + "" + representation;
			}
			System.out.println(line);
		}
	}
	private static String asString(Pieces pieces) {
		String p;
		String c = asString(pieces.getCouleur());
		if (pieces instanceof Pion){
			p ="P";
		}else if (pieces instanceof Roi){
			p="K";
		}else if (pieces instanceof Reine){
			p="Q";
		}else if (pieces instanceof Cavalier){
			p="C";
		}else if (pieces instanceof Tour){
			p="T";
		}else if (pieces instanceof Fou){
			p="F";
		}else {
			return null;
		}
		return p+c;
	}
	private static String asString(Couleur couleur) {
		return couleur == Couleur.BLANC ? "b" : "n";
	}
}
