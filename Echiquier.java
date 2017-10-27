package echecgame;

import java.util.List;

public class Echiquier {
		
			private Pieces [][] tableau =  { // new Pieces [8][8]; [y] [x]
					{Tour.NOIR,Cavalier.NOIR,Fou.NOIR,Roi.NOIR,Reine.NOIR,Fou.NOIR,Cavalier.NOIR,Tour.NOIR},
					{Pion.NOIR,Pion.NOIR,Pion.NOIR,Pion.NOIR,Pion.NOIR,Pion.NOIR,Pion.NOIR,Pion.NOIR,},
					{null,null,null,null,null,null,null,null},
					{null,null,null,null,null,null,null,null},
					{null,null,null,null,null,null,null,null},
					{null,null,null,null,null,null,null,null},
					{Pion.BLANC,Pion.BLANC,Pion.BLANC,Pion.BLANC,Pion.BLANC,Pion.BLANC,Pion.BLANC,Pion.BLANC,},
					{Tour.BLANC, Cavalier.BLANC, Fou.BLANC, Roi.BLANC, Reine.BLANC, Fou.BLANC, Cavalier.BLANC, Tour.BLANC}		
			};
			
			public Pieces getPieceEn(Coordonnees coordonnees) {
				return tableau [coordonnees.getY()][coordonnees.getX()];
			}
		public boolean moveTo(int x, int y,Coordonnees destination) {
			final Pieces pieceAbouger = getPieceEn(x, y);
			
			if (pieceAbouger == null) {
				return false;
			}
			List<Coordonnees> possibles = pieceAbouger.deplacementsValides(origine);
			
			//for (int i=0; i< possibles.size();i++) { Coordonnees actual = possibles.get(i);...}
			for(Coordonnees actual : possibles) {
				if (actual.equals(destination)) {
				// Le déplacement est valide	
				tableau[destination.getY()][destination.getX()] = pieceAbouger;
				tableau[origine.getY()][origine.getX()] = null;
				return true;
				}  else {
					return false;}
			} 
		}
			
			
		}
		
