package bomberman.unser_tolles_bomberman;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Coordinater implements KeyListener {
	
	private Logic l;
	private int figX;					// x und y Positionen der Figur
	private int figY;
	private final int speed = 50; 		// Geschwindigkeit der Figur
		
	// Boolsche Werte für die Kollisionsabfrage 
	private boolean CollideLeft;
	private boolean CollideRight;
	private boolean CollideTop;
	private boolean CollideBottom;
	
	protected void setLogic(Logic lInit) {		// Logik-Setter
		this.l = lInit;
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		/* Bleibt erstmal leer, da dies eine Funktion höherer Ordnung ist und
		 * die meisten Steuereingaben über KeyPressed und KeyReleased besser 
		 * gestaltet werden können. */
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
		int id = e.getKeyCode();		//KeyCode des KeyEvents auslesen
		
		// Mittels KeyEvent prüfen, was für eine Taste gedrückt wurde
		switch (id) {
			case (KeyEvent.VK_W):
				if(!CollideTop) {
					figY += speed;
				}
				break;
			case (KeyEvent.VK_A):
				if(!CollideLeft) {
					figX -= speed;
				}
				break;
			case (KeyEvent.VK_S):
				if(!CollideBottom) {
					figY -= speed;
				}
				break;
			case (KeyEvent.VK_D):
				if(!CollideRight) {
					figX += speed;
				}
				break;
		}

	}

	@Override
	public void keyReleased(KeyEvent e) {
		
		int id = e.getKeyCode();		// KeyCode des KeyEvents auslesen
		
		// Mittel KeyEvent prüfen, was für eine Taste losgelassen wurde
		switch (id) {
			case (KeyEvent.VK_W):
				break;
			case (KeyEvent.VK_A):
				break;
			case (KeyEvent.VK_S):
				break;
			case (KeyEvent.VK_D):
				break;
			case (KeyEvent.VK_SPACE):
				break;
			case (KeyEvent.VK_ENTER):
				break;
			case (KeyEvent.VK_ESCAPE):
				break;
		}
	}
	
	protected void checkCollisions() {
		//TODO: Kollisionsverhütungsregeln entwickeln
	}
}
